import model.Client;


public class Executie {

  public static void main (String[] args) {

    Client client = construiereClientDefault();
    ClientControllerImpl Cristi = new ClientControllerImpl(client);

    Cristi.afisareNumeClient();
    Cristi.updateClient("nume", "Motrescu");
    Cristi.afisareNumeClient();


    //Cristi.makePayment(100);

  }


  private static Client construiereClientDefault () {

    Client c = new Client();
    c.setNume("Popescu");
    c.setPrenume("Mircea-Alexandru");
    c.setAdresa("Strada Trei Fantani");
    c.setVarsta(23);
    return c;
  }

}
