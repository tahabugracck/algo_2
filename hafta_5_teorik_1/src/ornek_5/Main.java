package ornek_5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        File dosya1 = new File("sayilar1.txt");
        PrintWriter p;

        try {
            p = new PrintWriter(new FileOutputStream(dosya1));
            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                int elemansay = r.nextInt(16) + 5; // 5 ile 20 arasında rastgele bir elemansayı üret
                for (int j = 0; j < elemansay; j++) {
                    p.print(r.nextInt(100) + " ");
                }
                p.println(); // Her satır sonunda yeni satır ekle
            }
            p.close();
            System.out.println("Rastgele sayılar dosyaya yazıldı: sayilar.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
