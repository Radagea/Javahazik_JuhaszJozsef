
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
public class main {
    public static Aszu[] puttonyos(Bor[] borok) {
        int db = 0;
        for (int i = 0; i < borok.length; i++) {
            if (borok[i] instanceof Aszu) {
                Aszu tmp = (Aszu)borok[i];
                if (tmp.hanyPuttonyos()>4) {
                    db++;
                }
            }
        }
        Aszu[] aszuk = new Aszu[db];
        int tombeleme = 0;
        for (int i = 0; i < borok.length; i++) {
            if (borok[i] instanceof Aszu) {
                Aszu tmp = (Aszu)borok[i];
                if (tmp.hanyPuttonyos()==5) {
                    aszuk[tombeleme] = tmp;
                    tombeleme++;
                }
            }
        }
        return aszuk;
    } 
    
    
    public static void main(String[] args) {
        Bor[] borok = new Bor[6];
        
        borok[0] = new Bor("asd",2,"ddd","Magyar");
        borok[1] = new Bor("valamilyen",50,"valamilyen","Olasz");
        borok[2] = new Aszu("kevésbéfinom",2,"kék","Magyar",2);
        borok[3] = new Aszu("inkább finomabb",2,"kék","Magyar",4);
        borok[4] = new Aszu("Finom",2,"kék","Olasz",5);
        borok[5] = new Aszu("Rettentoen finom",1,"valamilyen","Magyar",5);
        System.out.println(Arrays.toString(puttonyos(borok)));
    }
}
