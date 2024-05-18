import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //GİRİLEN ŞİFREDE EN AZ 1 BÜYÜK HARF EN AZ 1 RAKAM EN EN AZ 1 ÖZEL KARAKTER VE EN AZ 8 HANELİ ŞİFRE
        System.out.print("Şifreyi giriniz: ");
        String sifre = scanner.nextLine();
        scanner.close();

        boolean isValid = sifre(sifre);

        if (isValid) {
            System.out.println("Geçerli şifre");
        } else {
            System.out.println("Geçersiz şifre");
        }
    }

    public static boolean sifre(String sifre) {
        int rakam = 0;
        int büyükHarf = 0;
        int özelKarakter = 0;

        for(int i = 0; i < sifre.length(); i++){
            char c = sifre.charAt(i);
            if (c >= '0' && c <= '9') {
                rakam++;
            } else if (c >= 'A' && c <= 'Z') {
                büyükHarf++;
            } else if (c >= 33 && c <= 47) {
                özelKarakter++;
            }
        }

        return rakam > 0 && büyükHarf > 0 && özelKarakter > 0 && sifre.length() >= 8;
    }
}
