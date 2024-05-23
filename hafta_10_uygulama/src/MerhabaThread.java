public class MerhabaThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Merhaba");
            try {
                Thread.sleep(1000); // 1000 milisaniye geciktirir
            } catch (InterruptedException ex) {
                System.out.println("Hata oluştu: " + ex.getMessage());
            }
        }
    }
}
