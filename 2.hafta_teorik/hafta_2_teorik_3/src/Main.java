import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //DİZİDE GİRİLEN SAYI VAR MI YOK MU BULMA
        System.out.print("Dizinin uzunluğunu giriniz: ");

        int n = scanner.nextInt();
        int[] dizi = new int[n]; // Diziyi tanımla ve boyutunu belirle
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            dizi[i] = scanner.nextInt(); // Dizi elemanlarını oku ve diziye ekle
        }
        System.out.print("Aranacak sayıyı giriniz: ");
        int aranan = scanner.nextInt();

        boolean sonuc = bul(dizi, aranan);

        if (sonuc) {
            System.out.println("Aranan sayı dizi içinde bulunmaktadır.");
        } else {
            System.out.println("Aranan sayı dizi içinde bulunmamaktadır.");
        }
    }
    public static boolean bul(int[] dizi, int aranan) {
        for (int sayı : dizi) {
            if (sayı == aranan) {
                return true;
            }
        }
        return false;
    }
}
