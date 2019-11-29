package games.utils;

import java.util.Vector;

public class Functii {

    public static Vector stringToVector(String s) {
        Vector myVec = new Vector();
        char[] sChars = s.toCharArray();
        for(int i = 0; i < s.length(); ++i) {
            myVec.add(sChars[i]);
        }
        return (myVec);
    }
    
     public static void afisareCuvantModAscuns(String[] cuvant){
        //cuvant={"a","l","c"};
        for (int i=0; i<cuvant.length;i++){
            System.out.print("*");
        }
}
