//Delcare a Class with [access modifier] [class] [CamelCaseName]
public class PezDispenser{
  //Set "STATE" with Member variable using same syntax as declaring a var; start name with "m" then mCamelCase
  //make the member variables private so that you cant get or set the name, you then build a method that exposes the value
 private String mCharacterName; //Variable declared but not initialized
  
  //CONSTRUCTOR: the return type is the type of class that they are
  // [access modifier] [classTYPE](TYPE parameter)
  public PezDispenser(String characterName){
   //initialization code - this shows that the member variable is distinct from the varible passed in
    mCharacterName = characterName;
  }
  
  //METHOD: to expose value of private member - this is a getter method
  // [access modifier] [return-type] [camelCaseName](parameters]
  public String getCharacterName(){
    //It is in scope, in other languages you need to preface with "this"
    return mCharacterName;
  }
}
