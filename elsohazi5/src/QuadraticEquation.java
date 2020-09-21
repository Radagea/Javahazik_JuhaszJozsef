/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ez az osztály a másodfokú egyenletet modellezi, vissza adja annak gyökeit és diszkriminánsát
 * @author Radagea
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a=a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    /**
     * Ez a metódus kiszámítja a másodfokú egyenlet diszkriminánsát és vissza adja azt, vagyis b^-4ac
     * @return - A másodfokú egyenlet diszkriminánsa 
     */
    public double getDiscriminant() {
        return this.b*this.b-4*(this.a*this.c);
    }
    /**
     * Ha a diszkrimináns negatív 0 add vissza, egyébként megadja az egyenlet első gyökét tehát a -b - sqrt(diszkrimináns)/2a
     * @return - A másodfokú egyenlet első gyökét adja meg(-)
     */
    public double getRoot1(){
        if(this.getDiscriminant()<0){
            return 0;
        } 
        return (-this.b-Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }
    /**
     * Ha a diszkrimináns negatív 0 add vissza, egyébként megadja az egyenlet második gyökét tehát a -b + sqrt(diszkrimináns)/2a
     * @return - A másodfokú egyenlet második gyökét adja meg(+)
     */
    public double getRoot2(){
        if(this.getDiscriminant()<0){
            return 0;
        } 
        return (-this.b+Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }
    /**
     * Ki íratja a másodfokú egyenlet gyökeit, ha pozitív a diszkrimináns mind a kettőt, ha 0 akkor a közös gyököt, ha negatív akkor üzenetet ír ki
     */
    public void printQuad(){
        double asd = this.getDiscriminant();
        System.out.println("Diszkrimináns eredménye = "+asd);
        if(asd<0){
            System.out.println("The equation has no roots");
        } else if(asd == 0){
            System.out.println(this.getRoot1());
        } else {
            System.out.println("Root1= "+this.getRoot1());
            System.out.println("Root2= "+this.getRoot2());
        }
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" + "a=" + a + ", b=" + b + ", c=" + c + "'\n"+
        this.a+"x^2+"+this.b+"x+"+this.c;
    }
    
}
