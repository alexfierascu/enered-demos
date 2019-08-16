package Entitati;


public class Telefon {

  private String telefon = "07545874";


  public void setTelefon (String telefon) {

    String numarTelefon;
    numarTelefon = telefon;
  }


  public void setNr (String nr) {

    this.telefon = nr;
  }


  public void afisareNrTelefon () {

    System.out.println(telefon);
  }
}
