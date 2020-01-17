package demos.cofetarieandrei.view;

import demos.cofetarieandrei.model.Client;

/**
 * Created by Andrei on 1/8/2020.
 */
public class ClientView implements ClientViewInterface{



    @Override
    public void afisareInformatiiClient(Client client) {
        System.out.println(" Salut! Ma numesc  " + client.getNume() + " si locuiesc " + client.getAdresa());
    }
}
