package games.utils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Functii {
  
    public static String citireCuvant() {
        String valoareGhicit = null;
        String path = "E:\\JAVA\\enered-demos\\Java101\\src\\main\\resources\\spanzuratoare.txt";
        StringBuilder content = new StringBuilder();
        try (Stream<String> lines = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
            lines.forEach(s -> content.append(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
        valoareGhicit = content.toString();
        return valoareGhicit;
    }
  

    public static Vector stringToVector(String s) {
        Vector myVec = new Vector();
        char[] sChars = s.toCharArray();
        for(int i = 0; i < s.length(); ++i) {
            myVec.add(sChars[i]);
        }
        return (myVec);
    }
    
     public static void afisareCuvantModAscuns(Vector cuvant){
        for (int i=0; i<cuvant.length;i++){
            System.out.print("*");
        }

}
