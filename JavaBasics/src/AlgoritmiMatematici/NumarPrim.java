package AlgoritmiMatematici;


import java.util.Scanner;


public class NumarPrim {

  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Introduceti orice numar: ");
    //citeste numarul de la tastatura
    int numarCititTastatura = scan.nextInt();
    scan.close();
    //esteNumarPrin(numarCititTastatura);
    generareNumerePrimePanaLa(numarCititTastatura);
  }


  public static void esteNumarPrin (int numar) {

    int temp;
    boolean estePrim = true;
    for (int i = 2; i <= numar / 2; i++) {
      temp = numar % i;
      if (temp == 0) {
        estePrim = false;
        break;
      }
    }
    //daca estePrim este true atunci nr este prim, altfel, nu este prim
    if (estePrim)
      System.out.println(numar + " este un numar prim");
    else
      System.out.println(numar + " nu este un numar prim");
  }


  public static void generareNumerePrimePanaLa (int numar) {

    int i = 0;
    int num = 0;
    //Empty String
    String numerePrime = "";

    for (i = 1; i <= numar; i++) {
      int contor = 0;
      for (num = i; num >= 1; num--) {
        if (i % num == 0) {
          contor = contor + 1;
        }
      }
      if (contor == 2) {
        //Appended the Prime number to the String
        numerePrime = numerePrime + i + " ";
      }
    }
    System.out.println("Numerele prime de la 1 la " + numar + " sunt: ");
    System.out.println(numerePrime);

  }


  public static void generareXNumerePrime (int numar) {

  }

}
