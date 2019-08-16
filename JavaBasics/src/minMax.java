public class minMax {

  public static void main (String args[]) {

    int vector[] = {1, 3, 7, 12, -6};
    int min = 1000;
    int max = -1000;
    for (int i = 0; i < vector.length; i++) {
      if (min > vector[i]) {
        min = vector[i];
      }
    }

    for (int i = 0; i < vector.length; i++) {
      if (max < vector[i]) {
        max = vector[i];
      }

    }
    System.out.println(min);
    System.out.println("\n");
    System.out.println(max);
    System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
  }

}
