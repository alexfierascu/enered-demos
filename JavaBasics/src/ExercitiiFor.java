public class ExercitiiFor {

  public static void main (String args[]) {

    double vector[] = {2, 3, 8.5, 9.2, 11.5, 9};
    int[] vector2 = {1, 2, 3, 6, 9, 10, 12, 15};
    for (int i = 0; i < vector2.length; i++) {
      if (vector2[i] % 3 == 0) {
        System.out.println(vector2[i]);
      }
    }
    String nume[] = {"paul", "andrei", "liviu", "emanuel", "marius", "alex"};

    for (int i = 0; i <= vector.length - 1; i++) {
      System.out.println(vector[i]);
    }

    for (int i = 0; i <= nume.length - 2; i++) {
      System.out.println(nume[i]);
    }


    double suma = 0;
    for (int i = 0; i <= vector.length - 1; i++) {
      suma = suma + vector[i];
    }
    System.out.println("Suma nr din ExercitiiVector este " + suma);


  }


  public static void numaratoare (int numar) {

    for (int i = 1; i <= numar; i++) {
      System.out.println(i);
    }
  }
}
