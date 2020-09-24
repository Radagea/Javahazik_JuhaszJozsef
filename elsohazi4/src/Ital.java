import java.util.Date;
import java.util.Objects;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály egységes árakkal dolgozó ital automatát kívánja modellezni
 * Megadhatja, hogy két ital ugyan azokkal az értékekkel rendelkezik-e illetve
 * megadja az adott ital árát euróban
 * @author Radagea
 */
public class Ital {
    protected String név;
    protected String kiszerelés;
    private static int ár=10;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }
    /**
     * Ez a metódus vissza adja, az adott ital euróban értelmezett árát.
     * @return 
     */
    public static double getÁrEuróban() {
        return ár/360.45;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }
    
    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    @Override
    public String toString() {
        return "<"+this.ár+">,<"+this.kiszerelés+">,<"+Ital.ár+">Ft";
    }
    /**
     * Két objektumot(italt) összehasonlít és vissza adja, hogy azonos adatokkal, értékekkel rendelkeznek
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital)) { 
           return false;
        }
        Ital tmp =(Ital)obj;
        return this.getNév()==tmp.getNév() && this.getKiszerelés().equals(tmp.getKiszerelés()) && this.getÁr()==tmp.getÁr();
    }
   
}
