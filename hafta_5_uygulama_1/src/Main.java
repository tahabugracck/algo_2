import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            int toplam = 0, sayac = 0;
            File file = new File("sayılar.txt");
            System.out.println("path : " + file.getAbsolutePath());
            scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int sayi = scanner.nextInt();
                System.out.print(sayi + " ");
                toplam += sayi;

            }
            double ort = (double) toplam / sayac;
            System.out.println("\n");
            System.out.println("toplam : " + toplam);
            System.out.println("ortalama : " + ort);

        } catch (Exception e) {
            System.out.println("hata : " + e);
        }
    }
}
