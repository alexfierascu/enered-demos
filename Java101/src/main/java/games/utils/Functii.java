package games.utils;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;


public class Functii {

  public static String citireCuvant () {

    String valoareGhicit = null;
    String
        path
        = "C:\\proiecte\\EnerED\\EneredDemos\\Java101\\src\\main\\resources\\spanzuratoare.txt";
    StringBuilder content = new StringBuilder();
    try (Stream<String> lines = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
      lines.forEach(s -> content.append(s));
    } catch (IOException e) {
      e.printStackTrace();
    }
    valoareGhicit = content.toString();
    return valoareGhicit;
  }


  public static void afisareCuvantModAscuns (String s) {

    for (int i = 0; i < s.length(); i++) {
      System.out.print("*");
    }
    System.out.println("\n");
  }


  public static char citireLitera () {

    Scanner scan = new Scanner(System.in);
    System.out.print("Introdu o litera: ");
    char x = scan.next().charAt(0);
    scan.close();
    return x;
  }

  public static char[] stringToCharArray (String s) {

    char[] sChars = s.toCharArray();
//    for (char output : sChars) {
//      System.out.println(output);
//    }
    return sChars;
  }


  public static void ghicireCuvant () {

    int count = 0;
    while (count < 7) {
      char literaCitita = citireLitera();
      char[] litereCuvant = stringToCharArray(citireCuvant());
      for (int i = 0; i < litereCuvant.length; i++) {

        if (literaCitita == litereCuvant[i]) {
          System.out.print(literaCitita);
        } else {
          System.out.print("*");
        }
        count++;
      }
    }
  }
}



