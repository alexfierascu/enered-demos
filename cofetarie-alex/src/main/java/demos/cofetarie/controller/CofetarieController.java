package demos.cofetarie.controller;


import demos.cofetarie.model.Client;
import demos.cofetarie.model.Cofetarie;

import java.util.List;


public class CofetarieController {


  private Cofetarie cofetarie;


  void addClient (Client clientNou) {

    cofetarie.setListaClienti((List<Client>) clientNou);
  }
}
