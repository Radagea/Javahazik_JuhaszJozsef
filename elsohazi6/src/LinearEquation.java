/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály egy 2x2-es ineáris egyenletrendszer modellez
 * @author Radagea
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }
    /**
     * Ez a metódus ellenőrzi, hogy ad-bc egyenlő-e nullával ha igen egy igaz értéket ad vissza egyébként false-t
     * @return - Ellenőrzi, hogy megoldható-e az egyenlet
     */
    public boolean isSolvable() {
        if((this.a*this.d)-(this.b*this.c) == 0)
        {
            return true;
        }
        return false;
    }
    /**
     * Meghívásra vissza adja az X-et tehát a (ed-bf)/(ad-bc)
     * @return - Ki számolja a 2x2-es lineáris egyenletrendszer X értékét
     */
    public double getX() {
        return (this.e*this.d-this.b*this.f)/(this.a*this.d - this.b*this.c);
    }
    /**
     * Meghívásra kiszámolja és vissza adja az Y-ot tehát a (af-ec)/(ad-bc)
     * @return - Ki számolja a 2x2-es lineáris egyenletrendszer Y értékét
     */
    public double getY() {
        return ((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c));
    }
    
}
