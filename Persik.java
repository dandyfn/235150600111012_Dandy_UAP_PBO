package uappbo;

public class Persik extends Tanaman implements Perawatan{

    
    void berkembang() {
       
    }
    public Persik(){
        int masaHidup = masaHidup()+180;
        int berbuah = berbuah()+250;
        double perkembangan = perkembangan()+(perkembangan()*0.15);
    }
   
    public void treatment() {
        double perkembangan = perkembangan()+(perkembangan()*0.025);
    };
    
}
