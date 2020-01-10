import demos.cofetarie.controller.ClientController;
import demos.cofetarie.controller.CofetarieController;
import demos.cofetarie.model.Client;
import demos.cofetarie.model.Cofetarie;
import demos.cofetarie.view.ClientView;
import demos.cofetarie.view.CofetarieView;

import java.io.IOException;


public class Executie {

    public static void main(String[] args) throws IOException {

        Client client = construireClientDefault();

        ClientView view = new ClientView();

        ClientController Cristi = new ClientController(client, view);
//        Client c = Client.builder().nume("alex").build();
//        System.out.println(c.getNume());
//
////    Cristi.afisareNumeClient();
////    Cristi.updateClient("nume", "Motrescu");
////    Cristi.afisareNumeClient();
//    Cristi.makePayment(100);
//    Cristi.afisareSpecialeInformatiiClient();

        CofetarieController Florinex = new CofetarieController(new Cofetarie(), new CofetarieView());

        Florinex.adaugaClient(client);

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
