////Scrieti o solutie pentru urmatoarea situatie:
////
////Aveti un ceas care arata in felul urmator:(displayed on TV/projector - un exemplu)
////
////1. Becul rotund reprezinta secundele. Aprins inseamna ca a  trecut un numar par de secunde, stins inseamna ca e numar impar de secunde
////
////2. Urmatoarele 2 linii reprezinta orele
////
////3. Ultimele 2 linii reprezinta minutele
////
////Afisati ora pe care ati primit-o ca set de date(cate un set de date pt fiecare)
//// utilizand pentru fiecare interval de timp cate un simbol diferit.
////
////Exemplu: pt 31 de secunde afisati I de atarea ori cate secunde de
//// valoare impara au trecut de la inceputul minutului. Acelasi lucru pentru litera P( valoare para)
//14:12:39


public class ceasuLuAndrei {

  public static void main (String[] args) {

    int hour = 14;
    int minutes = 12;
    int seconds = 39;

    int hourBy5;
    int minutesBy5;
    String socondsEven = "      O";
    String seondsOdd = "      o";

    hourBy5 = hour / 5;
    minutesBy5 = minutes / 5;


    int remainingHours = (hour - (hourBy5 * 5));

    int remaniningMinutes = (minutes - (minutesBy5 * 5));

    if (seconds % 2 == 0) {
      System.out.print(socondsEven);
    } else {
      System.out.print(seondsOdd);
    }
    System.out.println("");

    for (int i = 0; i < hourBy5; i++) {
      System.out.print(" H ");
    }

    System.out.println("");

    for (int j = 0; j < remainingHours; j++) {
      System.out.print(" h ");
    }
    System.out.println("");

    for (int k = 0; k < minutesBy5; k++) {
      System.out.print(" M ");
    }

    System.out.println("");

    for (int l = 0; l < remaniningMinutes; l++) {
      System.out.print(" m ");
    }


  }


}
