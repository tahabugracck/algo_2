import java.io.File;
import java.util.Scanner;

public class örn4 {

    public static void main(String[] args) {
        File dosya = new File("c:\\dosyam\\");
        File[] dosyalar = dosya.listFiles();
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < dosyalar.length; i++) {
            File d = dosyalar[i];
            System.out.println(d.getName() + " isimli dosyayı silmek ister misiniz?");
            char cevap = k.next().charAt(0);
            if (cevap == 'e' || cevap == 'E') {
                d.delete();
                System.out.println(d.getName() + "isimli dosya silindi");
            }
        }
    }
}