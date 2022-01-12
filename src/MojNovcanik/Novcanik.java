package MojNovcanik;

public class Novcanik {
   private Banka banka;
   private BankovniRacun bankovniRacun;
   private double iznosNaRacunu;
   private Osoba osoba;
   private String lozinka;

   public Novcanik(Banka banka, int brojRacuna, double iznosNaRacunu, Osoba osoba, String lozinka) {
      this.banka = banka;
      this.bankovniRacun = bankovniRacun;
      this.iznosNaRacunu = iznosNaRacunu;
      this.osoba = osoba;
      this.lozinka = lozinka;
   }

   public Banka getBanka() {
      return banka;
   }

   public void setBanka(Banka banka) {
      this.banka = banka;
   }

   public BankovniRacun getBankovniRacun() {
      return bankovniRacun;
   }

   public void setBankovniRacun(BankovniRacun bankovniRacun) {
      this.bankovniRacun = bankovniRacun;
   }

   public double getIznosNaRacunu() {
      return iznosNaRacunu;
   }

   public void setIznosNaRacunu(double iznosNaRacunu) {
      this.iznosNaRacunu = iznosNaRacunu;
   }

   public Osoba getOsoba() {
      return osoba;
   }

   public void setOsoba(Osoba osoba) {
      this.osoba = osoba;
   }

   public String getLozinka() {
      return lozinka;
   }

   public void setLozinka(String lozinka) {
      this.lozinka = lozinka;
   }

   /* loginRegister metoda */
//   public String loginRegister(int opcija){
//      return opcija;
//   }
//   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Ime vase banke je: ");
      sb.append(banka.getIme());
      sb.append("\n");

      sb.append("Broj racuna je: ");
      sb.append(bankovniRacun.getBrojRacuna());
      sb.append("\n");

      sb.append("Iznos na racunu je : ");
      sb.append(bankovniRacun.getStanjeNaRacunu());
      sb.append("\n");

      sb.append("Vlasnik racuna je : ");
      sb.append(osoba.getIme());
      sb.append(" ");
      sb.append(osoba.getPrezime());
      sb.append("\n");

      return sb.toString();
   }
}
