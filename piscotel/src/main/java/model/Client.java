package model;

import lombok.*;
import utils.PaymentMethods;

import static utils.PaymentMethods.CARD;

//@Setter
//@Getter
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Client implements ClientModelInterface {
    private String nume, prenume, addresa;
    private int varsta;
    private boolean isClient;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAddresa() {
        return addresa;
    }

    public void setAddresa(String addresa) {
        this.addresa = addresa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setClient(boolean client) {
        isClient = client;
    }

    public Client() {
    }

    @Override
    public void addClient() {

    }

    @Override
    public void removeClient() {

    }

    @Override
    public String updateClient(String proprietate, String valoare) {
        switch (proprietate) {
            case "nume":
                setNume(valoare);
                break;
            case "prenume":
                setPrenume(valoare);
                break;
            case "adresa":
                setAddresa(valoare);
                break;
            case "varsta":
                setVarsta(Integer.parseInt(valoare));
                break;
            case "proprietatea nu exista":
                System.out.println("proprietatea nu a fost gasita");
                break;
        }
        System.out.println("Proprietatea " + proprietate + " a fost modificata la valoarea " + valoare);
        return valoare;
    }

    @Override
    public void deliverToClient() {
        System.out.println("comanda va fi livrata la " + getAddresa());
    }

    public void deliverToCLient(String newAddress) {
        setAddresa(newAddress);
        System.out.println("comanda va fi livrata la " + newAddress);
    }

    @Override
    public void makePayment(PaymentMethods metodaPlata, double valoareaPlata) {
        double discount = 20;
        if (isClient && metodaPlata.equals(CARD)) {
            System.out.println("Aveti un discount de " + discount + " % din: " + valoareaPlata + " Total de plata dupa aplicare discount = " + (valoareaPlata - valoareaPlata * discount / 100));
        } else if (isClient) {
            System.out.println("Aveti un discount de " + (discount - 10) + " % din: " + valoareaPlata + " Total de plata dupa aplicare discount = " + (valoareaPlata - valoareaPlata * (discount - 10) / 100));
        } else {
            System.out.println("nu aveti nici un discount, totalul de plata este: " + valoareaPlata);
        }
    }

    @Override
    public boolean isClient() {
        return true;
    }

//    public Client(String nume, String prenume, String addresa, int varsta) {
//        this.nume = nume;
//        this.prenume = prenume;
//        this.addresa = addresa;
//        this.varsta = varsta;
//    }


}
