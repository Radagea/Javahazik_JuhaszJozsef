/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Túrák {
    private String ev;
    private String honap;
    private String nap;
    private String nev;
    private int tav;

    public Túrák(String ev, String honap, String nap, String nev, int tav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.tav = tav;
    }

    public String getEv() {
        return ev;
    }

    public String getHonap() {
        return honap;
    }

    public String getNap() {
        return nap;
    }

    public String getNev() {
        return nev;
    }

    public int getTav() {
        return tav;
    }

    @Override
    public String toString() {
        return this.ev+";"+this.honap+";"+this.nap+";"+this.nev;
    }
    
}
