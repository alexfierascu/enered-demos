package Exec;


import Entitati.Telefon;


public class ExecutieTelefon {

  public static void main (String args[]) {

    Telefon numarulMeu = new Telefon();

    numarulMeu.setTelefon("22");
    numarulMeu.afisareNrTelefon();
    numarulMeu.setNr("cdasdas");
    numarulMeu.afisareNrTelefon();
  }

}
