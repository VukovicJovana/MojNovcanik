package MojNovcanik;

import java.util.Scanner;


public class TestNovcanik {
    static boolean loged = false;
    static boolean exit = true;
    public static void main(String[] args) {
          Korisnik korisnik1 = new Korisnik("", "", 0, "", "", 0, "");
          BankovniRacun br1 = new BankovniRacun(korisnik1, 1000, korisnik1.brojRacuna, Korisnik.imeBanke);


        Scanner sc = new Scanner(System.in);

        while(exit){

        while(!loged){
            String opcija = Opcije.dobrodosli();
            if(opcija.equals("1")){
                System.out.println("Unesite korisnicko ime: ");
                System.out.println("Unesite Exit za izlazak iz aplikacije.");
                String korisnickoIme = sc.next();
                System.out.println("Unesite lozinku: ");
                System.out.println("Unesite Exit za izlazak iz aplikacije.");
                String lozinka = sc.next();

                    if(korisnickoIme.equals(korisnik1.korisnickoIme) && lozinka.equals(korisnik1.lozinka)){
                        loged = true;
                        while(loged){
                            Opcije.ispisUspesanLogin(korisnik1);
                            String opcijaLogedIn = sc.next();
                            Opcije.opcijaUplataIsplata(opcijaLogedIn, br1, korisnik1);

                        }
                    }

                    else {
                        System.out.println("Pogresno ili nepostojece korisnicko ime ili lozinka");

                    }

            } else if(opcija.equals("2")) {
                  korisnik1 = Opcije.registracija();
            } else {
                System.out.println("Nepostojeca opcija, pokusajte ponovo.");
                Opcije.dobrodosli();
            }}

            if(sc.next().equals("Exit")){
                exit=false;
            }


        }

    }
}
