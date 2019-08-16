package Mostenire;


public class Autovehicul {


  //ca sa fie aplicat corect principiul de incapsulare, proprietatile trebuie facute private (eg:
  // private String marca)
  private String marca;

  private String serieSasiu;

  private int anulFabricarii;


  public String getMarca () {

    return marca;
  }


  public void setMarca (String marca) {

    this.marca = marca;
  }


  public String getSerieSasiu () {

    return serieSasiu;
  }


  public void setSerieSasiu (String serieSasiu) {

    this.serieSasiu = serieSasiu;
  }


  public int getAnulFabricarii () {

    return anulFabricarii;
  }


  public void setAnulFabricarii (int anulFabricarii) {

    this.anulFabricarii = anulFabricarii;
  }


  public void afisareTipAutovehicul () {

    System.out.println("Acesta este un autovehicul");
  }
}
