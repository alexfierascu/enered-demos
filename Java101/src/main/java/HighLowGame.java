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
      if(numarGhicit<numarDeGhicit)
      {
        System.out.println("Incercati cu un numar mai mare!");
        numarIncercari++;
      }
      else if(numarGhicit>numarDeGhicit)
      {
        System.out.println("Incercati cu un numar mai mic!");
        numarIncercari++;
      } else {
        System.out.println("Numarul ghicit! Acesta este " + numarDeGhicit);
        numarIncercari++;
      }
    }
    System.out.println("Ati ghicit numarul " + numarDeGhicit + " din " + numarIncercari +
                           " incercari!");
  }

  static int generateRandomNumber() {

    Random random = new Random();
    int number= random.nextInt(10);
    return number;
  }

}
