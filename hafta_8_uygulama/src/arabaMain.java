public class arabaMain {
    public static void main(String[] args) {
        araba araba = new araba("mercede", 262);

        System.out.println("oluşturulan araba : " + araba.modelGetir() + " motor gucu : " + araba.motorGucuGetir() + " HP");

        araba.hizArttir(20);

        araba.hızAzalt(10);

        System.out.println("anlik hiz : " + araba.hiz + " km/h");


        araba.modifiye();
        System.out.println("modifiye sonrası gücü : " + araba.motorGucuGetir());


    }
}
