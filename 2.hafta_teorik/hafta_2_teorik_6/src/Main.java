public class Main {
    public static void main(String[] args) {
        System.out.println(m(21));    }
    public static double m(int i){
        double toplam = 0;
        for (int j = 1; j <= i; j++){
            toplam = toplam + (double) j / (j + i);
        }
        return toplam;
    }
}