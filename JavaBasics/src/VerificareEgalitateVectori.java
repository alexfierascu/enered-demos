public class VerificareEgalitateVectori {

  public static void main (String args[]) {

    int pra1[] = {1, 2, 3};
    int pra2[] = {1, 2, 3};
    int pra3[] = {1, 2, 4};
    int pra4[] = {3, 3, 3, 4};

    verificareEgalitate(pra1, pra2);
    verificareEgalitate(pra2, pra3);
    verificareEgalitate(pra2, pra4);
    /*pra1[]==pra2[]? // adevarat
    pra2[]==pra3[]? //false*/
  }


  static void verificareEgalitate (int v1[], int v2[]) {

    boolean vectoriEgali = true;

    if (v1.length == v2.length) {
      for (int i = 0; i <= v1.length - 1; i++) {
        if (v1[i] == v2[i]) {
          vectoriEgali = true;
        } else {
          vectoriEgali = false;
        }
      }
    } else {
      vectoriEgali = false;
    }


    if (vectoriEgali) {
      System.out.println("Cei 2 vectori sunt egali");
    } else {
      System.out.println("Cei 2 vectori nu sunt egali");
    }
  }

}
