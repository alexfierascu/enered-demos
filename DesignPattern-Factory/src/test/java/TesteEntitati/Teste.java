package TesteEntitati;


import Entitati.FiguraGeometrica;
import Entitati.FiguriGeometrice;
import Entitati.FiguriGeometriceFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Teste {

  @Test
  private void testCerc () {

    FiguraGeometrica cerculMeu = FiguriGeometriceFactory.creazaFigura(FiguriGeometrice.CERC);
    cerculMeu.calculeazaPerimetru();
    Assertions.assertEquals(77.28317927830892, cerculMeu.calculeazaPerimetru());
    cerculMeu.afiseazaPerimetru();
  }


  @Test
  private void testPatrat () {

    FiguraGeometrica patratulMeu = FiguriGeometriceFactory.creazaFigura(FiguriGeometrice.PATRAT);
    patratulMeu.calculeazaPerimetru();
    Assertions.assertEquals(20, patratulMeu.calculeazaPerimetru());
    patratulMeu.afiseazaPerimetru();
  }


  @Test
  private void testDreptunghi () {

    FiguraGeometrica
        dreptunghiulMeu
        = FiguriGeometriceFactory.creazaFigura(FiguriGeometrice.DREPUNGHI);
    dreptunghiulMeu.calculeazaPerimetru();
    Assertions.assertEquals(18, dreptunghiulMeu.calculeazaPerimetru());
    dreptunghiulMeu.afiseazaPerimetru();
  }

}
