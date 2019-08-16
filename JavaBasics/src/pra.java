public class pra {

  public static void main (String[] args) {

    int h = 18;
    int min = 41;
    int sec = 54;
    String Font_Yellow = "\u001B[32m";
    String Font_Red = "\u001B[31m";
    String Font_Cyan = "\u001B[36m";
    String Font_Reset = "\u001B[0m";

    if ((sec % 2) == 0) {
      System.out.println("\t" + "\t" + Font_Cyan + 'P' + "\t" + "\t" + Font_Reset);
    } else {
      System.out.println("\t" + "\t" + 'I' + "\t" + "\t");
    }
    System.out.println();
    for (int i = 5; i < h; i += 5) {
      System.out.print(Font_Red + 'H' + "\t" + "\t" + Font_Reset);
    }
    int x = h % 5;
    System.out.println();
    for (int i = 0; i < x; i++) {
      System.out.print(Font_Red + 'Z' + "\t" + "\t" + Font_Reset);
    }
    System.out.println();
    for (int i = 1; i < min; i++) {
      if ((i % 5) == 0) {
        if ((i % 3) != 0) {
          System.out.print(Font_Yellow + '_' + " " + Font_Reset);
        } else {
          System.out.print(Font_Red + '_' + " " + Font_Reset);
        }
      }
    }
    System.out.println();
    int z = min % 5;
    for (int i = 1; i <= z; i++) {
      System.out.print(Font_Yellow + "=X=" + "\t" + Font_Reset);
    }
  }

}
