/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Bor extends AlkoholosItal {
    private String SzoloFajta;
    private String termoTerulet;

    public Bor(String iz, double alkoholTartalom, String SzoloFajta, String termoTerulet) {
        super(iz, alkoholTartalom);
        this.SzoloFajta = SzoloFajta;
        this.termoTerulet = termoTerulet;
    }
 
    
    public String milyenSzolobolKeszult() {
        return SzoloFajta;
    }
    
    public String mibolKeszult() {
        return mibolKeszult();
    }

    public String holTermett() {
        return termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + "SzoloFajta=" + SzoloFajta + ", termoTerulet=" + termoTerulet + '}';
    }
    
    
}
