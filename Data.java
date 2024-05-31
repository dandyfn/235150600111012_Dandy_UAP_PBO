package uappbo;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    
   public static ArrayList<Tanaman>tanamans = new ArrayList<>();
   public static ArrayList<Integer>lokasi = new ArrayList<>();
   public static Scanner in = new Scanner(System.in);
    public static void  mulai(){
        System.out.println("\n1. Tomat\n2. Stroberi\n3. Persik");
     int bulan = in.nextInt();
     int hari = bulan*30;
    for (int i = 0; i < bulan; i++) {
        menanam();
        if () {
            
        } else {
            
        }
    }

   };
   public static void menanam(){
    java.util.Scanner input = new java.util.Scanner(System.in);
    int angka = input.nextInt();
    switch (angka) {
        case 1:
        Tomat tomat = new Tomat();
            tanamans.add(tomat);
            System.out.println("sudah berhasil menanam");
            break;
        case 2:
        Stroberi stroberi = new Stroberi();
                tanamans.add(stroberi);
                System.out.println("sudah berhasil menanam");
                break;
        case 3:
        Persik persik = new Persik();
                    tanamans.add(persik);
                    System.out.println("sudah berhasil menanam"); 
                    break;
        default:
            break;
    }
   };
   public static void info(){

   };

}
