public class Game {
 //member variable
  public static final int MAX_MISSES = 7;
  private String mAnswer;
  private String mHits;
  private String mMisses;
  
  //CONSTRUCTOR
  public Game(String answer){
   mAnswer = answer; 
    mHits = "";
    mMisses = "";
  }
  
  //METHOD
  public boolean applyGuess(char letter){
   boolean isHit = mAnswer.indexOf(letter) >= 0;
    if (isHit){
     mHits += letter; 
    } else {
     mMisses += letter; 
    }
    return isHit;
  }
  
  public String getCurrentProgress(){
    //initialize empty String-TYPE variable named progress
   String progress = "";
    //use ForEach Loop (TYPE varName : OBJECTTOLOOP)
    for (char letter : mAnswer.toCharArray()){
      //initialize char TYPE variable named display and make the default value a dash
     char display = '-';
      //if the letter is in the hits variable already (we successfully guessed it)
      if (mHits.indexOf(letter) >=0){
        //set the display character to the letter
        display = letter;
      }
      //set the progress string to include the newest display letter
      progress += display;
    }
    //return the String progress
    return progress;
  }
  
  public int getRemainingTries(){
   return MAX_MISSES - mMisses.length(); 
  }
  
}