package MojNovcanik;

import java.util.Scanner;

public class Opcije {
    static Scanner sc = new Scanner(System.in);
    public static String dobrodosli(){
        System.out.println("Dobrodosli u Moj Novcanik. Za izlazak iz aplikacije otkucajte 'Exit'.");
        System.out.println("Odaberite redni broj opcije: ");
        System.out.println("1. Login");
        System.out.println("2. Register");
        String opcija = sc.next();
        return opcija;
    }
    public static void  opcijaUplataIsplata(String a, BankovniRacun br, Korisnik k1){
//        Scanner sc = new Scanner(System.in);
            switch(a) {
            case "1":
                System.out.println("Unesite iznos za isplatu: ");
                System.out.println("0. Nazad");
                int iznosIsplata = sc.nextInt();
                if (iznosIsplata != 0) {
                    br.isplata(iznosIsplata);
                    System.out.println("Novo stanje na racunu je: " + br.getStanjeNaRacunu());
                }
                break;
                case "2":
                System.out.println("Unesite iznos za uplatu: ");
                System.out.println("0. Nazad");
                int iznosUplata = sc.nextInt();
                if (iznosUplata != 0) {
                    br.uplata(iznosUplata);
                    System.out.println("Novo stanje na racunu je: " + br.getStanjeNaRacunu());
                }
                break;

                case "3":
                    System.out.println("Stanje na racunu je: " + br.getStanjeNaRacunu());
                break;
                case "4":
                    System.out.println("Unesite broj racuna koji zelite da prebacite: ");
                    int racun = sc.nextInt();
                    System.out.println("Unesite ime banke u koju zelite da prebacite racun: ");
                    String novaBanka = sc.next();
                    Korisnik.promeniBanku(racun, novaBanka);
                    System.out.println("Racun broj: " + k1.getBrojRacuna() + " je prebacen u banku " + k1.getImeBanke());
                    break;
                case "Logout":
                    TestNovcanik.loged = false;
                break;
            default:
                System.out.println("Nepostojeca opcija");
        };
    }

    public static void ispisUspesanLogin(Osoba o) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Korisnik " +  o.getIme() + " " + o.getPrezime() + " je ulogovan. Odaberite redni broj opcije: ");
        System.out.println("1. Isplata");
        System.out.println("2. Uplata");
        System.out.println("3. Provera stanja");
        System.out.println("4. Prenesite racun u drugu banku");
        System.out.println("Da biste se izlogovali otkucajte 'Logout'");

//        return nesto;
    }

    public static Korisnik registracija(){
        Korisnik o1 = new Korisnik("", "", 0, "", "", 0, "");
        System.out.println("Unesite ime: ");
        String imeKorisnika = sc.next();
        System.out.println("Unesite prezime: ");
        String prezimeKorisnika = sc.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();
        System.out.println("Unesite banku u kojoj se nalazi racun: ");
        String bankaKorisnika = sc.next();
        System.out.println("Unesite broj vaseg racuna: ");
        int racunKorisnika = sc.nextInt();
        System.out.println("Unesite korisnicko ime: ");
        String korisnickoIme = sc.next();
        System.out.println("Unesite lozinku: ");
        String lozinka = sc.next();
        System.out.println("Potvrdite lozinku: ");
        String potvrdaLozinke = sc.next();

        if(lozinka.equals(potvrdaLozinke)){
            o1 = new Korisnik(imeKorisnika, prezimeKorisnika, godinaRodjenja, korisnickoIme, lozinka, racunKorisnika, bankaKorisnika);
            System.out.println("Uspesno ste se registrovali pod korisnickim imenom " + korisnickoIme);
            System.out.println("Stanje na vasem racunu broj " + racunKorisnika + " u banci "+ bankaKorisnika + " je: 1000din");
        }
        return o1;
    }
}
