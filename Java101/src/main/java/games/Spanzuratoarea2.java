package games;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Spanzuratoarea2 {

  public static void main (String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Dati cuvantul");
      String cuvantDeGhicit = in.readLine().trim();
      StringBuffer cuvantGhicit = new StringBuffer();
      for (int i = 0; i < cuvantDeGhicit.length(); i++)
        cuvantGhicit.append('_');
      int greseli = 0;
      boolean x;
      while ((greseli < 5) && (!cuvantDeGhicit.contentEquals(cuvantGhicit))) {
        System.out.println(cuvantGhicit);
        System.out.println("Dati o litera");
        char c = in.readLine().charAt(0);
        x = false;
        for (int i = 0; i < cuvantDeGhicit.length(); i++)
          if (c == cuvantDeGhicit.charAt(i)) {
            cuvantGhicit.setCharAt(i, cuvantDeGhicit.charAt(i));
            x = true;
          }
        if (x) {
          System.out.println("Litera ghicita! Continua!");
        } else if (!x) {
          greseli++;
          System.out.println("Gresit! Ai facut pana acum " + greseli + " greseli! Mai ai dreptul " +
                                 "la " + (5 - greseli) + " incercari!");
        }


      }
      if ((greseli < 5) && (cuvantDeGhicit.contentEquals(cuvantGhicit)))
        System.out.println("Felicitari!!! Ai ghicit cuvantul!" +cuvantDeGhicit);
      else
        System.out.println("Prea multe incercari gresite. Mai incearca!");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
