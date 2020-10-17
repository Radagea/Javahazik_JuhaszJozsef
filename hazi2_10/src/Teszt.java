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
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        int db = Integer.parseInt(bemenet.nextLine());
        Túrák[] turak = new Túrák[db];
        
        for (int i = 0; i < db; i++) {
            int hossz = 0;
            String[] sor = bemenet.nextLine().split(";");
            for (int j = 4; j < sor.length; j++) {
                hossz = hossz+Integer.parseInt(sor[j]);
            }
            turak[i] = new Túrák(sor[0],sor[1],sor[2],sor[3],hossz);
        }
        Túrák max = turak[0];
        for (int i = 1; i < db; i++) {
            if (turak[i].getTav()>max.getTav()) {
                max = turak[i];
            }
        }
        System.out.println(max);
    }
}
