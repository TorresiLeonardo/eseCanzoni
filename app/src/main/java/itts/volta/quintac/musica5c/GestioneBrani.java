package itts.volta.quintac.musica5c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestioneBrani implements Serializable {

    List<Brano> listBrani;

    public GestioneBrani(){
        listBrani= new ArrayList<Brano>();
    }

    public void addBrano(String titolo, String autore, String genere, int durata){
        Brano br= new Brano(titolo, durata, genere, autore);
        listBrani.add(br);
    }

    public String visualizza(){
        StringBuilder sbBrani= new StringBuilder();
        for(Brano brc : listBrani){
            sbBrani.append(brc.getTitolo().toString() + " - ");
            sbBrani.append(brc.getAutore().toString() + " - ");
            sbBrani.append(brc.getGenere().toString() + " - ");
            sbBrani.append(Integer.toString(brc.getDurata()) + " \n ");
        }
        return sbBrani.toString();
    }
}
