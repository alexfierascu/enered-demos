package Entitati;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Dreptunghi implements FiguraGeometrica {

  private double latime, lungime;


  @Override
  public double calculeazaPerimetru () {

    return (latime * 2 + lungime * 2);

  }


  @Override
  public void afiseazaPerimetru () {

    System.out.println("\nPerimetrul dreptunghiului este de " + calculeazaPerimetru());
  }
}
