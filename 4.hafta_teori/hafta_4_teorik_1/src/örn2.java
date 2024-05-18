import java.io.File;
import java.io.IOException;

public class örn2 {

    public static void main(String[] args) {
        String klasor = "c:\\dosyam\\";
        File dosya;
        try {
            for (int i = 0; i < 10; i++) {
                dosya = new File(klasor + i + ".txt");
                if (!dosya.exists()) {
                    dosya.createNewFile();
                    System.out.println(dosya.getName() + " isimli dosya oluşturuldu");
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya yolu hatası: " + e.getMessage());
        }

    }
}
