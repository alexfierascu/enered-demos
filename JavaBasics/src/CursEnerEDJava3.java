public class CursEnerEDJava3 {

  public static void main (String args[]) {

    System.out.println("program care calculeaza suma a 2 numere");

    int valoareSuma, valoareDiferenta, valoareInmultire, valoareImpartire;
    valoareSuma = suma(2, 3);
    valoareDiferenta = diferenta(4, 5);
    valoareInmultire = inmultirea(4, 5);
    valoareImpartire = impartirea(4, 2);

    System.out.println("Suma numerelor este " + valoareSuma);
    System.out.println("Diferenta numerelor este " + valoareDiferenta);
    System.out.println("Inmultirea numerelor este " + valoareInmultire);
    System.out.println("Impartirea numerelor este " + valoareImpartire);
  }


  static int suma (int a, int b) {

    int sumaNumerelor = a + b;
    return sumaNumerelor;
  }


  static int diferenta (int a, int b) {

    int diferentaNumerelor = a - b;
    return diferentaNumerelor;
  }


  static int inmultirea (int a, int b) {

    int inmultireaNumerelor = a * b;
    return inmultireaNumerelor;
  }


  static int impartirea (int a, int b) {

    int impartireaNumerelor = a / b;
    return impartireaNumerelor;
  }
}
