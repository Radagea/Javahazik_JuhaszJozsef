/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Dolgozat {

    public Dolgozat() {
    }
    
    
    public static SzeszesItal[] alkoholrendez(Ital[] italok) {
        int db = 0 ;
        for (int i = 0; i < italok.length; i++) {
            if (italok[i] instanceof SzeszesItal) {
                db++;
            }
        }
        if (db < 3) {
            return null;
        }
        SzeszesItal[] szeszesek = new SzeszesItal[db];
        int szamlalo = 0;
        for (int i = 0; i < italok.length; i++) {
            if (italok[i] instanceof SzeszesItal) {
                szeszesek[szamlalo] = (SzeszesItal)italok[i];
                szamlalo++;
            }
        }
        for (int i = 0; i < db-1; i++) {
            for (int j = i+1; j < db; j++) {
                if (szeszesek[i].getAlkoholTartalom() < szeszesek[j].getAlkoholTartalom()) {
                    SzeszesItal tmp = szeszesek[j];
                    szeszesek[j] = szeszesek[i];
                    szeszesek[i] = tmp;
                }
            }
        }
        
        SzeszesItal[] kimenet = new SzeszesItal[3];
        for (int i = 0; i < 3; i++) {
            kimenet[i] = szeszesek[i];
        }
        
        return kimenet;
    }
}
