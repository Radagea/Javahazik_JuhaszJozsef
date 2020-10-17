/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Radagea
 */
public class Teszt {
    public static void main(String[] args) {
        
        Scanner bemenet = new Scanner(System.in);
        String[] tmp = bemenet.nextLine().split(";");
        
        Diak [] d = new Diak[Integer.parseInt(tmp[0])];
        
        d[0] = new Diak(tmp[1],"","piros");
        String kit = tmp[2];
        
        for(int i = 1;i < d.length;i++)
        {
           tmp = bemenet.nextLine().split(";");
           d[i] = new Diak(tmp[0],tmp[1],"");
        }
        
        for(int i = 1;i<d.length;i++)
        {
            int k = i;
            
            while(k < d.length)
            {
                if(d[k].getElozo().equals((d[i-1]).getNev()))
                {
                    if(d[i-1].getSapka().equals("piros"))
                        d[k].setSapka("kék");
                    else
                        d[k].setSapka("piros");
                    
                    Diak tmp1 = d[i];
                    d[i] = d[k];
                    d[k] = tmp1;
                    
                    break;
                }
                k++;   
                
            }     

        }
        int piros = 0;
        int kek = 0;
        
        for(int i = 0;i<d.length;++i)
        {
            if(d[i].getNev().equals(kit))
            {
                System.out.println(piros+" "+kek);
            }
            if(i%2 == 0)
                piros++;
            else
                kek++;
        }
        
        
    }
    
}
