import model.Client;

import java.io.IOException;


public class Executie {

  public static void main (String[] args) throws IOException {

    Client Mircea = new Client();
    Mircea.setNume("Popescu");
    Mircea.setPrenume("Mircea-Alexandru");
    Mircea.setAdresa("Strada Trei Fantani");
    Mircea.setVarsta(23);

    //Mircea.deliverToClient();
    Mircea.setClient(true);
    Mircea.makePayment(100);


  }

}
