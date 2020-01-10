package demos.cofetarie.controller;


import demos.cofetarie.model.Client;
import demos.cofetarie.model.Cofetarie;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CofetarieController {


    private Cofetarie cofetarie;


    public void addClient(Client clientNou) {
        cofetarie.getListaClienti().add(clientNou);
        for (Client client : cofetarie.getListaClienti()) {
            System.out.println(client);
        }

    }

    public void deleteClient(Client clientExistent) {
        cofetarie.getListaClienti().remove(clientExistent);
        for (Client client : cofetarie.getListaClienti()) {
            System.out.println("Clientul " + client.getNume() + " a fost sters");
        }
    }
}
