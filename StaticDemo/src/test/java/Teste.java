import Entitati.Om;
import org.junit.jupiter.api.Test;


public class Teste {

  @Test
  public void testOm () {

    Om Paul = new Om();
    Paul.afisareVarsta();
    System.out.println("----------------------------------" +
                           "\n----------------------------------");
    Paul.afisareNume();
  }

}
