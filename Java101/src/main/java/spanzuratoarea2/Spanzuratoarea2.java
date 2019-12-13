package spanzuratoarea2;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Spanzuratoarea2 {

  public static void main (String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Dati cuvantul");
      String cuvantDeGhicit = in.readLine().trim();
      StringBuffer cuvantGhicit = new StringBuffer();
      for (int i = 0; i < cuvantDeGhicit.length(); i++) {
        cuvantGhicit.append('_');
      }
      int greseliFacute = 0;
      int nrGreseliAcceptate = 5;
      boolean flag;

      while ((greseliFacute < nrGreseliAcceptate) && (!cuvantDeGhicit.contentEquals(cuvantGhicit))) {
        System.out.println(cuvantGhicit);
        System.out.println("Dati o litera");
        char c = in.readLine().charAt(0);
        flag = false;
        for (int i = 0; i < cuvantDeGhicit.length(); i++)
          if (c == cuvantDeGhicit.charAt(i)) {
            cuvantGhicit.setCharAt(i, cuvantDeGhicit.charAt(i));
            flag = true;
          }
        if (flag) {
          System.out.println("Litera ghicita! Continua!");
        } else if (!flag) {
          greseliFacute++;
          System.out.println("Gresit! Ai facut pana acum " + greseliFacute + " greseliFacute! Mai ai dreptul " +
                                 "la " + (nrGreseliAcceptate - greseliFacute) + " incercari!");
        }
      }
      if ((greseliFacute < nrGreseliAcceptate) && (cuvantDeGhicit.contentEquals(cuvantGhicit))) {
        System.out.println("Felicitari!!! Ai ghicit cuvantul!" + cuvantDeGhicit);
      } else {
        System.out.println("Prea multe incercari gresite. Mai incearca!");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
