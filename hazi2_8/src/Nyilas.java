/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Nyilas extends Katona {
    private int lotav;

    public Nyilas(int tamero, int vedero, int lotav) {
        super(tamero, vedero);
        this.lotav = lotav;
    }
    
    public int getLotav() {
        return lotav;
    }
    
    public void setLotav(int lotav) {
        this.lotav = lotav;
    }
    
    public int getTE() {
        return this.getTamero()+this.getLotav();
    }


    @Override
    public boolean equals(Object obj) {
       if (obj == null || !(obj instanceof Katona)) {
            return false;
       }
       Nyilas tmp = (Nyilas)obj;
        if (tmp.getTE() == tmp.getVedero()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nyilas: TE: "+this.getTE()+"VE:"+this.getVedero();
    }
    
    
    
}
