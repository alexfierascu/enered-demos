import Entitati.PC;
import org.junit.jupiter.api.Test;


public class Teste {

  @Test
  public void TestPCConstructorImplicit () {

    PC AlexPC = new PC();
    AlexPC.setPret(986.22);
    AlexPC.setCategorie("Business");
    AlexPC.setMarca("Dell");
    AlexPC.setNume("Lenovo 1234");

    System.out.println("Laptopul creat are urmatoarele proprietati: " +
                           "\n categorie " + AlexPC.getCategorie() +
                           "\n marca " + AlexPC.getMarca() +
                           "\n nume " + AlexPC.getNume() +
                           "\n si are pretul de " + AlexPC.getPret());
  }


  @Test
  public void TestPCContructorCuUnParametru () {

    PC PCApple = new PC("DA");
    System.out.println("Laptopul tocmai creat este unul de tip Apple? " + PCApple.getEsteApple());

  }

}
