package demos.cofetarie.interfaces;


import java.io.IOException;


public interface ClientControllerInterface {

  void updateClient (String proprietate, String valoare);


  void deliverToClient ();


  void makePayment (double valoare) throws IOException;

}
