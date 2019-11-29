package games;


import java.util.Random;
import java.util.Scanner;


public class HighLow2 {

  static Scanner scanner = new Scanner(System.in);


  public static void main (String[] args) {

    int numarDeGhicit = generareNivel();
    int numarulNostru = -1;
    int counter = 0;
    while (numarDeGhicit != numarulNostru) {
      System.out.println("Incearca-ti norocul!");
      numarulNostru = scanner.nextInt();
      counter++;
      if (numarDeGhicit < numarulNostru) {
        System.out.println("Incearca cu un numar mai mic!");
      } else if (numarDeGhicit > numarulNostru) {
        System.out.println("Incearca cu un numar mai mare");
      } else {
        System.out.println("Numarul a fost ghicit!");
      }
    }
    System.out.println("Numarul de ghicit este " + numarDeGhicit);
    System.out.println("Ai ghicit numarul din " + counter + " incercari!");
  }


  static int generareNivel () {

    Random random = new Random();
    int numarDeGhicit = 0;
    System.out.println("Alegeti un nivel! Nivelurile disponibile - mic/ mediu/ mare");
    String nivel = scanner.nextLine();
    switch (nivel) {
      case "mic":
        numarDeGhicit = random.nextInt(10);
        break;
      case "mediu":
        numarDeGhicit = random.nextInt(100);
        break;
      case "mare":
        numarDeGhicit = random.nextInt(200);
        break;
      default:
        System.out.println("Nivelul introdus nu este disponibil");
    }
    return numarDeGhicit;
  }

}
