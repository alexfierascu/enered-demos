package Abstractizare;


/*
* folosind cuvantul cheie "Implements" clasa BicicletaIeftina trebuie sa implementeze toate
 metodele interfetei Bicicleta

 de asemenea, observam ca toate metodele pe care interfata Bicicleta le are si trebuie
 implementate in clasa BicicletaIeftina au adnotarea @Override asupra lor. Mentionam ca acest
 lucru nu este necesar neaparat, dar este bine de pus/ folosit pentru o mai buna intelegere si
 vizibilitate asupra principiilor OOP
* */


public class BicicletaIeftina implements Bicicleta {

  int cadenta = 0;

  int viteza = 0;

  int pinionVitezaBicicleta = 1;


  public void schimbareCadenta (int valoare) {

    cadenta = valoare;
    System.out.println("Cadenta(numar rotatii roata bicicleta/ minut) bicicletei este de " + cadenta);

  }


  public void schimbareViteza (int vitezaB) {

    pinionVitezaBicicleta = vitezaB;
    System.out.println("A fost schimbat pinionul de viteza a bicicletei! Pinionul actual este " + pinionVitezaBicicleta);
  }


  public void cresteViteza (int increment) {

    viteza = viteza + increment;
    System.out.println("Viteza bicicletei a crescut! Viteza actuala este de " + viteza);

  }


  public void franeaza (int decrement) {

    viteza = viteza - decrement;
    System.out.println("Viteza bicicletei a scazut! Viteza actuala este de " + viteza);
  }


  public void franeazaComplet () {

    viteza = 0;
    System.out.println("Viteza bicicletei este " + viteza + ". Ea a franat complet!");
  }
}
