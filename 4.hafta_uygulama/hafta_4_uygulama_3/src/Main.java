import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File dosya = new File ("buyukler.txt");
        int[][] matris = {{5,10,13},{3,8,0},{7,9,11}};
        PrintWriter printWriter = null;
        try {
            if (!dosya.exists()){
                dosya.createNewFile();
                printWriter = new PrintWriter(new FileOutputStream(dosya,false));//append true olursa önceki bilgiler dosyada saklanır false olursa dosyada saklanmaz
                for (int i = 0; i < matris.length; i++){
                    int enBuyuk = matris[i][0];
                    for (int j = 0; j < matris[i].length; j++){
                        if (matris[i][j] > enBuyuk){
                            enBuyuk = matris[i][j];
                        }
                    }
                    printWriter.print(enBuyuk + " - ");
                }
            }
            printWriter.close();
        }catch (Exception exception){

        }
    }
}