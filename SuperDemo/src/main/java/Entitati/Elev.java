package Entitati;


public class Elev extends Om {

  private int clase;


  public int getClase () {

    return clase;
  }


  public void setClase (int clase) {

    this.clase = clase;
  }


  public Elev (int v, String n, String f, int c) {

    super(v, n, f);
    this.clase = c;
  }


  public void afisareCaracteristiciElev () {

    System.out.println("Omul are urmatoarele caracterisitici :" +
                           "\n varsta = " + getVarsta() +
                           "\n nume =" + getNume() +
                           "\n functie =" + getFunctie() +
                           "\n si este in clasa a " + getClase());
  }


}
