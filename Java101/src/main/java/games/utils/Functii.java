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
}
