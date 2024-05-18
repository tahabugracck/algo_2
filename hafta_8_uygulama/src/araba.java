public class araba {
    public int hiz;
    private String model;
    private int motorGucu;

    araba(String model, int motorGucu){
        this.model = model;
        this.motorGucu = motorGucu;
        this.hiz = 0;
    }

    public String modelGetir(){
        return model;
    }

    public int motorGucuGetir(){
        return motorGucu;
    }

    public void hizArttir(int artanHiz){
        this.hiz = this.hiz + artanHiz;
    }

    public void hızAzalt(int azalanHiz){
        this.hiz = this.hiz - azalanHiz;
        if (this.hiz < 0 ){
            this.hiz = 0;
        }
    }


    public void modifiye(){
        this.motorGucu = motorGucu + 40;
    }
}
