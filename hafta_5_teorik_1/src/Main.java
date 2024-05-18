import jdk.nashorn.internal.runtime.ECMAException;

import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        do {
            System.out.println("1-Dosya yaz");
            System.out.println("2-Oku");
            System.out.println("3-Cikis");
            System.out.println("seciminiz < 1 / 2 / 3 >");
            int secenek = klavye.nextInt();
            klavye.nextLine();
            if (secenek == 1){
                System.out.println("isminiz");
                String isim = klavye.nextLine();
                System.out.println("vize ve final bilginiz");
                int v = klavye.nextInt();
                int f = klavye.nextInt();
                yaz("ogrenci", isim, v, f);
            } else if (secenek == 2) {
                oku("ogranci");
            }else {
                break;
            }
        }while (true);
    }
    public static void yaz(String dad, String isim, int v, int f){
        File dosya = new File((dad + ".txt"));
        PrintWriter p;
        try {
            p = new PrintWriter(new FileOutputStream(dosya, true));
            p.print(isim + "\t");
            p.println(v + "\t" + f);
            p.close();
        }catch (Exception e){

        }
    }
    public static void oku(String dad){
        File dosya = new File(dad + ".txt");
        if (!dosya.exists()){
            System.out.println("dosya bulunamadı");
        }else {
            try {
                Scanner oku  = new Scanner(dosya);
                while (oku.hasNext()){
                    String okunan = oku.nextLine();
                    String[] dizi = okunan.split("\t");
                    double ort = Integer.parseInt(dizi[1])*0.4 + Integer.parseInt(dizi[2])*0.6;
                    System.out.println(dizi[0] + "\t" + dizi[1] + "\t" + dizi[2] + "\t" + ort);
                    //System.out.println(okunan);
                }
                oku.close();
            }catch (Exception e){

            }
        }
    }
}