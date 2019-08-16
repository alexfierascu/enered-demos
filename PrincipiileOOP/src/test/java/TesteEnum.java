import Enum.MetodeZileleSaptamanii;
import Enum.ZileleSaptamanii;
import org.junit.jupiter.api.Test;


public class TesteEnum {

  @Test
  public void testEnumLuni () {

    MetodeZileleSaptamanii ziuaIntai = new MetodeZileleSaptamanii();
    ziuaIntai.AfisareProgram(ZileleSaptamanii.LUNI);
  }

}
