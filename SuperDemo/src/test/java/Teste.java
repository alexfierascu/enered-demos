import Entitati.Elev;
import Entitati.Om;
import org.junit.jupiter.api.Test;


public class Teste {

  @Test
  public void TestOm () {

    Om x = new Om(22, "Petru", "vanzator");
    x.afisareCaracteristiciOm();
  }


  @Test
  public void TestElev () {

    Elev y = new Elev(9, "Mihail", "elev", 3);
    y.afisareCaracteristiciElev();
  }
}
