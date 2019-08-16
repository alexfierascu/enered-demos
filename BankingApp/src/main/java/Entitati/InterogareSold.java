package Entitati;


import java.util.ArrayList;


public class InterogareSold {

  private ArrayList<ContBancar> conturiBancare;


  public InterogareSold (ArrayList<ContBancar> conturiBancare) {

    super();
    this.conturiBancare = conturiBancare;
  }


  public int getBalance () {

    int suma = 0;

    for (ContBancar item : conturiBancare) {
      if (item instanceof Depunere) {
        suma += item.suma;
      }
      if (item instanceof Retragere) {
        suma -= item.suma;
      }
    }

    return suma;
  }

}

