package spanzuratoarea;


public interface SpanzuratoareaModelInterface {

  public boolean addLetter (char c);


  public void addBodyPart ();


  public boolean isGameOver ();


  public boolean isHumanPlayerWinner ();


  public void reset ();


  public int getBodyPartsCount ();


  public String getWord ();

}
