import java.io.File;
import java.util.Scanner;

public class örn8 {
    public static void main(String[] args) {
        File dosya=new File("sayilar.txt");
        Scanner oku;
        try {
            oku=new Scanner(dosya) ;
            int i=0,enk=0,top=0,enb=0;
            while(oku.hasNext()){
                int sayi=oku.nextInt();
                top=top+sayi;
                if(i==0) enk=sayi;
                if(sayi<enk) enk=sayi;
                if(sayi>enb) enb=sayi;
                System.out.print(sayi+"\t");
                i++;
            }
            oku.close();
            System.out.println("\nEn küçük sayı:"+enk+"\nEn büyük sayı:"+enb+"\n"+"Toplam:"+top+ "\ndosyada " + i + " adet sayı var");
        } catch (Exception e) {
        }
    }
}