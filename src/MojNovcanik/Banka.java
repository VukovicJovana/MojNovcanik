package MojNovcanik;

import MojNovcanik.BankovniRacun;
import MojNovcanik.Osoba;

import java.util.ArrayList;

public class Banka {
    private String ime;
    private String ulica;
    private Osoba direktor;
    private ArrayList<BankovniRacun> nizBankovnihRacuna;

    public Banka(String ime, String ulica, Osoba direktor) {
        this.ime = ime;
        this.ulica = ulica;
        this.direktor = direktor;
        this.nizBankovnihRacuna = new ArrayList<BankovniRacun>();
    }

    public Banka(String ime, String ulica, Osoba direktor, ArrayList<BankovniRacun> nizBankovnihRacuna) {
        this.ime = ime;
        this.ulica = ulica;
        this.direktor = direktor;
        this.nizBankovnihRacuna = nizBankovnihRacuna;
    }

    public String getIme() {
        return ime;
    }

    public String getUlica() {
        return ulica;
    }

    public Osoba getDirektor() {
        return direktor;
    }

    public ArrayList<BankovniRacun> getNizBankovnihRacuna() {
        return nizBankovnihRacuna;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setDirektor(Osoba direktor) {
        this.direktor = direktor;
    }

    public void setNizBankovnihRacuna(ArrayList<BankovniRacun> nizBankovnihRacuna) {
        this.nizBankovnihRacuna = nizBankovnihRacuna;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime banke je: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Banka se nalazi u ulici: ");
        sb.append(ulica);
        sb.append("\n");

        sb.append("Direktor banke je: ");
        sb.append(direktor.getIme());
        sb.append(" ");
        sb.append(direktor.getPrezime());
        sb.append("\n");

        sb.append("U ovoj banci postoje sledeci racuni: ");
        sb.append("\n");
        for(BankovniRacun racun : nizBankovnihRacuna){
            sb.append(racun.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public void dodajBankovniRacun(BankovniRacun b){
        nizBankovnihRacuna.add(b);
    }
}
