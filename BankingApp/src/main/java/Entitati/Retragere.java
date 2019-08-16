package Entitati;


public class Retragere extends ContBancar {

  String category;


  public Retragere (int id, String descriere, String data, int suma, String category) {

    super(id, descriere, data, suma);
    this.category = category;
  }


  @Override
  public String toString () {

    return "Retragere [category=" + category + ", data=" + data + ", suma=-" + suma + "]";
  }
}
