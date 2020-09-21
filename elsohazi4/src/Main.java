/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Main {
    public static void main(String[] args) {
        Ital i1 = new Ital("Coca","5dl");
        Ital i2 = new Ital("Coca","5dl");
        System.out.println(i1.equals(i2));
        Ital.setÁr(300);
        System.out.println(Ital.getÁrEuróban());
    }
}
