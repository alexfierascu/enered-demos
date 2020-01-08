import demos.cofetarie.controller.ClientController;
import demos.cofetarie.model.Client;
import demos.cofetarie.view.ClientView;

import java.io.IOException;


public class Executie {

  public static void main (String[] args) throws IOException {

    Client client = construiereClientDefault();
    ClientView view = new ClientView();

    ClientController Cristi = new ClientController(client, view);

//    Cristi.afisareNumeClient();
//    Cristi.updateClient("nume", "Motrescu");
//    Cristi.afisareNumeClient();
    Cristi.makePayment(100);
    Cristi.afisareSpecialeInformatiiClient();

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
