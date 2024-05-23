public class ParaCekmeThread extends Thread {
    private BankaHesabı hesap;
    private String isim;
    private double tutar;

    public ParaCekmeThread(BankaHesabı hesap, String isim, double tutar) {
        this.hesap = hesap;
        this.isim = isim;
        this.tutar = tutar;
    }

    public void run() {
        hesap.paraCek(tutar, isim);
    }
}
