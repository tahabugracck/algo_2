import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class örn7 {

    public static void main(String[] args) {
        File dosya = new File("sayilar2.txt");//dosya değişkeni ile dosya yolunu tut
        PrintWriter p;//yazma işlemi için nesne tanımla
        try {
            if (!dosya.exists())
                dosya.createNewFile();
            else
                System.out.println("Dosya mevcut");
            p = new PrintWriter(new FileOutputStream(dosya, true));
            for (int i = 0; i < 10; i++) {
                int sayac = (int) (Math.random() * 7) + 1; //1 ekleyerek 1 ile 7 arasında rastgele bir tamsayı oluşturulur
                for (int j = 0; j < sayac; j++) {
                    int sayi = (int) (Math.random() * 30);
                    p.print(sayi + " ");
                }
                p.println();//alt satıra geçsin
            }
            p.close(); //p.close yazılmazsa dosya hafızada açık kalır
        } catch (Exception e) {
        }
    }
}
