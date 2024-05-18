package ornek_4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        File dosya = new File("sayilar.txt");
        PrintWriter p;

        try {
            p = new PrintWriter(new FileOutputStream(dosya, false));

            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                int sayi = r.nextInt(100); // 0 ile 99 arasında rastgele bir sayı üret
                p.println(sayi);
            }

            p.close();
            System.out.println("Rastgele sayılar dosyaya yazıldı: sayilar.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
