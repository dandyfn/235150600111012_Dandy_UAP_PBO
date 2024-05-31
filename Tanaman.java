package uappbo;

abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;
    abstract  void berkembang();
    String status(){
        String kata;
        if (lamaHidup>=masaHidup) {
            return kata="Mati";
        } else {
            return kata="Hidup";
        }
    };
    public String toString(){
        String tostring1 = Integer.toString(lamaHidup);
        String toString2 = Integer.toString(masaHidup);
        String toString3 = Integer.toString(buah);
    
        return toString2 + tostring1 + toString3 + status();
        
       
     
    };
    int masaHidup(){
        return masaHidup;
    };
    int lamaHidup(){
        return lamaHidup;
    };
    int berbuah(){
        return berbuah;
    };
    int buah(){
        return buah;
    };
    double perkembangan(){
        return perkembangan;
    };
    double prosesBerbuah(){
        return prosesBerbuah;
    };
}
