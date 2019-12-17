import model.Client;

import static utils.PaymentMethods.CASH;


public class Executie {

  public static void main (String[] args) {

    Client Mircea = new Client();
    Mircea.setNume("Popescu");
    Mircea.setPrenume("Mircea-Alexandru");
    Mircea.setAdresa("Strada Trei Fantani");
    Mircea.setVarsta(23);

    /*System.out.println(Mircea.getAdresa());

    Client Paul = new Client();
    Paul.builder()
        .nume("Decebal")
        .prenume("Paul")
        .adresa("Strada Leonardo 3")
        .varsta(34)
        .build();


    Mircea.updateClient("nume","Saulescu");
    System.out.println(Mircea.getNume());*/

    Mircea.deliverToClient();
    Mircea.setClient(true);
    Mircea.makePayment(CASH, 100);


  }

}
