package demos.cofetarie.controller;


import demos.cofetarie.interfaces.ClientControllerInterface;
import demos.cofetarie.model.Client;
import demos.cofetarie.view.ClientView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static demos.cofetarie.utils.ANSIConsoleColours.BLUE;
import static demos.cofetarie.utils.ANSIConsoleColours.RED;
import static demos.cofetarie.utils.PaymentMethods.CARD;
import static demos.cofetarie.utils.PaymentMethods.CASH;


public class ClientController implements ClientControllerInterface {

    private Client modelClient;

    private ClientView viewClient;


    public ClientController(Client model, ClientView view) {

        this.modelClient = model;
        this.viewClient = view;
    }


    @Override
    public void updateClient(String proprietate, String valoare) {


        switch (proprietate) {
            case "nume":
                modelClient.setNume(valoare);
                break;
            case "prenume":
                modelClient.setPrenume(valoare);
                break;
            case "adresa":
                modelClient.setAdresa(valoare);
                break;
            case "varsta":
                modelClient.setVarsta(Integer.parseInt(valoare));
                break;
            default:
                System.out.println("Proprietatea nu a fost gasita");
        }
        System.out.println("Proprietatea " + proprietate + " a fost schimbata cu " + valoare);
    }


    @Override
    public void deliverToClient() {

        System.out.println("Comanda va fi livrata la " + modelClient.getAdresa());
    }


    public void deliverToClient(String newAddress) {

        modelClient.setAdresa(newAddress);
        System.out.println("Comanda va fi livrata la " + newAddress);
    }


    @Override
    public void makePayment(double valoarePlata) throws IOException {

        String metodaPlata = citireMetodaPlata();

        int discount = 0;
        if (modelClient.isClientFidel() && metodaPlata.equals(CARD.toString())) {
            discount = 20;
            valoarePlata = valoarePlata - ((valoarePlata * discount) / 100);
            System.out.println(RED + "Pentru ca sunteti client fidel si ati ales plata cu cardul " +
                    "aveti un discount de" +
                    " " + discount +
                    "%! Suma finala de platit este " + valoarePlata + " RON");
        } else if (modelClient.isClientFidel()) {
            discount = 10;
            valoarePlata = valoarePlata - ((valoarePlata * discount) / 100);
            System.out.println(BLUE + "Pentru ca sunteti client fidel si ati ales plata cash aveti" +
                    " " +
                    "un " +
                    "discount de " + discount +
                    "%! Suma finala de platit este " + valoarePlata + " RON");
        } else {
            System.out.println("Aveti de platit suma de " + valoarePlata + " RON!");
        }
    }


    private String citireMetodaPlata() throws IOException {

        System.out.println("Optiunile de plata sunt " + CASH + " sau " + CARD + "!\nCu ce vreti sa " +
                "platiti?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String ceAmCitit = "";
        boolean flag = false;
        while (!flag) {
            ceAmCitit = in.readLine().toUpperCase();
            if (ceAmCitit.equals(CASH.toString()) || ceAmCitit.equals(CARD.toString())) {
                flag = true;
                return ceAmCitit;
            } else {
                flag = false;
                System.out.println("Metoda de plata citita neacceptata!Mai incearca!");
            }
        }
        return ceAmCitit;
    }


    public void afisareSpecialeInformatiiClient() {

        viewClient.afisareInformatiiClient(modelClient);
    }
}
