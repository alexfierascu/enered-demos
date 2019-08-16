package Polimorfism;


public class Animal {

  //proprietatii sunt publice (default access modifier)
  //ca sa fie aplicat corect principiul de incapsulare, proprietatile trebuie facute private (eg:
  // private String numeAnimal)

  String numeAnimal;

  String rasaAnimal;

  String culoareAnimal;


  public String getNumeAnimal () {

    return numeAnimal;
  }


  public void setNumeAnimal (String numeAnimal) {

    this.numeAnimal = numeAnimal;
  }


  public String getRasaAnimal () {

    return rasaAnimal;
  }


  public void setRasaAnimal (String rasaAnimal) {

    this.rasaAnimal = rasaAnimal;
  }


  public String getCuloareAnimal () {

    return culoareAnimal;
  }


  public void setCuloareAnimal (String culoareAnimal) {

    this.culoareAnimal = culoareAnimal;
  }


  //prin "Overload" sau supra-incarcare putem construi metode cu acelasi nume, dar cu un alt set
  // de parametrii, implicit o alta implementare a metodei. In cazul clasei Animal, metoda
  // demoOVerload are doar un sg parametru de tip String (numeAnimal) si afiseaza numele acestuia
  public void demoOverload (String numeAnimal) {

    System.out.println("Numele animalului este " + numeAnimal);
  }


  //declaram metoda afisareSunetAnimal ca fiind publica, astfel ea poate fi apelata si de clasele
  // care mostenesc aceasta clasa
  public void afisareSunetAnimal () {

    System.out.println("Animale emit sunete diferite in functie de familia din care fac parte");
  }
}
