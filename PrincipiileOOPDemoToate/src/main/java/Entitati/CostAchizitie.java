package Entitati;


public abstract class CostAchizitie {

  double carPrice;

  private boolean janteMari = true;

  private String faruriXenon = "nu are";


  public static boolean newCar (boolean newCar) {

    if (newCar) {
      System.out.println("Masina a fost achiz. de noua");
      newCar = true;
    } else {
      System.out.println("Masina este second-hand");
      newCar = false;
    }
    return newCar;
  }


  public boolean isJanteMari () {

    System.out.println(janteMari);
    return janteMari;
  }


  public void setJanteMari (boolean janteMari) {

    this.janteMari = janteMari;
  }


  public String getFaruriXenon () {

    System.out.println(faruriXenon);
    return faruriXenon;
  }


  public void setFaruriXenon (String faruriXenon) {

    this.faruriXenon = faruriXenon;
  }


  public abstract void expensiveCar ();

}
