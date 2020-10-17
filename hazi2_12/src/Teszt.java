
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Teszt {
    public static void rendez(Települések[] telep){
        int hossz = telep.length;
        for (int i = 0; i < hossz; i++) {
            for (int j = 0; j < hossz; j++) {
                if (telep[i].getNév().compareTo(telep[j].getNév()) > 0) {
                    Települések tmp = telep[j];
                    telep[j] = telep[i];
                    telep[i] = tmp;
                }
            }
        }
        for (int i = 0; i < hossz; i++) {
            for (int j = 1; j < hossz; j++) {
                if (telep[i].getFok()<telep[j].getFok()) {
                    Települések tmp = telep[j];
                    telep[j] = telep[i];
                    telep[i] = tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        String[] sor =bemenet.nextLine().split(" ");
        int db = Integer.parseInt(sor[0]);
        String ktelep = sor[1];
        int ktelepho = 0;
        Települések[] települések = new Települések[db];
        boolean vane = false;
        
        for (int i = 0; i < db; i++) {
            String[] sor2 = bemenet.nextLine().split(":");
            települések[i] = new Települések(sor2[0],Integer.parseInt(sor2[1]));
            if (települések[i].getNév().equals(ktelep)) {
                vane = true;
                ktelepho = települések[i].getFok();
            }
        }
        
        if (vane == false) {
            System.out.println("Missing data!");
        } else {
            rendez(települések);
            for (int i = 0; i < db; i++) {
                if (települések[i].getFok() > ktelepho && !(települések[i].getNév().equals(ktelep))) {
                    System.out.println(települések[i]);
                }
            }
        }
    }
}
