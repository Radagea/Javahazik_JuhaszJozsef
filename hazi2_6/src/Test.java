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
    public static boolean isConsecutiveFour(int[] values) {
        int len = values.length;
        if (len >= 4) {
            for (int i = 0; i < len; i++) {
                if (i+3 > len-1) {
                    return false;
                }
                if (values[i] == values[i+1] && values[i] == values[i+2] && values[i] == values[i+3]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] tömb1 = new int[] {5,4,4,4,4,5};
        int[] tömb2 = new int[] {1,2,3};
        int[] tömb3 = new int[] {4,2,1,3};
        int[] tömb4 = new int[] {1,2,3,4,4,4,4};
        int[] tömb5 = new int[] {1,4,4,4,3,4};
        
        
        System.out.println(isConsecutiveFour(tömb1));
        System.out.println(isConsecutiveFour(tömb2));
        System.out.println(isConsecutiveFour(tömb3));
        System.out.println(isConsecutiveFour(tömb4));
        System.out.println(isConsecutiveFour(tömb5));
    }
}
