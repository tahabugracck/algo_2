import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //girilen sayı tam sayı mı değil mi?

        Scanner input  = new Scanner(System.in);
        boolean gecerliMi = false;
        int sayi = 0;

        while (!gecerliMi){
            gecerliMi = true;
            try {
                System.out.println("tam sayı gir");
                sayi = input.nextInt();
                System.out.println("girilen sayı : " + sayi);
            }catch (Exception exception){
                input.nextLine();
                gecerliMi = false;
                System.out.println("tam sayı değil. tekrar dene");
                System.out.println("hata adı : " + exception);
                System.out.println("hata kodu : " + exception.hashCode());
                System.out.println("-----------------------------------");
            }
        }


        //kullanıcıdan sayı al. sayı 99 un bir çarpanı mı kontrol et. bunu bulurken istisna durumlarını kontrol et.
        //aritmetik istisna ve tam sayı istisnası

        try {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Bir sayı giriniz:");
            int n = Integer.parseInt(input1.nextLine());

            if (n == 0) {
                throw new ArithmeticException("Sıfıra bölünme hatası!");
            }

            if (99 % n == 0) {
                System.out.println(n + ", 99'un bir çarpanıdır.");
            } else {
                System.out.println(n + ", 99'un bir çarpanı değildir.");
            }
        } catch (ArithmeticException exception) {
            System.out.println("Aritmetik istisna. Sıfıra bölünmesi hatası: " + exception);
        } catch (NumberFormatException exception) {
            System.out.println("Sayı girişi istisnası. Tam sayı girilmedi: " + exception);
        }




    }
}