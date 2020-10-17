
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
public class Main {
    public static void rendez(Túristák[] turista) {
        int db = turista.length;
        for (int i = 0; i < db-1; i++) {
            for (int j = i+1; j < db; j++) {
                if (turista[i].getOrszagos() == turista[j].getOrszagos()) {
                    if (turista[i].getHelyi() == turista[j].getHelyi()) {
                        if (turista[i].getNév().compareTo(turista[j].getNév()) > 0) {
                            Túristák tmp = turista[i];
                            turista[i] = turista[j];
                            turista[j] = tmp;
                        }
                    } else if (turista[i].getHelyi()<turista[j].getHelyi()) {
                        Túristák tmp = turista[i];
                        turista[i] = turista[j];
                        turista[j] = tmp;
                    }
                } else if(turista[i].getOrszagos()<turista[j].getOrszagos()) {
                    Túristák tmp = turista[i];
                    turista[i] = turista[j];
                    turista[j] = tmp;
                }
            }
        }
    }
    
    public static void kiir(Túristák[] turista) {
        for (int i = 0; i < turista.length; i++) {
            System.out.println(turista[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        int db = Integer.parseInt(bemenet.nextLine());
        
        Túristák[] turista = new Túristák[db];
        for (int i = 0; i < db; i++) {
            int helyi = 0;
            int orszagos = 0;
            String[] sor = bemenet.nextLine().split(";");
            for (int j = 0; j < sor[1].length(); j++) {
                if (sor[1].charAt(j) == 'K') {
                    orszagos++;
                }
                if (sor[1].charAt(j) == 'P' || sor[1].charAt(j) == 'Z' || sor[1].charAt(j) == 'S') {
                    helyi++;
                }
            }
            turista[i] = new Túristák(sor[0],helyi,orszagos);
        }
        rendez(turista);
        kiir(turista);
    }
}
