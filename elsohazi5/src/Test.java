/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Test {
    public static void main(String[] args) {
        QuadraticEquation q1 = new  QuadraticEquation(1,2,3);
        QuadraticEquation q2 = new  QuadraticEquation(4,5,6);
        QuadraticEquation q3 = new  QuadraticEquation(7,-8,-9);
        q1.printQuad();
        q2.printQuad();
        q3.printQuad();
    }
}
