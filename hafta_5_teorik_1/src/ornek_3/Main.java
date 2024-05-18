package ornek_3;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        do {
            System.out.println("İsminiz:");
            String isim = klavye.nextLine();
            System.out.print("Vize ve final bilgileriniz (sırasıyla): ");
            int v = klavye.nextInt();
            int f = klavye.nextInt();
            yaz("ogrenci.txt", isim, v, f);
            System.out.print("Devam etmek istiyor musunuz? (0/1): ");
            int secenek = klavye.nextInt();
            if (secenek == 0) {
                break; // Döngüyü sonlandır
            }
            klavye.nextLine(); // Buffer temizleme
        } while (true);
        klavye.close();

        // Dosyadan okuma işlemi
        oku("ogrenci.txt");
    }

    public static void yaz(String dosya, String isim, int v, int f) {
        try (PrintWriter p = new PrintWriter(new FileOutputStream(dosya, true))) {
            p.print(isim + "\t");
            p.println(v + "\t" + f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void oku(String dosyaAdi) {
        File dosya = new File(dosyaAdi);
        if (!dosya.exists()) {
            System.out.println("Dosya bulunamadı.");
        } else {
            try (Scanner oku = new Scanner(dosya)) {
                while (oku.hasNextLine()) {
                    String okunan = oku.nextLine();
                    System.out.println(okunan);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
