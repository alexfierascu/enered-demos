package spanzuratoarea;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SpanzuratoareaModel implements SpanzuratoareaModelInterface {

  private List<String> words;

  private int bodyParts;

  private String word;

  private char[] guessedWord;


  public SpanzuratoareaModel () throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(
        new FileInputStream("C:\\proiecte\\EnerED\\EneredDemos\\Java101\\src\\main\\resources\\words.txt")));
    String word = br.readLine();
    words = new ArrayList<String>();
    while (word != null) {
      words.add(word.toUpperCase());
      word = br.readLine();
    }
  }


  @Override
  public boolean addLetter (char c) {

    boolean found = false;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == c) {
        guessedWord[i] = c;
        found = true;
      }
    }
    return found;
  }


  @Override
  public void addBodyPart () {

    bodyParts++;
  }


  @Override
  public boolean isGameOver () {

    return bodyParts == 6 || getWord().indexOf('_') == -1;
  }


  @Override
  public boolean isHumanPlayerWinner () {

    return getWord().indexOf('_') == -1;
  }


  @Override
  public void reset () {

    Random random = new Random();
    word = words.get(random.nextInt(words.size()));
    int length = word.length();
    guessedWord = new char[length];
    for (int i = 0; i < length; i++) {
      guessedWord[i] = '_';
    }
    //afisare hint - prima si ultima litera
//    addLetter(word.charAt(0));
//    addLetter(word.charAt(length - 1));
    bodyParts = 0;
  }


  @Override
  public int getBodyPartsCount () {

    return bodyParts;
  }


  @Override
  public String getWord () {

    return String.valueOf(guessedWord);
  }
}
