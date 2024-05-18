import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //bir dizi tanımla ve elemanları rekürsif metodu ile toplamını bul

        int dizi[] = {1, 3, 5};
        int toplam = toplam(dizi, dizi.length - 1);
        System.out.println("toplam : " + toplam);

        System.out.println("------------------------------------");

        //girdiğimiz dizideki en büyük elemanı döndüren metot
        int[] exampleArray = {1, 5, 10, 30, 20, 13};
        int max = findMax(exampleArray, 0);
        System.out.println("Max: " + max);

        System.out.println("------------------------------------");

        //obeb bulurken öklit uyguamasını kullanma
        int sayı1 = 24;
        int sayı2 = 18;
        int obeb = obebBul(sayı1, sayı2);
        System.out.println("obeb : " + obeb);

        System.out.println("------------------------------------");

        //bir tane sayı alın ve bunu binarye çevirin
        Scanner klavye = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int number = klavye.nextInt();
        String binary = binary(number);
        System.out.println(number + " sayısının binary karşılığı: " + binary);

    }

    //bir dizi tanımla ve elemanları rekürsif metodu ile toplamını bu
    public static int toplam(int dizi[], int n) {
        if (n == 0) {
            return dizi[0];
        } else {
            return dizi[n] + toplam(dizi, n - 1);
        }

    }

    //girdiğimiz dizideki en büyük elemanı döndüren metot
    public static int findMax(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }

        int element = array[index];
        int next = findMax(array, index + 1);

        if (element > next) {
            return element;
        } else {
            return next;
        }

    }

    //obeb bulurken öklit uyguamasını kullanma
    public static int obebBul(int sayı1, int sayı2) {
        if (sayı2 == 0) {
            return sayı1;
        } else return obebBul(sayı2, sayı1 % sayı2);
    }

    //bir tane sayı alın ve bu sayıyı binarye çeviren rekürsif metot yaz
    public static String binary(int number) {
        if (number == 0) {
            return "0";
        } else if (number == 1) {
            return "1";
        } else {
            int mod = number % 2;
            int böl = number / 2;
            return binary(böl) + mod;


        }
    }
}