package games;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;


public class GuessGame {

  static Scanner scanner = new Scanner(System.in);


  public static void main (String[] args) throws IOException {

    System.out.println(citireIndictii());

    String cuvantGhicit = scanner.nextLine();
    if (cuvantGhicit.equals(citireCuvant())) {
      System.out.println("felicitari!");
    } else {
      System.out.println("mai incearca!!!");
    }

  }


  static String citireCuvant () {

    String valoareaDeGhicit = null;
    String path = "C:\\proiecte\\EnerED\\EneredDemos\\Java101\\src\\main\\resources" +
        "\\spanzuratoare.txt";
    StringBuilder content = new StringBuilder();
    try (Stream<String> stream = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
      stream.forEach(s -> content.append(s));
    } catch (IOException e) {
      e.printStackTrace();
    }
    valoareaDeGhicit = content.toString();
    return valoareaDeGhicit;
  }


  static String citireIndictii () {

    String path = "C:\\proiecte\\EnerED\\EneredDemos\\Java101\\src\\main\\resources" +
        "\\indicii.txt";
    StringBuilder content = new StringBuilder();
    try (Stream<String> stream = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
      stream.forEach(s -> content.append(s).append("\n"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return content.toString();
  }




  static void linia32() throws IOException {
    String line32 = Files.readAllLines(Paths.get("C:\\proiecte\\EnerED\\EneredDemos\\Java101\\src" +
                                                     "\\main\\resources\\indicii.txt")).get(31);
    System.out.println(line32);
  }
}
