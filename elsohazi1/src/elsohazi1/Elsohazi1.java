/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsohazi1;

/**
 *
 * @author Radagea
 */
public class Elsohazi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pont a = new Pont(1,2);
        Pont b = new Pont(3,4);
        Pont c = new Pont(4,5);
        Pont d = new Pont(5,6);
        a.setY(a.getY()+5);
        b.setY(b.getY()+5);
        c.setX(c.getX()-3.4);
        d.setX(d.getX()-3.4);
        System.out.println(a.getY());
        System.out.println(b.getY());
        System.out.println(c.getX());
        System.out.println(d.getX());
        
    }
    
}
