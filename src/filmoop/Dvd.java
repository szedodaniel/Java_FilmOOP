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
public class Dvd extends Film{
    
    private String[] nyelvek;
    public Dvd(String nev, int korhatar, String[] nyelvek){
        
        super(nev, korhatar);
        this.nyelvek = nyelvek;
        
    }
    
    public int nyelvekSzama(){
        return this.nyelvek.length;
    }

    @Override
    public String toString() {
        String s = super.toString()+" [";
             
        for (String ny:this.nyelvek) {
            s+=" "+ny;
        }
        return s+" ]";
    }
    
}
