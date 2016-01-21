//Delcare a Class with [access modifier] [class] [CamelCaseName]
public class PezDispenser{
 //CONSTANTS are values that do not change and are written in ALLCAPS
 //We make the constant public so that people can see and use it, but the "final" keyword to make it such that people cannot change its value 
  //We use the keyword "static" to allow us to access the value in a context such as PezDispenser.MAX_PEZ
  public static final int MAX_PEZ = 12;

  //Set "STATE" with Member variable using same syntax as declaring a var; start name with "m" then mCamelCase
  //make the member variables private so that you cant get or set the name, you then build a method that exposes the value
 private String mCharacterName; //Variable declared but not initialized
  private int mPezCount;

  
  //CONSTRUCTOR: the return type is the type of class that they are
  // [access modifier] [classTYPE](TYPE parameter)
  public PezDispenser(String characterName){
   //initialization code - this shows that the member variable is distinct from the varible passed in
    mCharacterName = characterName;
    mPezCount = 0;
  }
  
  //METHOD: to expose value of private member - this is a getter method
  // [access modifier] [return-type] [camelCaseName](parameters]
  public String getCharacterName(){
    //It is in scope, in other languages you need to preface with "this"
    return mCharacterName;
  }
  
  //return-type "void" is used when you will not be returning a value but instead changing the internal state of the object
  //calling the "load(pezAmount)" method in the "load()" method allows us to initialize the method with some default value
  public void load(){
   load(MAX_PEZ); 
  }
  //Since the "load()" method above and the "load(pezAmount)" below have different "METHOD SIGNATURES", they are completely distinct.
  
  public void load(int pezAmount){
   int newAmount = mPezCount + pezAmount;
     if (newAmount > MAX_PEZ){
    //keyword THROW --> we instantiate a "new" exception and give it a message for the expected error
     throw new IllegalArgumentException("Too many PEZ!!!");
     
   }
    mPezCount = newAmount;
  }
  
  public boolean isEmpty(){
   return mPezCount == 0;
  }
  
  public boolean dispense(){
   boolean wasDispensed = false;
    if(!isEmpty()){
      mPezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }
}

