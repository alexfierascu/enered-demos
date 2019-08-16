import Entitati.Masina;
import Entitati.ReprezentantaAuto;
import Entitati.ReprezentantaAutoSingleton;
import org.junit.jupiter.api.Test;


public class Teste {


  @Test
  public void TesteReprezentantaAuto () {
    //you do this for every classes that wants to get car
    ReprezentantaAuto FIAT = new ReprezentantaAuto();
    Masina stilo = FIAT.vanzareMasina();
    Masina stilo2 = FIAT.vanzareMasina();
  }


  @Test
  public void TestReprezentantaAutoSingleton () {
    /*
     * As you might realized it, the constructor for CarShop is private
     * so that no one can instantiate Car Shop anymore and we are providing
     * a single access to CarShop object, through the function getInstance.
     * Now, we simply call this in our class:
     * */
    Masina BWM = ReprezentantaAutoSingleton.getInstance().vanzareMasina();
    Masina xyz = ReprezentantaAutoSingleton.getInstance().vanzareMasina();
  }

}
