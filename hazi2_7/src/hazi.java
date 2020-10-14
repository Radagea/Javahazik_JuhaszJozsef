/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Radagea
 */
public class hazi {
    public static void main(String[] args) {
        Scanner strscan = new Scanner(System.in);
        Random random = new Random();
        String kez;
        String[] valasz = {"ko","papir","ollo"};
        while(true) {
            int jvalasz;
            kez = strscan.nextLine();
            if (kez.equals("vege")) {
                break;
            }
            int gép = random.nextInt(3);
            System.out.println("A gép válasza: "+valasz[gép]);
            if (kez.equals("ko") && gép == 2) {
                System.out.println("Nyertél!");
            }
            if (kez.equals("ko") && gép == 1) {
                System.out.println("Vesztettél!");
            }
            if (kez.equals("ko") && gép == 0) {
                System.out.println("Döntetlen!");
            }
            if (kez.equals("papir") && gép == 2) {
                System.out.println("Vesztettél!");
            }
            if (kez.equals("papir") && gép == 1) {
                System.out.println("Döntetlen!");
            }
            if (kez.equals("papir") && gép == 0) {
                System.out.println("Nyertél!");
            }
            if (kez.equals("ollo") && gép == 2) {
                System.out.println("Döntetlen!");
            }
            if (kez.equals("ollo") && gép == 1) {
                System.out.println("Nyertél!");
            }
            if (kez.equals("ollo") && gép == 0) {
                System.out.println("Vesztettél!");
            }
        }
        
    }
}
