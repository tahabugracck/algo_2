import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //KLAVYEDEN ALINAN SAYILARIN EBOBUNU BULMA

        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayı2= scanner.nextInt();

        int ebob = ebobBul(sayı1, sayı2);
        System.out.println("girilen sayıların ebobo : " + ebob);


        System.out.println("-----------------------------------------");

        //ASAL ÇARPAN BULMA
        System.out.println("bir sayı giriniz : ");
        int sayı = scanner.nextInt();

        System.out.println("girdiğiniz sayının asal çarpanları : ");
        asalCarpanBul(sayı, 2);


        System.out.println("-----------------------------------------");

        //KLAVYEDEN GİRİLEN KELİMENİN İÇERİSİNDE KLAVYEDEN GİRİLEN HARF VAR MI
        System.out.print("kelime giriniz : ");
        String kelime = scanner.nextLine();
        System.out.print("aranacak harfi giriniz : ");
        char harf = scanner.next().charAt(0);

        boolean sonuc = kelimeIcındeHarfVarMı(kelime, harf, 0);
        if (sonuc){
            System.out.println("belirtilen harf kelimenin içinde var");
        }else {
            System.out.println("belirtilen harf kelimenin içinde yok");
        }

    }

    public static int ebobBul(int sayı1, int sayı2){
        if (sayı2 == 0){
            return sayı1;
        }else {
            return ebobBul(sayı2, sayı1 % sayı2);
        }
    }

    public static void asalCarpanBul(int sayı, int asalCarpan){
        if (sayı <= 1){
            return;
        }
        if (sayı % asalCarpan == 0){
            System.out.println(asalCarpan);
            asalCarpanBul(sayı / asalCarpan,asalCarpan);
        }else {
            asalCarpanBul(sayı, asalCarpan + 1);
        }
    }


    public static boolean kelimeIcındeHarfVarMı(String kelime, char harf, int index){
        if(index >= kelime.length()){
            return false;
        }
        if (kelime.charAt(index) == harf){
            return true;
        }
        return kelimeIcındeHarfVarMı(kelime, harf,index + 1);
    }





}