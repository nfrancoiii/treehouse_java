//PACKAGE we import this package to be able to use "Console" methods
import java.io.Console;

public class Prompter{
  //
 private Game mGame;
  
  //CONSTRUCTOR has the name of its own class
  public Prompter(Game game) {
   mGame = game; 
  }
  
  //METHOD
  public boolean promptForGuess(){
   Console console = System.console();
    String guessAsString = console.readLine("Enter a letter: ");
    char guess = guessAsString.charAt(0);
    return mGame.applyGuess(guess);
  }
  
  public void displayProgress(){
   System.out.printf("You have %d tries left. Try to solve: %s\n", mGame.getRemainingTries(), mGame.getCurrentProgress());
     
  }
  
  public void play(){
   while (mGame.getRemainingTries() > 0) {
    displayProgress();
     promptForGuess();
   }
  }
}