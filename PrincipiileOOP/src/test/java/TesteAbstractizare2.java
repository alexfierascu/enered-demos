import Abstractizare2.Directie;
import Abstractizare2.OperareMasinaBMW750i;
import org.junit.jupiter.api.Test;


public class TesteAbstractizare2 {


  @Test
  public void test1 () {

    OperareMasinaBMW750i A = new OperareMasinaBMW750i();
    A.signalTurn(Directie.STANGA, false);
    A.signalTurn(Directie.STANGA, true);
  }

}
