package Entitati;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Patrat implements FiguraGeometrica {

  private double latura;


  @Override
  public double calculeazaPerimetru () {

    return latura * 4;
  }


  @Override
  public void afiseazaPerimetru () {

    System.out.println("\nPerimetrul patrului este de " + calculeazaPerimetru());
  }


}
