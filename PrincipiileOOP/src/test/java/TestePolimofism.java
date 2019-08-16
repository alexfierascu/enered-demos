import Polimorfism.Animal;
import Polimorfism.Caine;
import Polimorfism.Pisica;
import org.junit.jupiter.api.Test;

/*
 * OVERLOAD = supra-incarcare = Runtime Polymorfism
 * OVERRIDE = supra-scriere = Compile Time Polymorfism
 * */

public class TestePolimofism {

  @Test
  public void demoOverload1 () {

    Animal Ani = new Animal();
    //apelam metode demoOverload care are 1 parametru
    Ani.demoOverload("nume generic");
  }


  @Test
  public void demoOverload2 () {

    Pisica Suzy = new Pisica();
    Suzy.demoOverload("Suzy", "albastra");
  }


  @Test
  public void demoOverload3 () {

    Caine Patrocle = new Caine();
    Patrocle.demoOverload("Rottweiler", "Neea", "alba");
  }


  @Test
  public void demoOvveride1 () {

    Animal Ani = new Animal();
    Ani.afisareSunetAnimal();

  }


  @Test
  public void demoOvveride2 () {

    Pisica Blanca = new Pisica();
    Blanca.afisareSunetAnimal();

  }


  @Test
  public void demoOvveride3 () {

    Caine Astro = new Caine();
    Astro.afisareSunetAnimal();

  }

}
