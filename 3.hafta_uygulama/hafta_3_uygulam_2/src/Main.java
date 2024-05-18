import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //try catch
        int a = 10, b = 5, c = 5, sonuc;
        try {
            sonuc = a / (b - c);
            System.out.println("sonuç : " + sonuc);
        }catch (ArithmeticException e){
            System.out.println("hata yakalandı : sıfıra bölünme hatası");
        }finally {
            //bura her zaman çalışır
            System.out.println("her zaman çalıştı");
        }


        //ArrayIndexOutOfBoundsException hatasını bul
        int[] dizi = new int[4];
        try {
            System.out.println(dizi[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("hata yakalandı : dizi hatası" );
        }finally {
            System.out.println("burası her zaman çalışır");
        }

        //string girdiğinde hata veren bir algoritma
        Scanner klavye = new Scanner(System.in);
        boolean gerecerliMi = false;
        int sayi = 0;
        while (!gerecerliMi ){
            System.out.println("lütfen sayı giriniz :");


            try {
                sayi = klavye.nextInt();
                gerecerliMi = true;

            }catch (InputMismatchException e){
                System.out.println("girdiğiniz format geçersiz.");
                klavye.nextLine();
            }finally {

            }
        }



    }
}