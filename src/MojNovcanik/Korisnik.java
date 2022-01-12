package MojNovcanik;

public class Korisnik extends Osoba {
            public static String korisnickoIme;
            public static String lozinka;
            public static int brojRacuna;
            public static String imeBanke;

    public Korisnik(String ime1, String prezime1, int godinaRodjenja1) {
        super(ime1, prezime1, godinaRodjenja1);
    }

    public Korisnik(String ime1, String prezime1, int godinaRodjenja1, String korisnickoIme, String lozinka, int brojRacuna, String imeBanke) {
        super(ime1, prezime1, godinaRodjenja1);
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.brojRacuna = brojRacuna;
        this.imeBanke = imeBanke;
    }

//        public Korisnik(String korisnickoIme, String lozinka) {
//        super();
//            this.korisnickoIme = korisnickoIme;
//            this.lozinka = lozinka;
//    }


    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeBanke() {
        return imeBanke;
    }

    public void setImeBanke(String imeBanke) {
        this.imeBanke = imeBanke;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public static void promeniBanku(int racun, String novaBanka){
        imeBanke = novaBanka;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(korisnickoIme);
        sb.append(" ");
//        sb.append(lozinka);
        return sb.toString();
    }
}
