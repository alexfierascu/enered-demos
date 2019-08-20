package TesteEntitati;


import Entitati.FiguraGeometrica;
import Entitati.FiguriGeometrice;
import Entitati.FiguriGeometriceFactory;
import org.junit.jupiter.api.Test;


public class Teste {

  @Test
  public void testCerc () {

    FiguraGeometrica cerculMeu = FiguriGeometriceFactory.creazaFigura(FiguriGeometrice.CERC);
    cerculMeu.calculeazaPerimetru();
    cerculMeu.afiseazaPerimetru();
  }


  @Test
  public void testPatrat () {

    FiguraGeometrica patratulMeu = FiguriGeometriceFactory.creazaFigura(FiguriGeometrice.PATRAT);
    patratulMeu.calculeazaPerimetru();
    patratulMeu.afiseazaPerimetru();
  }


  @Test
  public void testDreptunghi () {

    FiguraGeometrica
        dreptunghiulMeu
        = FiguriGeometriceFactory.creazaFigura(FiguriGeometrice.DREPUNGHI);
    dreptunghiulMeu.calculeazaPerimetru();
    dreptunghiulMeu.afiseazaPerimetru();
  }

}
