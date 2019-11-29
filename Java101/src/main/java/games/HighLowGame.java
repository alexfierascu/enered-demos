package games;


import java.util.Random;
import java.util.Scanner;


public class HighLowGame {

  public static void main (String[] args) {
    highLow();
  }

  static void highLow()
  {
    int numarDeGhicit = generateRandomNumber();
    Scanner scanner = new Scanner(System.in);
    int numarGhicit=-1;
    int numarIncercari =0;
    while(numarGhicit!=numarDeGhicit) {
      System.out.println("Introduceti un numar");
      numarGhicit=scanner.nextInt();
      numarIncercari++;
      if(numarGhicit<numarDeGhicit)
      {
        System.out.println("Incercati cu un numar mai mare!");

      }
      else if(numarGhicit>numarDeGhicit)
      {
        System.out.println("Incercati cu un numar mai mic!");
      } else {
        System.out.println("Numarul ghicit! Acesta este " + numarDeGhicit);
      }
    }
    System.out.println("Ati ghicit numarul " + numarDeGhicit + " din " + numarIncercari +
                           " incercari!");
  }

  static int generateRandomNumber() {

    Random random = new Random();
    int number= random.nextInt(100);
    return number;
  }

}
