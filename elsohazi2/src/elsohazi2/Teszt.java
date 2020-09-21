/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsohazi2;

/**
 *
 * @author Radagea
 */
public class Teszt {
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6,4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(p1+"Területe: "+p1.getArea()+" | Kerülete: "+p1.getPerimeter());
        System.out.println(p2+"Területe: "+p2.getArea()+" | Kerülete: "+p2.getPerimeter());
        System.out.println(p3+"Területe: "+p3.getArea()+" | Kerülete: "+p3.getPerimeter());
    }
}
