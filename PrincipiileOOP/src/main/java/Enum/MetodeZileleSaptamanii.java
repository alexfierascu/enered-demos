package Enum;


public class MetodeZileleSaptamanii {

  public void AfisareProgram (ZileleSaptamanii zi) {

    switch (zi) {
      case LUNI:
        System.out.println("Este luni si am de facut ...");
        break;
      case MARTI:
        System.out.println("Este marti si am de facut ...");
        break;
      default:
        System.out.println("Ziua nu a fost gasita");
        break;
    }
  }

}
