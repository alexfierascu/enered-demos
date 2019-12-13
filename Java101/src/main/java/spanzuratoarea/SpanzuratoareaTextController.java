package spanzuratoarea;


import java.util.Scanner;


public class SpanzuratoareaTextController implements SpanzuratoareaControllerInterface {

  private SpanzuratoareaModelInterface model;

  private SpanzuratoareaViewInterface view;

  private Scanner scanner;


  public SpanzuratoareaTextController (
      SpanzuratoareaModelInterface model,
      SpanzuratoareaViewInterface view
  ) {

    this.model = model;
    this.view = view;
    scanner = new Scanner(System.in);
  }


  @Override
  public void processCommands () {

    boolean playAgain;
    do {
      model.reset();
      view.displayHangman();
      view.displayWord();
      while (!model.isGameOver()) {
        view.displayMessage("Please enter a letter: ");
        String line = scanner.nextLine().toUpperCase();
        char c = line.charAt(0);

        if (!model.addLetter(c)) {
          model.addBodyPart();
        }
        view.displayHangman();
        view.displayWord();
      }

      if (model.isHumanPlayerWinner()) {
        view.displayMessage("CONGRATULATIONS!!!\n");
      } else {
        view.displayMessage("YOU'VE BEEN HANGED...\n");
      }
      view.displayMessage("Would you like to play again? ");
      playAgain = scanner.nextLine().toUpperCase().startsWith("Y");
    } while (playAgain);
  }

}

