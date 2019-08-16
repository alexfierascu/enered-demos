package Exec;


import Entitati.Motocicleta;


public class ExecutieMotocicleta {

  public static void main (String args[]) {

    Motocicleta Suzuky = new Motocicleta();
    Suzuky.afisareKilometraj();
    Suzuky.setareKilometraj(20);
    Suzuky.afisareKilometraj();
    Suzuky.accelereaza();
    Suzuky.accelereaza();
    Suzuky.franeaza();
    Suzuky.afiseazaConsum();
    Suzuky.ruleaza();
    Suzuky.accelereaza();
    Suzuky.ruleaza();
    Suzuky.semnalizeazaDirectie("stanga");
  }

}
