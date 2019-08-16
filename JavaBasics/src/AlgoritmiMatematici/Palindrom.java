package AlgoritmiMatematici;


import java.util.Scanner;


public class Palindrom {

  public static void main (String args[]) {


    System.out.println("--Rezolvare PALINDROM--");
    System.out.println("Introduceti un numar intreg ");
    Scanner input = new Scanner(System.in);
    int numarCititTastatura = input.nextInt();
    boolean raspunsFinal = estePalindrom(numarCititTastatura);
    System.out.println(raspunsFinal);
  }


  public static int inversulNumarului (int numar) {

    int rezultat = 0;
    int ultimaCifra;
    while (numar > 0) {

      ultimaCifra = numar % 10;
      numar = numar / 10;
      rezultat = rezultat * 10 + ultimaCifra;
    }

    return rezultat;

  }


  public static boolean estePalindrom (int numar) {

    int n = inversulNumarului(numar); // apelam functia inversulNumarului definita mai sus
    boolean rezultat; // declarat variabila rezultat
    if (n == numar) {
      rezultat = true;
      System.out.println("Numarul " + numar + " este PALINDROM");
    } else {
      rezultat = false;
      System.out.println("Numarul " + numar + " nu este PALINDROM");
    }
    return rezultat;
  }


}
