
import java.io.*;

public class dosyaYonetimi {

    public static void main(String[] args) {
        File dosya = new File("deneme.txt");//  ("c:\\dosyam\\deneme.txt") bu şekilde dosyanın içinde oluşturuyor
        try {
            if (!dosya.exists()) {
                dosya.createNewFile();
                System.out.println(dosya.getName() + " dosyası" + dosya.getAbsolutePath() + " yoluyla oluşturuldu");
            }
            else {
                System.out.println("Dosya mevcut");
                System.out.println("Dosya adı:" + dosya.getName());
                System.out.println("Dosya yolu:" + dosya.getPath());
                System.out.println("Dosyanın tam yolu:" + dosya.getAbsolutePath());
                System.out.println("Dosya mı?" + dosya.isFile());
                System.out.println("Gizli dosya mı?" + dosya.isHidden());
                System.out.println("Okunabilir mi?" + dosya.canRead());
                System.out.println("Klasör mü?" + dosya.isDirectory());
            }
        } catch (IOException e) {
            System.out.println("İstisna oluştu" + e.getMessage());
        }
    }
}


