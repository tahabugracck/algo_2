public class BankaHesabı {
    private double bakiye;

    public BankaHesabı(double bakiye) {
        this.bakiye = bakiye;
    }

    public synchronized void paraCek(double tutar, String isim) {
        if (bakiye >= tutar) {
            System.out.println(isim + " para çekiyor: " + tutar);
            bakiye -= tutar;
            System.out.println("Yeni bakiye: " + bakiye);
        } else {
            System.out.println(isim + " yeterli bakiye yok, mevcut bakiye: " + bakiye);
        }
    }
}
