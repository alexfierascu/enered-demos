package model;


import java.io.IOException;


public interface ClientModelInterface {

  public void addClient ();


  public void removeClient ();


  public String updateClient (String proprietate, String valoare);


  public void deliverToClient ();


  public void makePayment (double valoare) throws IOException;

}
