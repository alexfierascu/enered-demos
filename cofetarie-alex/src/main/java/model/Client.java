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

  private String nume;

  private String prenume;

  private String adresa;

  private int varsta;

  private boolean isClient;


  @Override
  public void addClient () {

  }


  @Override
  public void removeClient () {

  }


  @Override
  public String updateClient (String proprietate, String valoare) {

    switch (proprietate) {
      case "nume":
        setNume(valoare);
        break;
      case "prenume":
        setPrenume(valoare);
        break;
      case "adresa":
        setAdresa(valoare);
        break;
      case "varsta":
        setVarsta(Integer.parseInt(valoare));
        break;
      default:
        System.out.println("Proprietatea nu a fost gasita");
    }
    System.out.println("Proprietatea " + proprietate + " a fost schimbata cu " + valoare);
    return valoare;
  }


  @Override
  public void deliverToClient () {

    System.out.println("Comanda va fi livrata la " + getAdresa());
  }


  public void deliverToClient (String newAddress) {

    setAdresa(newAddress);
    System.out.println("Comanda va fi livrata la " + newAddress);
  }


  @Override
  public void makePayment (double valoarePlata) throws IOException {

    String metodaPlata = citireMetodaPlata();

    double discount = 20;
    if (isClient && metodaPlata.equals(CARD.toString())) {
      valoarePlata = valoarePlata - ((valoarePlata * discount) / 100);
      System.out.println("Pentru ca ati ales plata cu cardul aveti un discount de " + discount +
                             "%! Suma finala de platit este " + valoarePlata + " RON");
    } else if (isClient) {
      discount -= 10;
      valoarePlata = valoarePlata - discount;
      System.out.println("Pentru ca ati ales plata cash aveti un discount de " + discount +
                             "%! Suma finala de platit este " + valoarePlata + " RON");
    } else {
      System.out.println("Aveti de platit suma de " + valoarePlata + " RON!");
    }
  }


  public String citireMetodaPlata () throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Cu ce vreti sa platiti? CASH/ CARD?");
    String metodaPlata = in.readLine().toUpperCase();
    return metodaPlata;
  }
}

