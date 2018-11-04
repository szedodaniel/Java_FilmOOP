/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmoop;

/**
 *
 * @author Diak
 */
public class Film {
    
    private String cim;
    private int korhatar;

    public Film(String cim, int korhatar) {
        this.cim = cim;
        this.korhatar = korhatar;
    }

    public String getCim() {
        return cim;
    }
     public int getKorhatar() {
        return korhatar;
    }
    public boolean getAjanlott(int eletkor){
        return eletkor >= this.getKorhatar();
    }

    @Override
    public String toString() {
        return this.cim + " " + this.korhatar;
    }
    
}
