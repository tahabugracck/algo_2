public class AsalSayi extends Thread {
    public static final int max_Asal = 1000000;
    public static final int onSaniye = 10000; // 10 saniyeye eşdeğer milisaniye
    public boolean bittiMi = false;

    public void run() {
        int[] asallar = new int[max_Asal]; // boyutun ne kadar olabileceğini kestiremediğimizden
        int sayi = 0;
        for (int i = 2; i < max_Asal; i++) {
            if (bittiMi)
                return;

            boolean asal = true;

            for (int j = 0; j < sayi; j++) {
                if (i % asallar[j] == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                asallar[sayi++] = i;
                System.out.println("Bulunan Asal: " + i);
            }
        }
    }
}
