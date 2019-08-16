package Entitati;


public class ReprezentantaAuto {

  //because we want to keep track on the number of cars that we have sold
  int nrMasiniVandute;


  //we start our bussiness from zero
  public ReprezentantaAuto () {

    nrMasiniVandute = 0;
  }


  //function to sell our car, as it returns car
  public Masina vanzareMasina () {

    nrMasiniVandute++;
    System.out.println("Am vandut " + nrMasiniVandute + " masini");
    return new Masina();
  }

}
