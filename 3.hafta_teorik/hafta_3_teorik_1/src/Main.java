public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 7, 2, 8};
        int[] minMax = findMinMax(numbers);
        System.out.println("Dizinin en küçük elemanı: " + minMax[0]);
        System.out.println("Dizinin en büyük elemanı: " + minMax[1]);


        System.out.println("----------------------------");


        int sayi1 = 24;
        int sayi2 = 36;
        int sonuc = ebob(sayi1, sayi2);
        System.out.println("EBOB(" + sayi1 + ", " + sayi2 + ") = " + sonuc);


        System.out.println("----------------------------");


        int a = 24;
        int b = 36;
        int sonuc2 = ebobRecursive(a, b); // Method isimleri farklı olduğu için ebob2'yi çağırıyoruz
        System.out.println("EBOB2(" + a + ", " + b + ") = " + sonuc2); // Ayrıca sonuc2 değişkenini kullanıyoruz


        System.out.println("----------------------------");

        int n = 5;
        System.out.println("topSeri(" + n + "): " + topSeri(n));
        System.out.println("topSeri2(" + n + "): " + topSeri2(n));
        System.out.println("topSeri3(" + n + "): " + topSeri3(n, 1));


        System.out.println("----------------------------");

        int number = 123456789;
        System.out.println("Girilen sayının tersi: ");
        reverseNumber(number);


        System.out.println("----------------------------");


        String str = "Merhaba";
        System.out.println("Tersine yazılmış string: " + reverseString(str));


        System.out.println("----------------------------");


        yazdır("buğra", 10);


        System.out.println("----------------------------");


        String str2 = "Merhaba dünya!";
        char karakter = 'a';

        int tekrarSayisi = tekrarSayisiniBul(str2, karakter);
        System.out.println("'" + karakter + "' karakteri " + str2 + " içinde " + tekrarSayisi + " kez tekrar ediyor.");

        int tekrarSayisi2 = tekrarSayisiniBul2(str2, karakter, 0);
        System.out.println("'" + karakter + "' karakteri " + str2 + " içinde " + tekrarSayisi2 + " kez tekrar ediyor.");
    }


    //kendisine parametre olarak verilen bir dizinin en büyük ve en küçük elemanını bulma
    static int[] findMinMax(int[] d) {
        int[] indis = new int[4];
        indis[0] = d[0];
        indis[1] = d[0];
        indis[2] = 0;
        indis[3] = 0;

        for (int i = 1; i < d.length; i++) {
            if (d[i] < indis[0]) {
                indis[0] = d[i];
                indis[2] = i;
            } else if (d[i] > indis[1]) {
                indis[1] = d[i];
                indis[3] = i;
            }
        }
        return indis;
    }


    //kendisine parametre olarak gelen 2 sayının ebobu'nu bulma
    //1. yol
    public static int ebob(int m, int n) {
        if (m < n) {
            int ara = m;
            m = n;
            n = ara;
        }
        while (n > 0) {
            int ara = n;
            n = m % n;
            m = ara;
        }
        return m;
    }

    //2.yol
    public static int ebobRecursive(int m, int n) {
        if (m < n) {
            int ara = m;
            m = n;
            n = ara;
        }
        if (m % n == 0) {
            return n;
        } else {
            return ebobRecursive(n, m % n); // Method ismi düzeltiliyor
        }
    }


    //m(İ) serisi 1/3,2/5....,i/2i+1 şeklinde giden serinin toplamını yaz
    public static double topSeri(int i) {
        double toplam = 0;
        for (int j = 1; j <= i; j++) {
            toplam = toplam + (double)j / (2 * j + 1); // Kesir işlemini doğru şekilde yapmak için double tür dönüşümü ekleniyor
        }
        return toplam;
    }

    public static double topSeri2(int i) {
        if (i == 0) {
            return 0;
        } else {
            return (double)i / (2 * i + 1) + topSeri2(i - 1); // Negatif işaret kullanmadan pozitif olarak toplamalısınız
        }
    }

    public static double topSeri3(int i, int sayac) {
        if (sayac > i) {
            return 0; // Eğer sayaç, i'yi geçerse 0 döndür
        } else {
            return (double)sayac / (2 * sayac + 1) + topSeri3(i, sayac + 1); // sayaç'ı artırmalısınız
        }
    }

    //kendisine parametre olarak verilen sayıyı tersten yazan rekürsif metotlu kodu yaz
    public static void reverseNumber(int num) {
        if (num < 10) {
            System.out.print(num); // Tek basamaklı sayıyı yazdır
        } else {
            System.out.print(num % 10); // Son basamağı yazdır
            reverseNumber(num / 10); // Geri kalanı tersine çevirerek işlemi tekrarla
        }
    }


    //kendisine parametre olarak verilen stringi tersten yazdıran rekürsif metotlu kod
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    //adınını 10 kere ekrana yazdıran kodu rekürsif metot ile çöz
    public static void yazdır (String ad, int kalan){
        if (kalan == 0){
            return;
        }
        System.out.println(ad);
        yazdır(ad,kalan-1);
    }

    //kendisine parametre olarak bir string alan ve karakter alan verilen karakterin stringde kaç kez tekrar ettiğini bulan metot
    //1.yol
    public static int tekrarSayisiniBul(String s, char c){
        int sayac = 0;
        for (int i = 0; i<s.length();i++){
            if (s.charAt(i) == c){
                sayac++;
            }
        }
        return sayac;
    }
    //2. yol
    public static int tekrarSayisiniBul2(String str, char chr, int i){
        if (i == str.length()){
            return 0;
        }
        return (str.charAt(i) == chr ? 1 : 0) + tekrarSayisiniBul2(str, chr, i+1);
    }
}
