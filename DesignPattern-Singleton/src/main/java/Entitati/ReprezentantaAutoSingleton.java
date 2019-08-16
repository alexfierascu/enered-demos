package Entitati;


public class ReprezentantaAutoSingleton {

  private static ReprezentantaAutoSingleton SandraTrading;


  private int nrMasiniVandute;


  //see that we make the constructor private
  private ReprezentantaAutoSingleton () {

    nrMasiniVandute = 0;
  }


  //you make a static function that return the ReprezentaAutoSingleton
  public static ReprezentantaAutoSingleton getInstance () {

    if (SandraTrading == null) {
      SandraTrading = new ReprezentantaAutoSingleton();
    }

    return SandraTrading;
  }


  //function to sell our car, as it returns car
  public Masina vanzareMasina () {
    /*nrMasiniVandute++;*/
    System.out.println("Sandra Trading a vandut " + nrMasiniVandute);
    return new Masina();
  }

}
