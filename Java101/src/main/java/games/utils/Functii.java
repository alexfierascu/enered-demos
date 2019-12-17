package games.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Stream;


public class Functii {

    public static String citireCuvant() {
        String valoareGhicit = null;
        String path = "file:///Users/alexandrudirig/IdeaProjects/enered-demos/Java101/src/main/resources/spanzuratoare.txt";
        StringBuilder content = new StringBuilder();
        try (Stream<String> lines = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
            lines.forEach(s -> content.append(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
        valoareGhicit = content.toString();
        return valoareGhicit;
    }

    public static char[] stringToCharArray(String s) {
        char[] sChars = s.toCharArray();
//        for (int i = 0; i < s.length(); ++i) {
//            System.out.println(sChars[i]);
//        }
        return sChars;
    }

    public static void afisareCuvantModAscuns(Vector cuvant) {
        for (int i = 0; i < cuvant.size(); i++) {
            System.out.print("*");
        }
    }
    public static char citireLitera() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdu o litera: ");
        char l = scan.next().charAt(0);
        scan.close();
        return l;
    }
public static void ghicireCuvant(){
int count =0;
//       while(count ==0){
         char literaCitita = citireLitera();
         char [] litereCuvant = stringToCharArray(citireCuvant());
         for (int i=0;i< litereCuvant.length; i++){
             if (literaCitita == litereCuvant[i]){
                 System.out.print(literaCitita);
             }
             else {
                 System.out.print("*");
             }
           }
         count++;

       }
 }

