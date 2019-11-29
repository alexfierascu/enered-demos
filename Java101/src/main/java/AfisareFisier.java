import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class AfisareFisier {


  public static void main (String[] args) {

    String text = "alex fierascu";
    String fileName = "C:\\Users\\ifierascu\\Desktop\\ENERED\\scriereFisier.txt";

    try{
      Files.write(Paths.get(fileName), text.getBytes());


    } catch (IOException e)
    {
      e.printStackTrace();
    }

  }

}
