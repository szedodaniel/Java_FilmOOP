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
public class Vhs extends Film {
    
    private int szalagHossz;
    public Vhs(String nev, int korhatar, int szalagHossz){
        super(nev,korhatar);
        this.szalagHossz = szalagHossz;
    }

    public int getSzalagHossz() {
        return szalagHossz;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ szalagHossz+"perc";
    }
    
}
