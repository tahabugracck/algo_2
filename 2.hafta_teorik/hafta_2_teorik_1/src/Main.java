public class Main {
    public static void main(String[] args) {
        //ASAL ÇARPAN BULMA
        int asalCarpan =120 ;
        System.out.println(asalCarpan);
    }
    public static void asalCarpan(int sayı){
        int carpan = 2;
        while (sayı > 1){
            if(sayı % carpan == 0){
                sayı = sayı / carpan;
                System.out.println(carpan + " ");
            }else {
                carpan++;
            }

        }
    }
}