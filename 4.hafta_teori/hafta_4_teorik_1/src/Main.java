public class Main {
    public static void main(String[] args) {
        //kendisine parametre olarak verilen tam sayıyı 2'lik tabanda yazan rekürsif metotlu algortimayı yaz : quiz
        int sayı = 19;
        System.out.println("sayının ikilik tabandaki karşılığı : " + ikilik(sayı));
    }
    public static String ikilik(int sayı){
        if (sayı == 0){
            return "0" ;
        } else if (sayı == 1) {
            return "1";
        }else {
            int kalan = sayı % 2;
            int bolum = sayı / 2;
            return ikilik(bolum) + kalan;
        }
    }
}