package Polimorfism;



/*
    * Prin conceptul de MOSTENIRE clasele "Copil" mostenesc proprietatile si metode de la clasa
     "Parinte". In cazul exemplului nostru, clasa "Parinte" este clasa Animal, iar clasele
     "Copil" sunt clasele Caine si Pisica. Prin urmare, proprietatile
    *
    *numeAnimal             (de tip String)
    *rasaAnimal             (de tip String)
    * culoareAnimal         (de tip int)
    *
    * si metodele
    *
    *
    * getNumeAnimal()
    * setNumeAnimal (String numeAnimal)
    * getRasaAnimal()
    * setRasaAnimal(String rasaAnimal)
    * getCuloareAnimal()
    * setCuloareAnimal(int culoareAnimal)
    * demoOverload(String culoareAnimal)
    *afisareSunetAnimal()
    * din clasa Animal sunt vizibile si in clasele Caine si Pisica
    *
    * ------------------------------------------------
    * De asemenea, pentru aplicarea !!!corecta!!! a POLIMORFISMULUI este necesar ca cele 2 clase
    * copil (Caine si Pisica) sa supra-scrie si sa supra-incarce metode din clasa parinte (Animal)
    *
    * metoda supra-incarcata (OVERLOAD) - demoOverload
    * metoda supra-scrisa (OVERRIDE)- afisareSunetAnimal
    *
    * */
/*
 * OVERLOAD = supra-incarcare = Runtime Polymorfism
 * OVERRIDE = supra-scriere = Compile Time Polymorfism
 * */

public class Caine extends Animal {

  /*
   * clasa Caine mosteneste proprietatile si metodele clasei Animal folosind cuvantul cheie
   * "extends"
   * Astfel, clasa Caine devine clasa "copil" pentru clasa Animal care devine clasa "parinte"
   * */


  //prin "Overload" sau supra-incarcare putem construi metode cu acelasi nume, dar cu un alt set
  // de parametrii, implicit o alta implementare a metodei. In cazul clasei Caine, metoda
  // demoOVerload are 3 parametrii de tip String (rasaAnimal, numeAnimal si culoareAnimal) si
  // afiseaza rasa, numele si culoarea cainelui
  public void demoOverload (String rasaAnimal, String numeAnimal, String culoareAnimal) {

    System.out.println("Rasa cainelui este de tip " + rasaAnimal + ". Numele cainelui este " + numeAnimal +
                           " si are culoarea " + culoareAnimal);
  }


  //pentru a aplica corect Polimorfismul asupra clasei Caine, trebuie supra-scriem metoda
  // afisareSunetAnimal. In cazul de fata, metoda "afisareSunetAnimal" din clasa Caine are alta
  // implementare fata de metoda "afisareSunetAnimal" din clasa Animal
  @Override
  public void afisareSunetAnimal () {

    System.out.println("Animalul Caine emite sunete precum " + "\nHam-Ham");
  }

}
