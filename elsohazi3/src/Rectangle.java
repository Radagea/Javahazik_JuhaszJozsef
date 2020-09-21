/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ezaz osztály egy téglalapot kíván modellezni 
 * Megadja az adott téglalap területét illetve kerületét is.
 * @author Radagea
 */
public class Rectangle {

    private double height;
    private double width;

    public Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    /**
     * Leírás:
     * Ez a metódus vissza adja a téglalap területét azaz a*b
     * @return 
     */
    public double getArea() {
        return this.height * this.width;
    }
    /**
     * Leírás:
     * Ez a metódus vissza adja a téglalap kerületét azaz 2*(a*b)
     * @return 
     */
    public double getPerimeter() {
        return 2 * (this.height * this.width);
    }

    @Override
    public String toString() {
        return "Téglalap{" + "Magasság=" + this.height + ", Szélesség=" + this.width + ", Terület=" + this.getArea() + ", Kerület=" + this.getPerimeter() + "}";
    }

}
