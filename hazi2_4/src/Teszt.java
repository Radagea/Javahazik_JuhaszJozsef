/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Teszt {
    
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher) {
        Teherautó ideig;
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (teher[i].getMaxSzállíthatóTeher() > teher[j].getMaxSzállíthatóTeher() ) {
                    ideig = teher[i];
                    teher[i] = teher[j];
                    teher[j] = ideig;
                }
            }
        }
    }
    
    public static void keresMaxMotorTeljesítmény(Autó[] auto) {
        Autó max = auto[0];
        for (int i = 1; i < 10; i++) {
            if (auto[i].getMotorTeljesítmény() > max.getMotorTeljesítmény()) {
                max = auto[i];
            }
        }
        System.out.println("A maximum motor teljesítményű autó: "+max);
    }
    
    
    
    public static void main(String[] args) {
        Autó[] autók = new Autó[10];

        autók[0] = new Autó("Rendszám1", 100);
        autók[1] = new Autó("Rendszám2", 200);
        autók[2] = new Autó("Rendszám3", 300);
        autók[3] = new Autó("Rendszám4", 400);
        autók[4] = new Autó("Rendszám5", 500);
        autók[5] = new Teherautó("Rendszám6", 600, 100);
        autók[6] = new Teherautó("Rendszám7", 700, 200);
        autók[7] = new Teherautó("Rendszám8", 800, 300);
        autók[8] = new Teherautó("Rendszám9", 900, 400);
        autók[9] = new Teherautó("Rendszám10", 1000, 500); 

        Teherautó[] teher = new Teherautó[10];

        teher[0] = new Teherautó ("TRendszám2", 200, 6000);
        teher[1] = new Teherautó ("TRendszám3", 300, 3000);
        teher[2] = new Teherautó ("TRendszám4", 400, 8000);
        teher[3] = new Teherautó ("TRendszám5", 500, 5000);
        teher[4] = new Teherautó ("TRendszám6", 600, 2000);
        teher[5] = new Teherautó ("TRendszám7", 700, 3000);
        teher[6] = new Teherautó ("TRendszám8", 800, 4000);
        teher[7] = new Teherautó ("TRendszám9", 900, 5000);
        teher[8] = new Teherautó ("TRendszám10", 1000, 10000);
        teher[9] = new Teherautó ("TRendszám11", 10000, 18880);
        
        System.out.println("Tömb: ");
        for (int i = 0; i < 10; i++) {
           System.out.println(teher[i]);
        }
        
        rendezMaxSzállíthatóTeherCsökkenőleg(teher);
        
        System.out.println("Rendezett tömb: ");
        for (int i = 0; i < 10; i++) {
           System.out.println(teher[i]);
        }
        
        keresMaxMotorTeljesítmény(autók);
    }
    
}
