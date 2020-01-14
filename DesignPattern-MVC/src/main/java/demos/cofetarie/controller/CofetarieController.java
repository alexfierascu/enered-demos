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
import java.util.Map;
import java.util.Scanner;


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
        for (ProdusCofetarie produsCofetarie : listaProduse) {
            System.out.println(produsCofetarie.getPretProdusCofetarie());
        }
    }

    public void introducereProgramFunctionare() {
        Map<String, String> orar = modelCofetarie.getOrar();
        orar.put("Luni", "09:00-18:00");
    }

    public void introducereProgramFunctionare2() {
        Map<String, String> orar = modelCofetarie.getOrar();
        System.out.println("Introduceti programul de functionare al cofetariei in urmatorul format:\n Zi,hh:mm-hh:mm");
        Scanner scanner = new Scanner(System.in);
        String entry;
        String[] entryValues;
        do {
            entry = scanner.nextLine();
            entryValues = entry.split(",");
            orar.put(entryValues[0], entryValues[1]);
        }
        while (!entryValues[0].equals("Duminica"));
    }

    public void afisareProgramFunctionare() {
        Map<String, String> orar = modelCofetarie.getOrar();
        for (String i : orar.keySet()) {
            System.out.println("Orarul de " + i + " este " + orar.get(i));
        }
    }
}
