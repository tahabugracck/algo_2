import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        // Palindrom kontrolü
        System.out.println("Kelime giriniz:");
        String kelime = klavye.nextLine();
        if (isPalindrom2(kelime)) {
            System.out.println(kelime + " kelimesi bir palindromdur");
        } else {
            System.out.println(kelime + " kelimesi palindrom değildir");
        }

        System.out.println("----------------------");

        // Dizi toplamı
        int[] dizi = {1, 2, 3, 4, 5};
        int toplam = diziToplam(dizi, 0);
        System.out.println("Dizinin toplamı: " + toplam);

        System.out.println("----------------------");

        // Hayvan sayısı tahmini
        System.out.println("Hayvan sayısı tahmini:");
        int sayi = klavye.nextInt();
        hayvanSayisiTahmini(sayi);

        System.out.println("----------------------");

        // Onaltılı tabanda yazma
        System.out.println("Onaltılı tabanda yazma:");
        int onaltılı = klavye.nextInt();
        System.out.println(onaltılı + " sayısının onaltılı tabanda karşılığı: " + onAltılıTabandaYaz(onaltılı));

        System.out.println("----------------------");

        // İkinin kuvveti
        System.out.println("İkinin kuvveti:");
        int ikisayi = klavye.nextInt();
        System.out.println(ikisayi + " sayısının ikisinin kuvveti karşılığı: " + ikininKuvveti(ikisayi));

        System.out.println("----------------------");

        // Sayının rakamları toplamı
        System.out.println("Sayının rakamları toplamı:");
        int rakamli = klavye.nextInt();
        System.out.println("Sayının rakamları toplamı: " + rakamTopla(rakamli));

        System.out.println("----------------------");

        // Büyük harf sayısı
        System.out.println("Büyük harf sayısı:");
        String buyukharf = klavye.next();
        System.out.println("Büyük harf sayısı: " + buyukHarfSayisi(buyukharf));
    }

    public static boolean isPalindrom2(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int diziToplam(int[] dizi, int index) {
        if (dizi == null || index < 0 || index >= dizi.length)
            return 0;

        if (index == dizi.length - 1)
            return dizi[index];
        return dizi[index] + diziToplam(dizi, index + 1);
    }

    public static void hayvanSayisiTahmini(int sayi) {
        for (int i = 1; i < sayi; i++) {
            for (int j = 1; j < sayi; j++) {
                for (int k = 1; k < sayi; k++) {
                    if (2 * i + 4 * j + 4 * k == sayi) {
                        System.out.println(i + " , " + j + " , " + k);
                    }
                }
            }
        }
    }

    public static String onAltılıTabandaYaz(int sayi) {
        String s = "";
        while (sayi > 0) {
            int kalan = sayi % 16;
            char kalanChar = (kalan < 10) ? (char) ('0' + kalan) : (char) ('A' + (kalan - 10));
            s = kalanChar + s;
            sayi /= 16;
        }
        return s;
    }

    public static String ikininKuvveti(int sayi) {
        String S = "";
        while (sayi > 0) {
            int i = 0,
                    ikikuvvet = i;
            while (true) {
                ikikuvvet = 2 * ikikuvvet;
                if (ikikuvvet > sayi) {
                    ikikuvvet = ikikuvvet / 2;
                    break;
                }
                i++;
            }
            S = S + "2^" + i + "i";
            sayi = sayi - ikikuvvet;
        }
        return S;
    }

    public static int rakamTopla(int sayi) {
        if (sayi == 0)
            return 0;
        else
            return sayi % 10 + rakamTopla(sayi / 10);
    }

    public static int buyukHarfSayisi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
