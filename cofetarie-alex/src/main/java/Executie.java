import cofetarie.controller.ClientController;
import cofetarie.model.Client;

import java.io.IOException;


public class Executie {

  public static void main (String[] args) throws IOException {

    Client client = construiereClientDefault();

    ClientController Cristi = new ClientController(client);

    Cristi.afisareNumeClient();
    Cristi.updateClient("nume", "Motrescu");
    Cristi.afisareNumeClient();


    Cristi.makePayment(100);

  }


  private static Client construiereClientDefault () {

    Client c = new Client();
    c.setNume("Popescu");
    c.setPrenume("Mircea-Alexandru");
    c.setAdresa("Strada Trei Fantani");
    c.setClientFidel(true);
    c.setVarsta(23);
    return c;
  }

}
