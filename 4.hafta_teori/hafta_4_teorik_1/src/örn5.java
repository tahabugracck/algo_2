import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class örn5 {

    public static void main(String[] args) {
        File dosya = new File("sayilar.txt");//dosya değişkeni ile dosya yolunu tut
        PrintWriter p;//yazma işlemi için nesne tanımla
        try {
            if (!dosya.exists())//dosya yok ise

                dosya.createNewFile(); //oluştur
            else
                System.out.println("Dosya mevcut");

            p = new PrintWriter(dosya);//yazılacak dosya yolunu PrintWriter'a girilmesi
            for (int i = 0; i < 10; i++) {
                int sayi = (int) (Math.random() * 20);
                p.println(sayi);//dosyaya yaz
            }
            p.close();//dosyayı kapat

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı" + e);

        } catch (IOException e) {
            System.out.println("Yol bulunamadı" + e);
        }
    }
}
