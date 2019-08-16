public class nrDeAparitiiIntrunVector {

  public static void main (String args[]) {

    int nr[] = {2, 2, 2, 2, 2, 234, 4, 54, 65, 123, 3142, 321, 231, 2, 1, 5};
    int contor = 0;
    int cifraCautata = 2;
    for (int i = 0; i <= nr.length - 1; i++) {
      {
        if (nr[i] == cifraCautata) {
          contor++;
        }
      }
    }
    System.out.println("Cifra " + cifraCautata + " apare de " + contor + " ori in vectorul " +
                           "nostru!");

  }
}
