import demos.cofetarie.controller.ClientController;
import demos.cofetarie.controller.CofetarieController;
import demos.cofetarie.model.Client;
import demos.cofetarie.model.Cofetarie;
import demos.cofetarie.model.ProdusCofetarie;
import demos.cofetarie.view.ClientView;
import demos.cofetarie.view.CofetarieView;

import java.io.IOException;


public class Executie {

    public static void main(String[] args) throws IOException {

        Client client = construireClientDefault();

        ClientView view = new ClientView();

        ClientController Cristi = new ClientController(client, view);


        Client x = Client.builder().nume("Alex").build();
        Client y = Client.builder().nume("test").build();
        ProdusCofetarie savarina = ProdusCofetarie.builder().numeProdusCofetarie("savarina").gramajProdusCofetarie(120.2).pretProdusCofetarie(19.9).build();
        ProdusCofetarie ecler = ProdusCofetarie.builder().numeProdusCofetarie("ecler").gramajProdusCofetarie(80).pretProdusCofetarie(15).build();


        CofetarieController cofetarieController = new CofetarieController(new Cofetarie(), new CofetarieView());
        cofetarieController.adaugaClienti(x, y);
        cofetarieController.adaugaProduseCofetarie(savarina, ecler);
        cofetarieController.afiseazaPreturiProduseCofetarieCrescator();
        cofetarieController.afisareListaClienti();
        // cofetarieController.introducereProgramFunctionare();

//        cofetarieController.introducereProgramFunctionare2();
//        cofetarieController.afisareProgramFunctionare();


    }

    private static Client construireClientDefault() {

        Client c = new Client();
        c.setNume("Popescu");
        c.setPrenume("Mircea-Alexandru");
        c.setAdresa("Strada Trei Fantani");
        c.setClientFidel(true);
        c.setVarsta(23);
        return c;
    }

}
