package Entitati;


public class Depunere extends ContBancar {

  public Depunere (int id, String descriere, String data, int suma) {

    super(id, descriere, data, suma);
  }


  @Override
  public String toString () {

    return "Depunere [data=" + data + ", suma=" + suma + "]";
  }


}
