
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
    public static void rendez(Szavak[] szavak) {
        int db = szavak.length;
        for (int i = 0; i < db-1; i++) {
            for (int j = i+1; j < db; j++) {
                if (szavak[i].getAngolszo().equals(szavak[j].getAngolszo())) {
                    if (szavak[i].getMagyarszo().compareTo(szavak[j].getMagyarszo()) > 0) {
                        Szavak tmp = szavak[i];
                        szavak[i] = szavak[j];
                        szavak[j] = tmp;
                    }
                } else if (szavak[i].getAngolszo().compareTo(szavak[j].getAngolszo()) > 0) {
                    Szavak tmp = szavak[i];
                    szavak[i] = szavak[j];
                    szavak[j] = tmp;
                }
            }
        }
    }
    
    public static void kiir(Szavak[] szavak) {
        for (int i = 0; i < szavak.length; i++) {
            System.out.println(szavak[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        
        int db = Integer.parseInt(bemenet.nextLine());
        
        Szavak[] szavak = new Szavak[db];
        for (int i = 0; i < db; i++) {
            String[] sor = bemenet.nextLine().split(":");
            szavak[i] = new Szavak(sor[0],sor[1]);
        }
        rendez(szavak);
        kiir(szavak);
    }
}
