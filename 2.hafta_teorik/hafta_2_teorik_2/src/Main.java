public class Main {
    public static void main(String[] args) {
        //BİR DİZİNİN EN BÜYÜK ELEMANINI BULMA
        int[] dizia = {10, 5, 20, 8, 15};
        int enBuyuk = enBuyukBul(dizia);
        System.out.println("Dizinin en büyük elemanı: " + enBuyuk);
    }
    public static int enBuyukBul(int[] dizia) {
        int max = dizia[0];

        for (int i = 1; i < dizia.length; i++) {
            if (dizia[i] > max) {
                max = dizia[i];
            }
        }
        return max;
    }
}