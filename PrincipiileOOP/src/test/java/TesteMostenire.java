import Mostenire.Autobuz;
import Mostenire.Autovehicul;
import Mostenire.Masina;
import org.junit.jupiter.api.Test;

/*
    * Prin conceptul de mostenire clasele "Copil" mostenesc proprietatile si metode de la clasa
     "Parinte". In cazul exemplului nostru, clasa "Parinte" este clasa Autovehicul, iar clasele
     "Copil" sunt clasele Autobuz si Masina. Prin urmare, proprietatile
    *
    *marca            (de tip String)
    *serieSasiu       (de tip String)
    * anulFabricarii  (de tip int)
    *
    * si metodele
    *
    *
    * getMarca()
    * setMarca (String marca)
    * getSerieSasiu()
    * setSerieSasiu(String serieSasiu)
    * getAnulFabricarii()
    * setAnulFabricarii(int anulFabricarii)
    * afisareTipAutovehicul()
    *
    * din clasa Autovehicul sunt vizibile si in clasele Autobuz si Masina
    *
    * */

public class TesteMostenire {

  @Test
  public void testAutovehicul () {
    //creat un obiect de tip Autovehicul cu numele X
    Autovehicul X = new Autovehicul();
    X.setMarca("Mercedes");
    X.setAnulFabricarii(2010);
    X.afisareTipAutovehicul();

  }


  @Test
  public void testMasina () {

    Masina BMW = new Masina();

    //apelam metodele setMarca, setAnulFabricatiei si afisareTipAutovehicul din clasa "Parinte"
    // Autovehicul. Observam ca metodele pot fi aplicate si asupra clasei "Copil" Masina, chiar
    // daca ele nu au fost declarate in interiorul clasei. Ele au fost mostenite!
    BMW.setMarca("BMW");
    BMW.setAnulFabricarii(2018);
    BMW.afisareTipAutovehicul();

    //apelam metoda afisareTipMasina din clasa Masina
    BMW.afisareTipMasina();
  }


  @Test
  public void testAutobuz () {

    Autobuz A532 = new Autobuz();

    //apelam metodele setMarca, setAnulFabricatiei si afisareTipAutovehicul din clasa "Parinte"
    // Autovehicul. Observam ca metodele pot fi aplicate si asupra clasei "Copil" Autobuz, chiar
    // daca ele nu au fost declarate in interiorul clasei. Ele au fost mostenite!
    A532.setMarca("Suzuki");
    A532.setAnulFabricarii(2018);
    A532.afisareTipAutovehicul();

    //apelam metoda afisareTipMasina din clasa Autobuz
    A532.afisareTipAutobuz();
  }

}
