package model;


import utils.PaymentMethods;


public interface ClientModelInterface {

  public void addClient ();


  public void removeClient ();


  public String updateClient (String proprietate, String valoare);


  public void deliverToClient ();


  public void makePayment (PaymentMethods metodaPlata, double valoare);


  public boolean isClient ();

}
