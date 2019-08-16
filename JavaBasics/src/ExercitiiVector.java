public class ExercitiiVector {

  /*public static void main (String args[]) {

    int nr[] = {1, 2, 4, 10, 15, 16};
    for (int i = 0; i <= nr.length - 1; i++) {
      if (nr[i] % 2 == 0) {
        System.out.println(nr[i] + " este par");
      }
    }*/


  public static void main (String args[]) {

    String animal = "elefant";
    char litera = 'e';
    int contor = 0;
    for (int i = 0; i <= animal.length() - 1; i++) {
      if (animal.charAt(i) == litera) {
        contor++;
      }
    }
    System.out.println("Litera "
                           + litera + " in cuvantul " + animal +
                           " apare de " + contor + " ori");

  }

}
