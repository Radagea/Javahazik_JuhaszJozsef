/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Túristák {
    private String név;
    private int helyi;
    private int orszagos;

    public Túristák(String név, int helyi, int orszagos) {
        this.név = név;
        this.helyi = helyi;
        this.orszagos = orszagos;
    }

    public String getNév() {
        return név;
    }

    public int getHelyi() {
        return helyi;
    }

    public int getOrszagos() {
        return orszagos;
    }

    @Override
    public String toString() {
        return this.név+':'+this.helyi+';'+this.orszagos;
    }
    
    
}
