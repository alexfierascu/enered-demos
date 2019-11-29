package Entitati;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cerc implements FiguraGeometrica {

  private double raza;


  @Override
  public double calculeazaPerimetru () {

    return 2 * Math.PI * raza;
  }


  @Override
  public void afiseazaPerimetru () {

    System.out.println("\nPerimetrul cercului este de " + calculeazaPerimetru());
  }
}
