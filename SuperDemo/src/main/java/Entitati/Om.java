package Entitati;


public class Om {


  private int varsta;

  private String nume;

  private String functie;


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


  public String getFunctie () {

    return functie;
  }


  public void setFunctie (String functie) {

    this.functie = functie;
  }


  public Om (int v, String n, String f) {

    this.varsta = v;
    this.nume = n;
    this.functie = f;
  }


  Om () {

  }


  public void afisareCaracteristiciOm () {

    System.out.println("Omul are urmatoarele caracterisitici :" +
                           "\n varsta = " + getVarsta() +
                           "\n nume =" + getNume() +
                           "\n functie =" + getFunctie());
  }
}
