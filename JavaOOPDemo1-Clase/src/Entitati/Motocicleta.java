package Entitati;


public class Motocicleta {

  int kilometrajMotocicleta = 3000;

  int viteza = 0;


  public void ruleaza () {

    if (viteza < 0) {
      System.out.println("Motocicleta este oprita");
    } else {
      System.out.println("Motocicleta este in rulaj");
    }

  }


  public void setareKilometraj (int kilometraj) {

    this.kilometrajMotocicleta = kilometraj;
  }


  public void afisareKilometraj () {

    System.out.println(kilometrajMotocicleta);
  }


  public void semnalizeazaDirectie (String directie) {

    System.out.println("Motocicleta semnalizeaza " + directie);
  }


  public void accelereaza () {

    viteza = viteza + 10;
    System.out.println(viteza);
  }


  public void franeaza () {

    viteza = viteza - 25;
    System.out.println(viteza);
  }


  public void afiseazaConsum () {

    System.out.println("Consumul este de 4L / 100km");
  }
}
