/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Szavak {
    private String angolszo;
    private String magyarszo;

    public Szavak(String angolszo, String magyarszo) {
        this.angolszo = angolszo;
        this.magyarszo = magyarszo;
    }

    public String getAngolszo() {
        return angolszo;
    }

    public String getMagyarszo() {
        return magyarszo;
    }

    @Override
    public String toString() {
        return this.angolszo+":"+this.magyarszo;
    }
    
    
}
