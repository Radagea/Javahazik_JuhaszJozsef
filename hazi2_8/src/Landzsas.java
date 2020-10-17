/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Landzsas extends Katona {

    public Landzsas(int tamero, int vedero) {
        super(tamero, vedero);
    }

    @Override
    public String toString() {
        return "Landzsas: TE:"+this.getTamero()+"VE:"+this.getVedero();
    }
    
    
}
