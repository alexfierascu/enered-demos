package demos.cofetarie.controller;


import demos.cofetarie.model.Client;
import demos.cofetarie.model.Cofetarie;
import demos.cofetarie.model.EvenimenteSpeciale;
import demos.cofetarie.model.ProdusCofetarie;
import demos.cofetarie.view.CofetarieView;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class CofetarieController {


    private Cofetarie modelCofetarie;
    private CofetarieView viewCofetarie;


    public void adaugaClient(Client clientNou) {
        modelCofetarie.getListaClienti().add(clientNou);
        for (Client client : modelCofetarie.getListaClienti()) {
            System.out.println(client);
        }
    }

    public void stergeClient(Client clientExistent) {
        modelCofetarie.getListaClienti().remove(clientExistent);
        for (Client client : modelCofetarie.getListaClienti()) {
            System.out.println("Clientul " + client.getNume() + " a fost sters");
        }
    }

    public void adaugaProdusCofetarie(ProdusCofetarie produsNou) {
        modelCofetarie.getProduseCofetarie().add(produsNou);
    }

    public void stergeProdusCofetarie(ProdusCofetarie produsExistent) {
        modelCofetarie.getProduseCofetarie().remove(produsExistent);
    }

    public void adaugaEveniment(EvenimenteSpeciale evenimentNou) {
        modelCofetarie.getEvenimenteCofetarie().add(evenimentNou);
    }

    public void stergeEveniment(EvenimenteSpeciale evenimentExistent) {
        modelCofetarie.getEvenimenteCofetarie().remove(evenimentExistent);
    }

    public void afiseazaPreturiProduseCofetarieCrescator() {
        for (ProdusCofetarie produsCofetarie : modelCofetarie.getProduseCofetarie()) {
            System.out.println(produsCofetarie.getPretProdusCofetarie());
        }
    }
}
