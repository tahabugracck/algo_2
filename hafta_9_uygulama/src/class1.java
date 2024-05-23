public class class1 {
    public class1(String isim, int sayi){
        System.out.println(isim + sayi);
    }
}
 class class2 extends class1{
    private String ad;
    private int no;
    public 2(String isim, int sayi){
     super("2. sınıf",3);
     this.ad = isim;
     this.no = sayi;
     yazdir();
    }
    public void yazdir(){
        System.out.println("(+this.ad+","this.no+")");
    }
}

class class3 extends class2{

}
