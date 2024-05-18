package ornek_2;

import java.io.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File dosya = new File("sayilar.txt");
        PrintWriter p;
        try {
            p = new PrintWriter(new FileOutputStream(dosya, true));
            Random random = new Random();
            for (int i = 0; i < 20; i++){
                p.println(random.nextInt(100));
                p.close();
                FileInputStream fileInputStream = new FileInputStream(dosya);
                int dosyaBoyutu = (int)dosya.length();
                System.out.println(dosyaBoyutu);
                byte []b = new byte[dosyaBoyutu];
                fileInputStream.read(b);
                for (int j = 0; j < b.length; j++){
                    System.out.println(b[j] + " ");
                }
                System.out.println("");
                fileInputStream.close();
            }
        }catch (Exception e){

        }
    }
}
