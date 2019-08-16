package Entitati;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PC {

  private double pret;

  private String marca;

  private String nume;

  private String categorie;

  private String esteApple;


  public PC (String overpriced) {

    this.esteApple = overpriced;
  }


  public PC () {

  }
}
