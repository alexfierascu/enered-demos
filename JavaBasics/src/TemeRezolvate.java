import java.util.Scanner;

import static java.lang.Math.pow;


public class TemeRezolvate {

  public static void main (String args[]) {


    //Exercitiul 1 - Aflati catul si restul impartirii a 2 numere intregi
    int a = 50, b = 3, catImpartire;
    double restImpartire;

    catImpartire = a / b;
    restImpartire = a % b;
    System.out.println("--Primul exercitiu--");
    System.out.println("Catul impartirii dintre " + a + " si " + b + " este " + catImpartire);
    System.out.println("Restul impartirii dintre " + a + " si " + b + " este " + restImpartire);
    System.out.println("\n\n");
    System.out.println("\n");//o linie goala

//--------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
    //Exercitiul 2 - considerand ca latura patratului este de 5cm, calculati perimetrul si aria
    // patratului
    int laturaPatrat = 5;
    int perimetruPatrat, ariaPatrat;

    perimetruPatrat = laturaPatrat * 4;
    ariaPatrat = laturaPatrat * laturaPatrat;
    System.out.println("--Al 2lea exercitiu--");
    System.out.println("Perimetrul patratului cu latura de  " + laturaPatrat + " este " + perimetruPatrat);
    System.out.println("Aria patratului cu latura de  " + laturaPatrat + " este " + ariaPatrat);
    System.out.println("\n\n");

//--------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
    //Exercitiul 3 - considerand ca raza cercului este de 7.5 cm, calculati circumferinta si aria
    // cercului
    double razaCercului = 7.5;
    double circumferitaCerc, ariaCerc;

    circumferitaCerc = 2 * razaCercului * Math.PI;
    ariaCerc = Math.PI * pow(razaCercului, 2);
    System.out.println("--Al 3lea exercitiu--");
    System.out.println("Circumferinta cercului cu raza de " + razaCercului + " este " + circumferitaCerc);
    System.out.println("Aria cercului cu raza de " + razaCercului + " este " + ariaCerc);
    System.out.println("\n\n");

//--------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
    //Exercitiul 4 - Interschimbarea a 2 variabile  - problema se mai chema in anii '60 "Metoda
    // celor 3 scaune". Incepand cu '70 problema a fost cunoscuta sub numele de "Metoda celor 3
    // pahare"

    //Varianta 1 - introducerea unei variabile ajutatoare; exemplu: a=2, b=3 , urmarim ca
    // rezultatul sa fie a=3, b =2
    int primulNumar = 2, alDoileaNumar = 3, variabilaAjutatoare = 0;
    variabilaAjutatoare = primulNumar;
    primulNumar = alDoileaNumar;
    alDoileaNumar = variabilaAjutatoare;
    System.out.println("--Al 4lea exercitiu--");
    System.out.println("Valoarea variabilelor dupa interschimbare este " + primulNumar + " si " + alDoileaNumar);
    System.out.println("\n\n");


    //Exercitiul 4 - Interschimbarea a 2 variabile
    //Varianta 2 - ne folosim de operatii matematice de adunare si scadere; exemplu: a=2, b=3 ,
    // urmarim ca rezultatul sa fie a=3, b =2
    primulNumar = alDoileaNumar + primulNumar;
    alDoileaNumar = primulNumar - alDoileaNumar;
    primulNumar = alDoileaNumar - primulNumar;
    System.out.println("Valoarea variabilelor dupa interschimbare este " + primulNumar + " si " + alDoileaNumar);
    System.out.println("\n\n");


    //Exercitiul 4 - Interschimbarea a 2 variabile
    //Varianta 3 - ne folosim de operatii matematice de inmultire si impartire; exemplu: a=2, b=3 ,
    // urmarim ca rezultatul sa fie a=3, b=2
    primulNumar = alDoileaNumar * primulNumar;
    alDoileaNumar = primulNumar / alDoileaNumar;
    primulNumar = alDoileaNumar / primulNumar;
    System.out.println("Valoarea variabilelor dupa interschimbare este " + primulNumar + " si " + alDoileaNumar);
    System.out.println("\n\n");


    //Exercitiul 5 - Adunarea a doua numere binare
    //pentru declararea numerelor binare folosim prefixul 0b sau OB in fata numarului dorit
    //https://docs.oracle.com/javase/7/docs/technotes/guides/language/binary-literals.html
    int primulNumarBinar = 0b101, alDoileaNumarBinar = 0b110;
    //a = 5, b = 6;
    int sumaNumerelorBinare = primulNumarBinar + alDoileaNumarBinar;
    System.out.println("--Al 5lea exercitiu--");
    System.out.println("Suma numerelor binare " + primulNumarBinar + " si " + alDoileaNumarBinar +
                           " este " + sumaNumerelorBinare);
    System.out.println("\n\n");


    //Exercitiul 6 - Suma cifrelor unui numar
    //exemplu: numarulDorit = 217 -> sumaCifrelorNumarului  = 2 + 1 + 7 = 10
    int numarulDorit = 217, sumaCifrelorNumarului = 0, numarulMeu;
    numarulMeu = numarulDorit;
    while (numarulDorit != 0) {
      sumaCifrelorNumarului = sumaCifrelorNumarului + numarulDorit % 10;
      numarulDorit = numarulDorit / 10;
    }
    System.out.println("--Al 6lea exercitiu--");
    System.out.println("Suma cifrelor numarului " + numarulMeu + " este " + sumaCifrelorNumarului);
    System.out.println("\n\n");


    //Exercitiul 7 - Citirea unui numar de la tastatura si inmultirea cu el insusi
    //Exemplu: citim de la tastatura nr = 14 si inmultit cu acesta (ridicat la puterea a 2a) este
    // 196
    System.out.println("--Al 7lea exercitiu--");
    double numaruSimplu, ridicatLaPuterea2;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Introduceti numarul dorit");
    numaruSimplu = keyboard.nextDouble();
    ridicatLaPuterea2 = pow(numaruSimplu, 2);
    System.out.println("Numarul citit de la tastatura " + numaruSimplu + " ridicat la puterea a " +
                           "2a este " + ridicatLaPuterea2);


  }

}
