public class MetodeString1 {

  public static void main (String args[]) {

    String nume = "cRisti";
    int lungimeNume = nume.length();

    int test = nume.indexOf("ri");
    System.out.println(test);
    String numeMic = nume.toLowerCase();
    String numeMare = nume.toUpperCase();

    System.out.println(numeMic);
    System.out.println(numeMare);

  }

}
