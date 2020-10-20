
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Ital implements Comparable {
    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return this.név+','+this.kiszerelés+", "+this.ár+" Ft";
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital)) {
            return false;
        }
        Ital tmp = (Ital)obj;
        if (tmp.getNév() == this.getNév() && tmp.getKiszerelés() == this.getKiszerelés()) {
            return true;
        } else
        {
            return false;
        }
    }
    
    public int compareTo(Object o) {
        Ital tmp = (Ital)o;
        if (this.getÁr() == tmp.getÁr()) {
            return 0;
        } else if (this.getÁr() > tmp.getÁr()) {
            return 1;
        } else { // this.getÁr() < tmp.getÁr()
            return -1;
        } 
    }
}
