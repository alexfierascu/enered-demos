


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Spanzuratoarea2 {

  public static void main (String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Dati cuvantul");
      String cuvantCitit = in.readLine().trim();
      StringBuffer cuvantAscuns  = new StringBuffer();
      for (int i = 0; i < cuvantCitit.length(); i++)
        cuvantAscuns.append('*');
      int greseli = 0;
      int numarGreseliPermise=5;
      boolean flag;
      while ((greseli < numarGreseliPermise) && (!cuvantCitit.contentEquals(cuvantAscuns))) {
        System.out.println(cuvantAscuns);
        System.out.println("Dati o litera");
        char literaCitita = in.readLine().charAt(0);
        flag = false;
        for (int i = 0; i < cuvantCitit.length(); i++)
          if (literaCitita == cuvantCitit.charAt(i)) {
            cuvantAscuns.setCharAt(i, cuvantCitit.charAt(i));
            flag = true;
          }
        if (flag) {
          System.out.println("Litera ghicita! Continua!");
        } else if (!flag) {
          greseli++;
          System.out.println("Gresit! Ai facut pana acum " + greseli + " greseli! Mai ai dreptul " +
                                 "la " + (numarGreseliPermise - greseli) + " incercari!");
        }


      }
      if ((greseli < numarGreseliPermise) && (cuvantCitit.contentEquals(cuvantAscuns)))
        System.out.println("Felicitari!!! Ai ghicit cuvantul!");
      else
        System.out.println("Prea multe incercari gresite. Mai incearca!");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
