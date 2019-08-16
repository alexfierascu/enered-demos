package AbstractClass;


public abstract class Angajat {

  private String name;

  private int paymentPerHour;


  public Angajat (String name, int paymentPerHour) {

    this.name = name;
    this.paymentPerHour = paymentPerHour;
  }


  public abstract int calculateSalary ();


  public String getName () {

    return name;
  }


  public void setName (String name) {

    this.name = name;
  }


  public int getPaymentPerHour () {

    return paymentPerHour;
  }


  public void setPaymentPerHour (int paymentPerHour) {

    this.paymentPerHour = paymentPerHour;
  }
}
