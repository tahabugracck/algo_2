public class ogrenci {
    public String ad = "ali";
    public String soyad = "çelik";
    public int ogrenciNo = 23;

    private String kullanıcıAdi = "aclk";
    private String sifre = "a23";

    public void yazdir() {


        System.out.println("kullanıcı adı : " + this.kullanıcıAdi);
        System.out.println("şifre : " + this.sifre);
    }

    ogrenci(String kullanıcıAdi, String sifre) {
        this.kullanıcıAdi = kullanıcıAdi;
        this.sifre = sifre;
    }


}
