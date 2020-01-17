package demos.cofetarieandrei.controller;

import demos.cofetarieandrei.model.Client;
import demos.cofetarieandrei.model.ClientModelInterface;
import demos.cofetarieandrei.view.ClientView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import static demos.cofetarieandrei.utils.PaymentMethods.CARD;
import static demos.cofetarieandrei.utils.PaymentMethods.CASH;

/**
 * Created by Andrei on 1/7/2020.
 */
public class ClientController implements ClientModelInterface {

    private Client clientModel;
    private ClientView clientView;

    public ClientController(Client model, ClientView view) {
        this.clientModel = model;
        this.clientView = view;
    }

    public void afisInfoSpecial()    {
    clientView.afisareInformatiiClient(clientModel);

    }

    @Override
    public void updateClient(String proprietate, String valoare) {

        switch (proprietate) {
            case "nume":
                clientModel.setNume(valoare);
                break;
            case "prenume":
                clientModel.setPrenume(valoare);
                break;
            case "adresa":
                clientModel.setAdresa(valoare);
                break;
            case "varsta":
                clientModel.setVarsta(Integer.parseInt(valoare));
                break;
            default:
                System.out.println("Proprietatea nu a fost gasita");
                break;
        }
        System.out.println("proprietatea " + proprietate + " a fost schimbata cu " + valoare);
    }


    @Override
    public void deliveryToClient() {
        System.out.println("comanda va fi livrata la " + clientModel.getAdresa());

    }

    public void deliveryToClient(String newAddress) {

        clientModel.setAdresa(newAddress);
        System.out.println("comanda va fi livrata la " + newAddress);
    }

    @Override
    public void makePayment(double valoarePlata) throws IOException {
        int discount = 0;
        String metodaPlata = null;
        metodaPlata = citireMetodaPlata();
        if (clientModel.isClientFidel() && metodaPlata.equals(CARD.toString())) {
            discount = 20;
            valoarePlata = valoarePlata - ((valoarePlata * discount) / 100);
            System.out.println(RED + "Pentru ca ati ales plata cu cardul aveti un discount de " + discount + " % ! Suma finala este " + valoarePlata);

        } else {
            if (clientModel.isClientFidel()) {
                discount = 10;
                valoarePlata = valoarePlata - ((valoarePlata * discount) / 100);
                System.out.println(BLUE + "Pentru ca ati ales plata CASH aveti un discount de " + discount + " % ! Suma finala este " + valoarePlata);
            } else {
                System.out.println(" Aveti de platit suma de " + valoarePlata + " lei");
            }
        }
    }

    private String citireMetodaPlata() throws IOException {
        System.out.println("Optiunile de plata sunt " + CASH + " sau " + CARD + "!\nCum doriti sa platiti?");
        boolean flag = false;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String ceAmCitit = "";
        while (!flag) {
            ceAmCitit = in.readLine().toUpperCase();
            if (ceAmCitit.equals(CASH.toString()) || ceAmCitit.equals(CARD.toString())) {
                flag = true;
                return ceAmCitit;
            } else {
                flag = false;
                System.out.println("Metoda de plata neacceptata!" + "/nVa rugam alegeti " + CARD + "sau" + CARD + ".");
            }
        }
        return ceAmCitit;
    }
}
