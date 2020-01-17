import demos.cofetarieandrei.controller.ClientController;
import demos.cofetarieandrei.model.Client;
import demos.cofetarieandrei.view.ClientView;

import java.io.IOException;

/**
 * Created by Andrei on 12/17/2019.
 */
public class Executie {
    public static void main(String[] args) throws IOException {

    Client x = construireClientDefault();
    ClientView viewX= new ClientView();
    ClientController Andrei = new ClientController(x, viewX);


    Andrei.deliveryToClient(" Boston City");
    Andrei.makePayment(100);

    Andrei.afisInfoSpecial();



    }
    public static Client construireClientDefault(){
        Client client= new Client();
        client.setNume("Mihaita");
        client.setPrenume("Bobita");
        client.setVarsta(30);
        client.setAdresa("Bucharest");
        client.setClientFidel(false);
        return client;
    }
}
