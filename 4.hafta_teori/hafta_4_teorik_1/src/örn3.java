import java.io.File;

public class örn3 {

    public static void main(String[] args) {
        File dosya = new File("c:\\dosyam\\");
        File[] dosyalar = dosya.listFiles();   // String[] dosyalar = dosya.list();
        for (int i = 0; i < dosyalar.length; i++) {
            System.out.println(dosyalar[i].getName() + "-->" + dosyalar[i].getAbsolutePath());   // System.out.println(dosyalar[i]);
        }
    }
}
