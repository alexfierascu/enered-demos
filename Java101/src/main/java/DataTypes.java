import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DataTypes {

  static int suma (int a, int b) {

    int sum = a + b;
    return sum;
  }


  static int suma (int a, double b) {

    int sum = (int) (a + b);
    return sum;
  }


  static void alabala (boolean abc) {

    if (abc == true) {
      System.out.println("ala");
    } else {
      System.out.println("Bala");
    }
  }


  static String alabala2 (boolean abc) {

    String mesaj;
    if (abc) {
      mesaj = "ala";
    } else {
      mesaj = "bala";
    }
    return mesaj;
  }


  public static void main (String[] args) {

    int a = 2;
    double b = 3.2;
    float c = 5.99f;
    String x = "alex";
    char y = 'n';
    boolean i = true;
    System.out.println(suma(9, 5));
    System.out.println(suma(2, b));

    System.out.println(x + "cc");

    //get curent day
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate localDate = LocalDate.now();
    String currentDay = dtf.format(localDate);
    alabala(i);

  }

}
