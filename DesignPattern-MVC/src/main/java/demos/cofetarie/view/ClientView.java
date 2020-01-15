package demos.cofetarie.view;


import demos.cofetarie.interfaces.ClientViewInterface;
import demos.cofetarie.model.Client;


public class ClientView implements ClientViewInterface {

  @Override
  public void afisareInformatiiClient (Client c) {

    System.out.println("Clientul " + c.getNume() + " " + c.getPrenume() + " " +
                           "in varsta de " + c.getVarsta() + " " +
                           "locuieste in " + c.getAdresa());
  }
}
