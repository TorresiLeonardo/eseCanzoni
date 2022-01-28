package itts.volta.quintac.musica5c;

import java.util.Date;

public class Brano {

    private String titolo;
    private String autore;
    private String genere;
    private int durata;

    public Brano(String titolo, int durata, String genere, String autore) {
        this.titolo = titolo;
        this.durata = durata;
        this.genere= genere;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }
    public int getDurata() {
        return durata;
    }
    public String getAutore(){
        return this.autore;
    }
    public String getGenere(){
        return this.genere;
    }

    public void setTitolo(String titolo) {
        this.titolo=titolo;
    }
    public void setDurata( int durata) {
        this.durata=durata;
    }
    public void setAutore(String autore){
        this.autore=autore;
    }
    public void setGenere(String genere){
        this.genere=genere;
    }

}
