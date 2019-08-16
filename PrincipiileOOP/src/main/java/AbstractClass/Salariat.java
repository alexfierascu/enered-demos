package AbstractClass;


public class Salariat extends Angajat {

  public Salariat (String name, int paymentPerHour) {

    super(name, paymentPerHour);
  }


  @Override
  public int calculateSalary () {

    return getPaymentPerHour() * 8;
  }
}
