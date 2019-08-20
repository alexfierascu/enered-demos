package Entitati;


public abstract class FiguriGeometriceFactory {

  public static FiguraGeometrica creazaFigura (FiguriGeometrice figura) {

    FiguraGeometrica abcd = null;

    switch (figura) {
      case PATRAT:
        abcd = new Patrat();
        ((Patrat) abcd).setLatura(5);
        break;
      case DREPUNGHI:
        abcd = new Dreptunghi();
        ((Dreptunghi) abcd).setLatime(4);
        ((Dreptunghi) abcd).setLungime(5);
        break;
      case CERC:
        abcd = new Cerc();
        ((Cerc) abcd).setRaza(12.3);
        break;
      default:
        System.out.println("figura geometrica nu a fost definita");
        break;
    }

    return abcd;
  }

}
