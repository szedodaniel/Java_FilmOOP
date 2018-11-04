/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmoop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class FilmOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Film f1 = new Film("Dumb & Dumber",12);
        Film f2 = new Film("A Wall street farkasa",16);
        Vhs v1 = new Vhs("Rambo",16,180);
        Vhs v2 = new Vhs("Nyolcadik utas a halál",18,240);
        Dvd d1 = new Dvd("13. kísértet",16,new String[]{"en","hu","de","es","it","ru"});
        Dvd d2 = new Dvd("Trainspotting ",18,new String[]{"en","hu","fr"});
        
        List<Film> filmek = new ArrayList<>();
        filmek.add(f1);
        filmek.add(f2);
        filmek.add(v1);
        filmek.add(v2);
        filmek.add(d1);
        filmek.add(d2);
        
        for (Film f: filmek) {
            System.out.println(f);
        }
        int max = 0;
        String maxCim ="";
        for (Film f: filmek) {
            if(f.getClass().equals(Vhs.class)){
                Vhs kazetta = (Vhs)f;
                if(max < kazetta.getSzalagHossz())
                max = kazetta.getSzalagHossz();
                maxCim = f.getCim();
            }
        }
        System.out.println(maxCim+", hossza: "+max);
        int maxNyelv = 0;
        String maxNyelvCim ="";
        for (int i = 0; i < filmek.size(); i++) {
            if(filmek.get(i).getClass() == Dvd.class){
                Dvd dvdFilm = (Dvd)filmek.get(i);
                if(dvdFilm.nyelvekSzama() > maxNyelv){
                    maxNyelv = dvdFilm.nyelvekSzama();
                    maxNyelvCim = dvdFilm.getCim();
                }
            }
        }
        System.out.println(maxNyelvCim+", elérhető a legtöbb nyelven "+maxNyelv);
    }
    
}
