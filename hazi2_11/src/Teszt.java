/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Radagea
 */
public class Teszt {
    
    public static void rendez(Hullámvasút[] a) {
        int hossz = a.length;
        for (int i = 0; i < hossz; i++) {
            for (int j = 1; j < hossz; j++) {
                if (a[i].getVarkozasiIdo()<a[j].getVarkozasiIdo()) {
                    Hullámvasút tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                } else if(a[i].getVarkozasiIdo() == a[j].getVarkozasiIdo() && a[i].getMagassag()>a[j].getMagassag()) {
                    Hullámvasút tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }
    
    public static void kiir(Hullámvasút[] hullam) {
        for (int i = 0; i < hullam.length; i++) {
            System.out.println(hullam[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        int db  = Integer.parseInt(bemenet.nextLine());
        
        Hullámvasút[] hullamvasutak = new Hullámvasút[db];
        for (int i = 0; i < db; i++) {
            String[] sor = bemenet.nextLine().split(";");
            hullamvasutak[i] = new Hullámvasút(sor[0],sor[1],Integer.parseInt(sor[2]),Integer.parseInt(sor[3]));
        }
        rendez(hullamvasutak);
        kiir(hullamvasutak);
    }
}
