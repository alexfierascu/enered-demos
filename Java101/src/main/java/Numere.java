public class Numere {

  public static void main (String[] args) {

    System.out.println(sumaNrConsecutive(5));
    System.out.println(parImpar(15));
    foobar(95);
  }


  static int sumaNrConsecutive (int n) {

    int suma = ((n + 1) * n) / 2;
    return suma;
  }


  static String parImpar (int n) {

    String rezultat;
    if (n % 2 == 0) {
      rezultat = "par";
    } else {
      rezultat = "impar";
    }
    return rezultat;
  }


  static void foobar (int numar) {

    for (int i = 0; i <= numar; i++) {
      System.out.println(i);
    }
    if (numar % 3 == 0) {
      System.out.println("foo");
    }
    if (numar % 5 == 0) {
      System.out.println("bar");
    }
  }

}
