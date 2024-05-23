public class DunyaRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Dünya");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Hata oluştu: " + e.getMessage());
            }
        }
    }
}
