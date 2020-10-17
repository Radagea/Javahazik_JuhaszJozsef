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
    public Katona megkuzd(Katona elso, Katona masodik) {
        int elsotam = elso.getTamero();
        int elsoved = elso.getVedero();
        int mastam = masodik.getTamero();
        int masved = masodik.getVedero();
        
        if (elsotam > masved) {
            return elso;
        }
        if (mastam > elsoved) {
            return masodik;
        }
        if (elsotam == masved) {
            return elso;
        }
        return masodik;
    }
    
    
    public static void main(String[] args) {
        Katona katona1 = new Nyilas(5,5,10);
        Katona katona2 = new Nyilas (3,2,9);
        Katona katona3 = new Landzsas (15,20);
        
        
    }
}
