public class Isparcaciklari {
    public static void main(String[] args) {
        // Merhaba ve Dünya threadlerini çalıştırma
        MerhabaThread thread1 = new MerhabaThread();
        Thread thread2 = new Thread(new DunyaRunnable());

        thread1.start();
        thread2.start();

        // Banka hesap işlemleri
        BankaHesabı hesap = new BankaHesabı(1000);

        ParaCekmeThread paraCekmeThread1 = new ParaCekmeThread(hesap, "Ali", 10);
        ParaCekmeThread paraCekmeThread2 = new ParaCekmeThread(hesap, "Ayşe", 20);

        paraCekmeThread1.start();
        paraCekmeThread2.start();

        // Asal sayı hesaplama thread'i
        AsalSayi asalSayiHesaplayici = new AsalSayi();
        asalSayiHesaplayici.start();
        try {
            Thread.sleep(AsalSayi.onSaniye); // AsalSayi.onSaniye kadar beklet
            asalSayiHesaplayici.bittiMi = true; // Hesaplamayı bitir
        } catch (InterruptedException e) {
            System.out.println("Hata oluştu: " + e.getMessage());
        }
    }
}
