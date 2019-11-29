package complexity.simple;


public class SortingAlgorithms {

  public static void main (String args[]) {

    int v[] = {4, 3, 2, 7, 9, 10, 12, 15, 17, 3, 8, 11, 14, 13};
    bubbleSort(v);
  }


  static void bubbleSort (int vector[]) {

    for (int i = 0; i < vector.length - 1; i++)
      for (int j = 0; j < vector.length - i - 1; j++)
        if (vector[j] > vector[j + 1]) {
          int temp = vector[j];
          vector[j] = vector[j + 1];
          vector[j + 1] = temp;
        }

    for (int i = 0; i < vector.length; ++i)
      System.out.print(vector[i] + " ");
    System.out.println();
  }


}
