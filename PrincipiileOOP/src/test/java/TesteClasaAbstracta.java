import AbstractClass.Contractor;
import AbstractClass.Salariat;
import org.junit.jupiter.api.Test;


public class TesteClasaAbstracta {

  @Test
  public void test () {

    String name = "";
    int payment = 0;
    int ore = 0;
    Contractor Anton = new Contractor(name, payment, ore);
    Salariat Alex = new Salariat(name, payment);


    //o clasa abstracta nu poate fi instantiata
    //Angajat x = new Angajat();
  }

}
