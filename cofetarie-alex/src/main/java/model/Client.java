package model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static utils.PaymentMethods.CARD;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client implements ClientModelInterface {

  private String numeClient;

  private String prenumeClient;

  private String adresaClient;

  private int varstaClient;

  private boolean clientFidel;


  @Override
  public void addClient () {

  }


  @Override
  public void removeClient () {

  }


  @Override
  public String updateClient (String proprietate, String valoare) {

    switch (proprietate) {
      case "numeClient":
        setNumeClient(valoare);
        break;
      case "prenumeClient":
        setPrenumeClient(valoare);
        break;
      case "adresaClient":
        setAdresaClient(valoare);
        break;
      case "varstaClient":
        setVarstaClient(Integer.parseInt(valoare));
        break;
      default:
        System.out.println("Proprietatea nu a fost gasita");
    }
    System.out.println("Proprietatea " + proprietate + " a fost schimbata cu " + valoare);
    return valoare;
  }


  @Override
  public void deliverToClient () {

    System.out.println("Comanda va fi livrata la " + getAdresaClient());
  }


  public void deliverToClient (String newAddress) {

    setAdresaClient(newAddress);
    System.out.println("Comanda va fi livrata la " + newAddress);
  }


  @Override
  public void makePayment (double valoarePlata) throws IOException {

    String metodaPlata = citireMetodaPlata();

    double discount = 20;
    if (clientFidel && metodaPlata.equals(CARD.toString())) {
      valoarePlata = valoarePlata - ((valoarePlata * discount) / 100);
      System.out.println("Pentru ca sunteti client fidel si ati ales plata cu cardul " +
                             "aveti un discount de" +
                             " " + discount +
                             "%! Suma finala de platit este " + valoarePlata + " RON");
    } else if (clientFidel) {
      discount -= 10;
      valoarePlata = valoarePlata - discount;
      System.out.println("Pentru ca sunteti client fidel si ati ales plata cash aveti un " +
                             "discount de " + discount +
                             "%! Suma finala de platit este " + valoarePlata + " RON");
    } else {
      System.out.println("Aveti de platit suma de " + valoarePlata + " RON!");
    }
  }


  public String citireMetodaPlata () throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Optiunile de plata sunt cash sau card! \nCu ce vreti sa platiti? ?");
    String metodaPlata = in.readLine().toUpperCase();
    return metodaPlata;
  }
}

