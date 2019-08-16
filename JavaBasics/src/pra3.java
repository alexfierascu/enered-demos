import java.time.Duration;


public class pra3 {

  public static void main (String[] args) {

    String minutes = "160";
    Duration duration = Duration.ofMinutes(Long.parseLong(minutes));

    long hours = duration.toHours();
    long mins = duration.minusHours(hours).toMinutes();


    String formatted = String.format("%dhrs %02dmins", hours, mins);

    System.out.println(formatted);

  }

}
