import java.util.ArrayList;
import java.util.List;
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
    public static Kocsma[] adottItaltKínálóKocsmák (String ital,VendéglátóipariEgység[] t)
    {
        List<Kocsma> kocsmak = new ArrayList<>();
        
        for(int i = 0;i<t.length;++i)
        {
           if(t[i] instanceof Kocsma)
           {
               String[] sörlaplista = ((Kocsma) t[i]).getSörlap();
               
               for(int j = 0; j < sörlaplista.length;++j)
               {
                 if(sörlaplista[j].equals(ital))
                 {
                     kocsmak.add((Kocsma) t[i]);
                 }
               }        
           }
        }
        Kocsma[] KiKocsmak = new Kocsma[kocsmak.size()];
        
        for(int i = 0; i < kocsmak.size();++i)
        {
            KiKocsmak[i] = kocsmak.get(i);
        }
        return KiKocsmak;
        
    }
    
    
    
    public static void main(String[] args) {
        VendéglátóipariEgység[] asd = new VendéglátóipariEgység[10];
        
        String[] étlapLista1 = {"Étel1" , "Étel2", "Étel3"} ;
        String[] étlapLista2 = {"Étel4" , "Étel5", "Étel6"} ;
        String[] étlapLista3 = {"Étel7" , "Étel8", "Étel9"} ;
        String[] étlapLista4 = {"Étel10" , "Étel11", "Étel12"} ;
        String[] étlapLista5 = {"Étel13" , "Étel14", "Étel15"} ;
        
        String[] sörLista1 = {"Sör1", "Sör2", "Sör3"};
        String[] sörLista2 = {"Sör1", "Sör5", "Sör6"};
        String[] sörLista3 = {"Sör2", "Sör8", "Sör9"};
        String[] sörLista4 = {"Sör10", "Sör10", "Sör12"};
        String[] sörLista5 = {"Sör13", "Sör10", "Sör15"};
        
        asd[0] = new Étterem("Étterem1", 100, false,étlapLista1);
        asd[1] = new Étterem("Étterem2", 200, false,étlapLista2);
        asd[2] = new Étterem("Étterem3", 300, false,étlapLista3);
        asd[3] = new Étterem("Étterem4", 400, false,étlapLista4);
        asd[4] = new Étterem("Étterem5", 500, false,étlapLista5);
        
        asd[5] = new Kocsma(sörLista1,"Kocsma1",100,true);
        asd[6] = new Kocsma(sörLista2,"Kocsma2",200,true);
        asd[7] = new Kocsma(sörLista3,"Kocsma3",300,true);
        asd[8] = new Kocsma(sörLista4,"Kocsma4",400,true);
        asd[9] = new Kocsma(sörLista5,"Kocsma5",500,true); 
        
        for(Kocsma d: adottItaltKínálóKocsmák("Sör10", asd))
        {
            System.out.println(d.getNév());
        }
        
    }
}
