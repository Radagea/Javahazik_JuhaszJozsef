/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Tea {
    public String nev;
    public int ár;
    public Tea(String s,int j) {
        nev=s;
        ár=j;
    }
        public boolean egyenlo(Object o) 
    {
        Tea k = (Tea)o;
        return this.ár == k.ár;
    }

   
    public boolean nagyobbMint(Object o) 
    {
        Tea k = (Tea)o;
        return this.ár > k.ár;
    }

   
    public boolean kisebbMint(Object o) {
        Tea k = (Tea)o;
        return this.ár < k.ár;
    }
}
