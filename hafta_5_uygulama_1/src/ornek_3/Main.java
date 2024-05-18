package ornek_3;

import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintStream yaz = null;
        Scanner scanner = null;
        try {
            yaz = new PrintStream(new File("deneme.txt"));
            for (int i = 0; i < 10; i++){
                int sayi = (int) (Math.random() * 100);
                yaz.print(sayi + " ");
            }
            yaz.close();
            scanner = new Scanner(new File("deneme.txt"));
            int[] dizi = new int[100];
            while (scanner.hasNextInt()){
                int sayi = scanner.nextInt();
                dizi[sayi] = sayi;
            }
            for (int i : dizi){
                if (i != 0){
                    System.out.println(i + " ");
                }
            }
        }catch (Exception e){
            System.out.println("hata : " + e.getMessage());
        }








    /*File file = new File("deneme.txt");

    Random random = new Random();
    for (int i = 0; i < 10; i++){
        int randomSayi = random.nextInt(100);
        System.out.println(randomSayi);
    }
    int[]dizi = new int[random.nextInt()];
*/


    }
}
