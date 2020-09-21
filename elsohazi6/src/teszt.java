/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class teszt {
    public static void main(String[] args) {
        LinearEquation le1 = new LinearEquation(5,22,15,27,18,17);
        LinearEquation le2 = new LinearEquation(1,2,3,4,5,6);
        LinearEquation le3 = new LinearEquation(0,0,0,0,0,0);
        if(le1.isSolvable()){
            System.out.println("The equation has no solution");
        } else {
            System.out.println(le1.getX());
            System.out.println(le1.getY());
        }
        if(le2.isSolvable()){
            System.out.println("The equation has no solution");
        } else {
            System.out.println(le2.getX());
            System.out.println(le2.getY());
        }
        if(le3.isSolvable()){
            System.out.println("The equation has no solution");
        } else {
            System.out.println(le3.getX());
            System.out.println(le3.getY());
        }
    }
}
