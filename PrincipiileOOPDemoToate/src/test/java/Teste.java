import Entitati.Cars;
import org.junit.jupiter.api.Test;


public class Teste {

  @Test
  public void test1 () {

    Cars newCar = new Cars();
    newCar.maxSpeed(250);
    newCar.expensiveCar();
    newCar.setFaruriXenon("Are");
    newCar.getFaruriXenon();
    newCar.setJanteMari(false);
    newCar.isJanteMari();
    newCar.sportCar(true);
    newCar.sportCar(false, "dacia");
    newCar.sportCar(false, "aro");
  }

}
