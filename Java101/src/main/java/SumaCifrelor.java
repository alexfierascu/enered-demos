public class SumaCifrelor {

  public static void main (String[] args) {

    int a = 1234567;
    int sum = 0;
    while (a > 0) {
      sum = sum + a % 10;
      a = a / 10;
    }
    System.out.println(sum);

  }

}
