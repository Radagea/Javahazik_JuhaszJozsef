/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Hullámvasút {
    private String nev;
    private String vilagnev;
    private int magassag;
    private int varkozasiIdo;

    public Hullámvasút(String nev, String vilagnev, int magassag, int varkozasiIdo) {
        this.nev = nev;
        this.vilagnev = vilagnev;
        this.magassag = magassag;
        this.varkozasiIdo = varkozasiIdo;
    }

    public String getNev() {
        return nev;
    }

    public String getVilagnev() {
        return vilagnev;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getVarkozasiIdo() {
        return varkozasiIdo;
    }

    @Override
    public String toString() {
        return this.nev+" ("+this.vilagnev+"): "+this.varkozasiIdo;
    }
    
    
}
