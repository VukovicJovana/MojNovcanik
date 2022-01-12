package MojNovcanik;

public class Osoba {
    // polje (atribut) klase
    private String ime;
    private String prezime;
    private int godinaRodjenja;
//    private double visina;

    // konstruktor metoda
    // nema povratnu vrednost!
    // ime te metode je uvek isto kao ime klase
    public Osoba(String ime1, String prezime1, int godinaRodjenja1){
        ime = ime1;
        prezime = prezime1;
        godinaRodjenja = godinaRodjenja1;
//        visina = visina1;
    }

    // getter i setter za ime
    public String getIme(){
        return ime;
    }
    public void setIme(String ime1){
        ime = ime1;
    }
    // getter i setter za prezime
    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String prezime1){
        prezime = prezime1;
    }

    //getter i setter za godina rodjenja
    public int getGodinaRodjenja(){
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja1){
        if(godinaRodjenja1 > 2022) {
            System.out.println("Losa godina reodjenja.");
        }
        else{
            godinaRodjenja = godinaRodjenja1;
        }
    }

    // getter i setter za visinu
//    public double getVisina(){
//        return visina;
//    }
//
//    public void setVisina(double visina1){
//        if(visina1 < 0){
//            System.out.println("Visina je negativna!");
//        }
//        else{
//            visina = visina1;
//        }
//    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime osobe je: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Prezime osobe je: ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Godina rodjenja osobe je: ");
        sb.append(godinaRodjenja);
        sb.append("\n");

//        sb.append("Visina osobe je: ");
//        sb.append(visina);
//        sb.append("\n");
        return sb.toString();
    }
}
