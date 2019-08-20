import Incapsulare.Om;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TesteIncapsulare {

  @Test
  public void testSetANDGetNume () {
    //declaram un obiect de tip Om cu numele de Mircea
    Om Mircea = new Om();
    //prorpietatea numeOm nu este accesibila obiectului nostru Mircea pentru ca ea este de tip
    // private
    //Mircea.numeOm;

    Mircea.setNumeOm("Decebal");
    Assertions.assertEquals("Decebal", Mircea.getNumeOm());

  }


  @Test
  public void testSetANDGetVarsta () {
    //declaram un obiect de tip Om cu numele de Mircea
    Om Mircea = new Om();
    //prorpietatea numeOm nu este accesibila obiectului nostru Mircea pentru ca ea este de tip
    // private
    //Mircea.varstaOm;

    Mircea.setVarstaOm(23);
    Assertions.assertEquals(23, Mircea.getVarstaOm());
  }


  @Test
  public void testSetANDGetPrenume () {
    //declaram un obiect de tip Om cu numele de Mircea
    Om Mircea = new Om();
    //prorpietatea numeOm nu este accesibila obiectului nostru Mircea pentru ca ea este de tip
    // private
    //Mircea.prenumeOm;

    Mircea.setPrenumeOm("Mircea");
    Assertions.assertEquals("Mircea", Mircea.getPrenumeOm());
  }


}
