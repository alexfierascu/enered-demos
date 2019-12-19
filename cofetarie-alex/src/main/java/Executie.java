import model.Client;

import java.io.IOException;


public class Executie {

  public static void main (String[] args) throws IOException {

    Client Mircea = new Client();
    Mircea.setNumeClient("Popescu");
    Mircea.setPrenumeClient("Mircea-Alexandru");
    Mircea.setAdresaClient("Strada Trei Fantani");
    Mircea.setVarstaClient(23);

    Mircea.setClientFidel(true);
    Mircea.makePayment(100);

  }

}
