package mvc.client;


import java.io.IOException;


public interface ClientControllerInterface {

  void addClient ();


  void removeClient ();


  void updateClient (String proprietate, String valoare);


  void deliverToClient ();


  void makePayment (double valoare) throws IOException;

}
