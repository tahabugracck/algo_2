import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File dosya = new File("sayılar.txt");

        try {
            if (!dosya.exists()) {
                dosya.createNewFile();
                System.out.println("Dosya başarıyla oluşturuldu.");
            }

            System.out.println("Dosyanın boyutu : " + dosya.length());
            System.out.println("Dosyanın adı : " + dosya.getName());
            System.out.println("Dosyanın yolu : " + dosya.getPath());
            System.out.println("Dosyanın tam yolu : " + dosya.getAbsolutePath());
            System.out.println("Dosya okunabilir mi? Yazılabilir mi? : " + dosya.canRead() + " / " + dosya.canWrite());
        } catch (IOException e) {
            System.out.println("Dosya oluşturma hatası: " + e.getMessage());
        }


        Scanner scanner = new Scanner(System.in);
        File klasor;
        String dosya1 = "C:\\Users\\tahab\\IdeaProjects";
        int secim;

        do {
            System.out.println("1 = DOSYA EKLE");
            System.out.println("2 = DOSYA SİL");
            System.out.println("3 = DOSYA LİSTELE");
            System.out.println("4 = ÇIKIŞ");
            System.out.println("SEÇİMİNİZ HANGİSİ : (1 | 2 | 3 | 4)");
            secim = scanner.nextInt();
            scanner.nextLine(); // Önceki girişi temizle

            if (secim == 1) {
                System.out.println("Dosya adını gir:");
                String ad = scanner.nextLine();
                try {
                    klasor = new File(dosya + ad + ".txt");
                    if (!klasor.exists()) {
                        if (klasor.createNewFile()) {
                            System.out.println("Dosya oluşturuldu");
                        } else {
                            System.out.println("Dosya oluşturma hatası");
                        }
                    } else {
                        System.out.println("Bu dosya zaten var");
                    }
                } catch (Exception e) {
                    System.out.println("Dosya oluşturma hatası: " + e.getMessage());
                }
            } else if (secim == 2) {
                System.out.println("Silinecek dosya adı:");
                String dosyaAdi = scanner.nextLine();
                klasor = new File(dosya1 + dosyaAdi + ".txt");
                if (klasor.exists()) {
                    if (klasor.delete()) {
                        System.out.println("Dosya silindi");
                    } else {
                        System.out.println("Dosya silme hatası");
                    }
                } else {
                    System.out.println("Bu dosya bulunamadı");
                }
            } else if (secim == 3) {
                klasor = new File(dosya1);
                File[] liste = klasor.listFiles();
                if (liste != null && liste.length > 0) {
                    System.out.println("Dosyalar:");
                    for (File file : liste) {
                        if (file.isFile()) {
                            System.out.println(file.getName());
                        }
                    }
                } else {
                    System.out.println("Klasör boş");
                }
            } else if (secim == 4) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else {
                System.out.println("Yanlış seçim yaptınız");
            }
        } while (true);

        scanner.close();




    }
}
