public class Interschimbare2Valori {

  public static void main (String[] args) {

    interschimbare1(9, 8);
    interschimbare2(10, 11);
    interschimbare3(99,100);
  }


  static void interschimbare1 (int a, int b) {

    System.out.println("----------");
    System.out.println("----------");
    int c = a;
    a = b;
    b = c;

    System.out.println("a este " + a);
    System.out.println("b este " + b);
  }


  static void interschimbare2 (int a, int b) {

    System.out.println("----------");
    System.out.println("----------");
    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("a este " + a);
    System.out.println("b este " + b);
  }

  static void interschimbare3 (int a, int b) {

    System.out.println("----------");
    System.out.println("----------");
    a = a * b;
    b = a / b;
    a = a / b;

    System.out.println("a este " + a);
    System.out.println("b este " + b);
  }

}
