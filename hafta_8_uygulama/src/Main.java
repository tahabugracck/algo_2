public class Main {

    public static void main(String[] args) {

        String kullanıcıAdi = "acelik";
        String sifre = "a23";

        ogrenci ogrenci = new ogrenci(kullanıcıAdi, sifre);

        System.out.println("ad : " + ogrenci.ad);
        System.out.println("soyad : " + ogrenci.soyad);
        System.out.println("numara : " + ogrenci.ogrenciNo);

        ogrenci.yazdir();


    }


}