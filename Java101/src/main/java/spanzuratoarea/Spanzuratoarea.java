package spanzuratoarea;


import java.io.IOException;


public class Spanzuratoarea {

  public static void main (String[] args) throws IOException {

    SpanzuratoareaModelInterface model = new SpanzuratoareaModel();
    SpanzuratoareaViewInterface view = new SpanzuratoareaTextView(model);
    SpanzuratoareaControllerInterface controller = new SpanzuratoareaTextController(model, view);
    controller.processCommands();
  }

}
