package demos.cofetarie.controller;


import demos.cofetarie.model.Client;
import demos.cofetarie.model.Cofetarie;
import demos.cofetarie.model.EvenimenteSpeciale;
import demos.cofetarie.model.ProdusCofetarie;
import demos.cofetarie.view.CofetarieView;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class CofetarieController {


    private Cofetarie modelCofetarie;
    private CofetarieView viewCofetarie;


    public void adaugaClient(Client clientNou) {
        modelCofetarie.getListaClienti().add(clientNou);
    }

    public void adaugaClienti(Client... clientiNoi) {
        List<Client> listaClienti = modelCofetarie.getListaClienti();
        for (Client clientNou : clientiNoi) {
            listaClienti.add(clientNou);
        }
    }

    public void afisareListaClienti() {
        List<Client> clientList = modelCofetarie.getListaClienti();
        System.out.println("afisare lista clienti");
        clientList.forEach(System.out::println);
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

    public void adaugaProduseCofetarie(ProdusCofetarie... produseNoi) {
        List<ProdusCofetarie> listaProduse = modelCofetarie.getProduseCofetarie();
        for (ProdusCofetarie produsCofetarieNou : produseNoi) {
            listaProduse.add(produsCofetarieNou);
        }
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
        List<ProdusCofetarie> listaProduse = modelCofetarie.getProduseCofetarie();
        listaProduse.sort(Comparator.comparing(ProdusCofetarie::getPretProdusCofetarie));
        for (ProdusCofetarie produsCofetarie : modelCofetarie.getProduseCofetarie()) {
            System.out.println(produsCofetarie.getPretProdusCofetarie());
        }
    }
}
