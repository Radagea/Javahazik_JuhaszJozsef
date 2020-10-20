
import java.util.Arrays;

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
    public static void rendez(Ital[] italok) {
        for (int i = 0; i < italok.length-1; i++) {
            for (int j = i+1; j < italok.length; j++) {
                if (italok[i].compareTo(italok[j]) == 1 ) {
                    Ital tmp = italok[i];
                    italok[i] = italok[j];
                    italok[j] = tmp;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        Ital[] italok = new Ital[10];
        
        italok[0] = new Ital("AA","1 dl",2);
        italok[1] = new Ital("AB","2 dl",5);
        italok[2] = new Ital("AC","3 dl",4);
        italok[3] = new Ital("AD","4 dl",1);
        italok[4] = new Ital("AE","5 dl",3);
        italok[5] = new SzeszesItal("La Festő", "1 L",500,10);
        italok[6] = new SzeszesItal(":D :D","2 L",300,30);
        italok[7] = new SzeszesItal("SDSD","5 dl",200,50);
        italok[8] = new SzeszesItal("Nyanay","2 dl",600,40);
        italok[9] = new SzeszesItal("Pálesz","0,5 dl",400,60);
        
        System.out.println(Arrays.toString(Dolgozat.alkoholrendez(italok)));
        
        rendez(italok);
        
        System.out.println("RENDEZVE: ");
        System.out.println(Arrays.toString(italok));
    }
}
