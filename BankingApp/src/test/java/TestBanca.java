import Entitati.ContBancar;
import Entitati.Depunere;
import Entitati.InterogareSold;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class TestBanca {

  ArrayList<ContBancar> contAlex = new ArrayList<ContBancar>();


  @Test
  public void Test1Salariu () {

    contAlex.add(new Depunere(1, "Salariu luna mai", "20190505", 10));

    InterogareSold interogare = new InterogareSold(contAlex);
    System.out.println(interogare.getBalance());
    Assertions.assertEquals(10, interogare.getBalance());
  }


  @Test
  public void Test2Demo () {

    contAlex.add(new Depunere(2, "Salariu luna iunie", "20190605", 15));

    InterogareSold interogare = new InterogareSold(contAlex);
    System.out.println(interogare.getBalance());//
    Assertions.assertEquals(14, interogare.getBalance());
  }

}
