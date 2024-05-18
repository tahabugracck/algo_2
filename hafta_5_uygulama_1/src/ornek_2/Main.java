package ornek_2;

import java.io.*;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream yaz1 = null, yaz2 = null;
        Scanner scanner = new Scanner(System.in);
        try {
            yaz1 = new PrintStream(new File("geçenler.txt"));
            yaz2 = new PrintStream(new File("kalanlar.txt"));
            for (int i = 0; i < 5; i++){
                System.out.println((i+1) + " . öğrencinin adı : " + " vize notu : " + " final notu : ");
                String isim = scanner.next();
                int v = scanner.nextInt();
                int f = scanner.nextInt();
                double ortalama = v * 0.4 + f * 0.6;
                if (ortalama >= 50){
                    yaz1.println(isim + "\t" + "vize notu : " + v + "\t" + "final notu : " + f + "\t" + "ortalama : " + ortalama);
                }else {
                    yaz2.println(isim + "\t" + "vize notu : " + v + "\t" + "final notu : " + f + "\t" + "ortalama : " + ortalama);
                }
            }
            yaz1.close();
            yaz2.close();
        }catch (Exception e){
            System.out.println("hata mesajı : " + e.getMessage());
        }
    }
}