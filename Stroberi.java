package uappbo;

public class Stroberi extends Tanaman implements Perawatan{

    
    void berkembang() {
        
    }
    public Stroberi(){
        int masaHidup = masaHidup()+60;
        int berbuah = berbuah()+150;
        double perkembangan = perkembangan()+(perkembangan()*0.35);
    }
   
    public void treatment() {
       double perkembangan = perkembangan()+(perkembangan()*0.05);
    };
    
}
