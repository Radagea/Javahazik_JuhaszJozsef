/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Katona {
    private int tamero;
    private int vedero;

    public int getTamero() {
        return tamero;
    }
    public void setTamero(int tamero) {
        this.tamero = tamero;
    }

    public int getVedero() {
        return vedero;
    }
    public void setVedero(int vedero) {
        this.vedero = vedero;
    }

    public Katona() {
        this.tamero = 5;
        this.vedero = 5;
    }

    public Katona(int tamero, int vedero) {
        this.tamero = tamero;
        this.vedero = vedero;
    }

    @Override
    public String toString() {
        return "TE: "+tamero+"VE: "+vedero;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Katona)) {
            return false;
        }
        Katona tmp = (Katona)obj;
        if (tmp.getTamero() == tmp.getVedero()) {
            return true;
        } else {
            return false;
        }
    }
    
}

