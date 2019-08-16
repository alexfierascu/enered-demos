package Entitati;


public class Om {

  private int varsta;

  private String nume;


  public static void afisareVarsta () {

    System.out.println("Omul are vasta de... ");
  }


  public static void afisareNume () {

    afisareVarsta();
    System.out.println("Omul are numele ....");
  }


  public int getVarsta () {

    return varsta;
  }


  public void setVarsta (int varsta) {

    this.varsta = varsta;
  }


  public String getNume () {

    return nume;
  }


  public void setNume (String nume) {

    this.nume = nume;
  }


}
