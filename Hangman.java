public class Hangman {
    
    public static void main(String[] args) {
        // Enter amazing code here:
      //Create instance of class-TYPE "Game" and call it "game"
      //In new instance of TYPE "Game" we pass it an answer
      Game game = new Game("treehouse");
      //instantiate a prompter-classTYPE object and pass it a game object
      Prompter prompter = new Prompter(game);
      prompter.play();

    }

}