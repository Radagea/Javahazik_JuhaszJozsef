/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Radagea
 */
public class Test {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[30];
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
        }
        printArray(t);
        long timeStart = System.currentTimeMillis();
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();
        printArray(t);
        System.out.println(timeEnd - timeStart);
    }
    
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    static void insertionSort(int[] a) {
        int len = a.length;
        int j, index;
        for (int i = 0; i < len; i++) {
           index = a[i];
           j = i-1;
           
           while(j >= 0 && a[j] > index) {
               a[j+1] = a[j];
               j = j-1;
           }
           a[j+1] = index;
        }
    }
}
