public class Main {
    public static void main(String[] args) {
        //KENDİSİNE PARAMETRE OLARAK MATRİS OLAN MATRİSTEKİ TEK SAYILARI DÖNDÜREN METOT

        int[][] mat = {
                {2, 9, 5, 7},
                {8, 10, 11, 13},
                {17, 19, 21, 32}
        };
        int [] s = tekSayı(mat);
        for (int i : s){
            System.out.println(i);
        }
    }
    public static int[] tekSayı (int [][] mat){
        int [] sonuc = new int[mat.length * mat[0].length];
        int index = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if(mat [i][j] % 2 == 1){
                    sonuc[index] = mat [i][j];
                    index++;
                }
            }
        }
        return sonuc;
    }
}