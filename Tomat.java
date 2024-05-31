package uappbo;

public class Tomat extends Tanaman implements Perawatan {

   
    void berkembang() {
       
    }
    public Tomat(){
    
        int masaHidup = masaHidup()+100;
        int berbuah = berbuah()+100;
        double perkembangan = perkembangan()+(perkembangan()*0.25);
    }
   
    public void treatment() {
        double perkembangan = perkembangan()+(perkembangan()*0.05);
    }
    
}
