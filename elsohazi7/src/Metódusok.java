/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Metódusok {
    public static void novekvo(int a, int b, int c) {
        int[] t = new int[3];
        t[0] = a;
        t[1] = b;
        t[2] = c;
        for (int i = 0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if(t[i]<t[j]) {
                    int asd = t[i];
                    t[i] = t[j];
                    t[j] = asd;
                }
            }
        }
        System.out.println(t[0]+", "+t[1]+", "+t[2]);
    }
    
    public static void minmax (double a, double b, double c) {
        double [] t = new double[3];
        t[0] = a; t[1] = b; t[2] = c;
        double min = t[0];
        for (int i = 0; i<3; i++) {
            if ( min>t[i]) {
                min = t[i];
            }
        }
        t[0] = Math.abs(a); t[1] = Math.abs(b); t[2] = Math.abs(c);
        double max = t[0];
        for (int i = 0; i<3; i++) {
            if ( max<t[i]) {
                 max = t[i];
            }
        }
        System.out.println("Minimum: "+min+", Abszolút érték maximuma: "+max);
    }
    
    public static void abcd(double a, double b, double c, double d) {
        System.out.println(a+", "+b+", "+c+", "+d);
        if (d > 0 || d == 0) {
            System.out.println(a+", "+c+", "+b+", "+d);
        } else {
            System.out.println(a+", "+b+", "+d+", "+c);
        }
    }
    
    public static int szokoev(int a, int b) {
        int szokoevek = 0;
        for(double i=a; i < b; i++) {
            if (i%4==0) {
                if (i%100>0) {
                    szokoevek++;
                } else if(i%400== 0) {
                    szokoevek++;
                }
            }
        }
        return szokoevek;
    }
    
    public static boolean haromszog(double a, double b, double c) {
        if (a<b+c && b<a+c && c < b+a) {
            return true;
        } else {
            return false;  
        }

    }
    
    public static void jegyek(int a){
        switch(a) {
            case 1:
                System.out.println("Elégtelen!");
                break;
            case 2: 
                System.out.println("Elégséges!");
                break;
            case 3: 
                System.out.println("Közepes!");
                break;
            case 4:
                System.out.println("Jó!");
                break;
            case 5:
                System.out.println("Kiváló!");
                break;
            default: 
                System.out.println("Nincs ilyen jegy!");
        }
    }
    public static int hanyados(int a, int b) {
        int hanyados = 0;
        while(a>=b){
            hanyados++;
            a = a-b;
        }
        return hanyados;       
    }
    
    public static boolean prime(int a) {
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }
    
    public static void fibonacci(int n) {
        int n1=0,n2=1,n3;    
        System.out.println(n1+"\n"+n2);    
        for(int i=2;i<n;++i)   
        {    
            n3=n1+n2;    
            System.out.println(n3);    
            n1=n2;   
            n2=n3;    
        }   
    }
    
    public static int reverse(int a) {
        int r = 0;
        while(a != 0) {
            int szam = a % 10;
            r = r*10+szam;
            a /= 10;
        }
        return r;
    }
    
    public static long factorial(int szam) {
        long f = 1;
        for (int i = 1; i <= szam; i++) {
            f = f*i;
        }
        return f;
    }
    
    public static int fibonacci2(int n) {
        int n1=0,n2=1,n3;      
        for(int i=2;i<n+1;++i)   
        {    
            n3=n1+n2;    
            if(n3>n) {
                return n3;
            }
            n1=n2;   
            n2=n3;    
        }   
        System.out.println("Nincs ilyen fibonacci szám");
        return 0;
    }
    
    public static void main(String[] args) {
        novekvo(16,23,2);
        minmax(-1,1.3,4.5);
        abcd(1.5,3.5,4,2);
        System.out.println(szokoev(2020,2034));
        System.out.println(haromszog(1,2,3));
        jegyek(2);
        System.out.println(hanyados(100,5));
        System.out.println(prime(5273));
        fibonacci(3);
        System.out.println(reverse(1234));
        System.out.println(reverse(987654321));
        System.out.println(factorial(12));
        System.out.println(fibonacci2(100));
        
    }
}
