/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(String iz, double alkoholTartalom, String SzoloFajta, String termoTerulet, int puttonySzam) {
        super(iz, alkoholTartalom, SzoloFajta, termoTerulet);
        this.puttonySzam = puttonySzam;
    }
    
    public int hanyPuttonyos() {
        return this.puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + this.hanyPuttonyos() + '}';
    }
    
    
}
