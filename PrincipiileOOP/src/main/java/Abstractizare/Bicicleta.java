package Abstractizare;


/*
 * O interfata nu poate implementa metode
 * In cadrul unei interfete metodele sunt doar declarate, urmand ca implementarea lor sa fie
 * facuta de clasele care implementeaza interfata
 *
 *
 * De asemenea, de obervat ca metodele noastre se termina cu ;
 *
 * Pentru a folosi o interfata trebuie sa declaram o clasa care sa foloseasca aceasta interfata
 * */
public interface Bicicleta {

  void schimbareCadenta (int valoare);


  void schimbareViteza (int viteza);


  void cresteViteza (int increment);


  void franeaza (int decrement);


  void franeazaComplet ();


  //aceasta metoda nu poate fi implementata. in cadrul Interfetelor, metodele pot fi doar
  // declarate, nu si implementate
 /* void test() {
    System.out.println("Test");
  }
*/
}
