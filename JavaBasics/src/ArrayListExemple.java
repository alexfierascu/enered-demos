import java.util.ArrayList;


/*curs 10 EnerEd Java incepatori - exercitii cu ArrayLists<>

	ArrayList = colectie simpla care poate stoca orice tip de obiect.

   Clasa ArrayList este continuta in spatiul de nume System.Collections.
   Aceasta clasa ne permite sa construim un vector care sa creasca in marime,
   adaugand mereu elemente noi.

   Metode ArrayList
   .add(element)
   .add(index,element)
   .remove(element)
   .remove(index)
   .remove(element)
   .get(index)
   .size()
   .set(index,element)
   .addAll(ArrayList)
   .addAll(index, ArrayList)

*/
public class ArrayListExemple {

  //Exemple de metode aplicate pe ArrayLists<>
  public static void main (String args[]) {

    System.out.println("Exercitii cu Array Lists");

    ArrayList<String> pra = new ArrayList<String>();
    ArrayList<String> cra = new ArrayList<String>();

    pra.add("coco"); // adaugam un element
    pra.add("nico"); // adaugam un element
    pra.add("peste"); // adaugam un element
    pra.add(2, "cico"); // adaugam un element pe pozitia 2
    pra.remove(1); // stergem un element de pe pozitia 1

    //afisam ArrayList pra
    for (int i = 0; i <= pra.size() - 1; i++) {
      System.out.println(pra.get(i));
    }

    System.out.println("----------------------------");
    System.out.println("----------------------------");


    cra.add("cristi"); // adaugam un element
    cra.add("mircea"); // adaugam un element


    pra.addAll(cra); // concatenam ArrayList pra cu cra

    //afisam ArrayList pra - alta metoda decat cea de sus
    for (String element : pra) {
      System.out.println(element);
    }
  }

}
