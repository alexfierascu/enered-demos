import model.Client;
import mvc.client.ClientControllerInterface;
import mvc.client.ClientViewInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static utils.ANSIConsoleColours.BLUE;
import static utils.ANSIConsoleColours.RED;
import static utils.PaymentMethods.CARD;


public class ClientControllerImpl implements ClientControllerInterface, ClientViewInterface {

  private Client modelClient;


  public ClientControllerImpl (Client model) {

    this.modelClient = model;
  }


  @Override
  public void addClient () {

  }


  @Override
  public void removeClient () {

  }


  @Override
  public void updateClient (String proprietate, String valoare) {


    switch (proprietate) {
      case "nume":
        modelClient.setNume(valoare);
        break;
      case "prenume":
        modelClient.setPrenume(valoare);
        break;
      case "adresa":
        modelClient.setAdresa(valoare);
        break;
      case "varsta":
        modelClient.setVarsta(Integer.parseInt(valoare));
        break;
      default:
        System.out.println("Proprietatea nu a fost gasita");
    }
    System.out.println("Proprietatea " + proprietate + " a fost schimbata cu " + valoare);
  }


  @Override
  public void deliverToClient () {

    System.out.println("Comanda va fi livrata la " + modelClient.getAdresa());
  }


  public void deliverToClient (String newAddress) {

    modelClient.setAdresa(newAddress);
    System.out.println("Comanda va fi livrata la " + newAddress);
  }


  @Override
  public void makePayment (double valoarePlata) throws IOException {

    String metodaPlata = citireMetodaPlata();

    double discount = 20;
    if (modelClient.isClientFidel() && metodaPlata.equals(CARD.toString())) {
      valoarePlata = valoarePlata - ((valoarePlata * discount) / 100);
      System.out.println(RED + "Pentru ca sunteti client fidel si ati ales plata cu cardul " +
                             "aveti un discount de" +
                             " " + discount +
                             "%! Suma finala de platit este " + valoarePlata + " RON");
    } else if (modelClient.isClientFidel()) {
      discount -= 10;
      valoarePlata = valoarePlata - discount;
      System.out.println(BLUE + "Pentru ca sunteti client fidel si ati ales plata cash aveti" +
                             " " +
                             "un " +
                             "discount de " + discount +
                             "%! Suma finala de platit este " + valoarePlata + " RON");
    } else {
      System.out.println("Aveti de platit suma de " + valoarePlata + " RON!");
    }
  }


  private String citireMetodaPlata () throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String metodaPlata = in.readLine().toUpperCase();
    System.out.println("Optiunile de plata sunt cash sau card! \nCu ce vreti sa platiti? ?");
    return metodaPlata;
  }


  @Override
  public void afisareInformatiiClient () {

    System.out.println("Clientul " + modelClient.getPrenume() + " " + modelClient.getNume() + " " +
                           "in varsta de " + modelClient.getVarsta() + " " +
                           "locuieste " + modelClient.getAdresa());
  }


  @Override
  public void afisareNumeClient () {

    System.out.println(modelClient.getNume());
  }


  @Override
  public void afisarePrenumeClient () {

    System.out.println(modelClient.getPrenume());
  }


  @Override
  public void afisareAdresaClient () {

    System.out.println(modelClient.getAdresa());
  }


  @Override
  public void afisareVarstaClient () {

    System.out.println(modelClient.getVarsta());
  }


  @Override
  public void afisareIsClientFidel () {

    System.out.println(modelClient.isClientFidel());
  }
}
