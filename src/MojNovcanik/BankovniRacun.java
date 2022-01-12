package MojNovcanik;

public class BankovniRacun {
    private Osoba vlasnik;
    private double stanjeNaRacunu;
    private int brojRacuna;
    private String imeBanke;

    public BankovniRacun(Osoba vlasnik) {
        this.vlasnik = vlasnik;
        this.stanjeNaRacunu = 0;
    }

    public BankovniRacun(Osoba vlasnik, double stanjeNaRacunu, int brojRacuna, String imeBanke) {
        this.vlasnik = vlasnik;
        this.stanjeNaRacunu = stanjeNaRacunu;
        this.brojRacuna = brojRacuna;
        this.imeBanke = imeBanke;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String getImeBanke() {
        return imeBanke;
    }

    public void setImeBanke(String imeBanke) {
        this.imeBanke = imeBanke;
    }

    public void uplata(double iznos){
        stanjeNaRacunu = stanjeNaRacunu + iznos;
    }

    public void isplata(double iznos){
        if(iznos > stanjeNaRacunu){
            System.out.println("Nemate dovoljno sredstava");
        }
        else{
            stanjeNaRacunu = stanjeNaRacunu - iznos;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(vlasnik != null) {
            sb.append("Vlasnik racuna je: ");
            sb.append(vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
            sb.append("\n");
        }
        else{
            sb.append("Racun nema vlasnika");
        }
        sb.append("Stanje na racunu je: ");
        sb.append(stanjeNaRacunu);
        sb.append("\n");
        sb.append("Broj racuna je : ");
        sb.append(brojRacuna);
        sb.append("\n");
        return sb.toString();
    }
}
