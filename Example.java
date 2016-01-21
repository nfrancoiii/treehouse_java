public class Example {
    
    public static void main(String[] args) {
        // Your amazing code goes here...
     System.out.println("We are making a new Pez Dispenser."); 
      /* "PezDispenser" represents the class TYPE; we have to initialize our variable by calling the TYPE: PezDispenser
         "dispenser" is the name of our variable with TYPE PezDispenser
         "new" is a keyword to initialize the new variable
         "PezDispenser()" 
      */
      PezDispenser dispenser = new PezDispenser("Donatello");
      System.out.printf("The dispenser character is %s\n", dispenser.getCharacterName());
    }
}