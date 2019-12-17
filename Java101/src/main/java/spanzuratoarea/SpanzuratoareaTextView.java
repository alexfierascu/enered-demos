package spanzuratoarea;


import java.util.Arrays;


public class SpanzuratoareaTextView implements SpanzuratoareaViewInterface {

  private SpanzuratoareaModelInterface model;


  public SpanzuratoareaTextView (SpanzuratoareaModelInterface model) {

    this.model = model;
  }


  private static char[][] matrix = {
      "       +---+  ".toCharArray(),
      "       |   |  ".toCharArray(),
      "       O   |  ".toCharArray(),
      "      /|\\  |  ".toCharArray(),
      "       |   |  ".toCharArray(),
      "      / \\  |  ".toCharArray(),
      "           |  ".toCharArray(),
      "==============".toCharArray()
  };


  @Override
  public void displayHangman () {

    int bodyParts = model.getBodyPartsCount();
    char tmp[][] = new char[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      tmp[i] = Arrays.copyOf(matrix[i], matrix[i].length);
    }
    switch (bodyParts) {
      case 0:
        tmp[2][7] = ' ';
      case 1:
        tmp[3][7] = tmp[4][7] = ' ';
      case 2:
        tmp[3][6] = ' ';
      case 3:
        tmp[3][8] = ' ';
      case 4:
        tmp[5][6] = ' ';
      case 5:
        tmp[5][8] = ' ';
    }
    for (char[] line : tmp) {
      System.out.println(String.valueOf(line));
    }

  }


  @Override
  public void displayWord () {

    System.out.println(model.getWord());
  }


  @Override
  public void displayMessage (String message) {

    System.out.print(message);
  }
}
