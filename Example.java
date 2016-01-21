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
      
      if(dispenser.isEmpty()){
       System.out.println("It is currently empty"); 
      }
      System.out.println("Loading...");
      dispenser.load();
      if (!dispenser.isEmpty()){
       System.out.println("It is no longer empty"); 
      }
      
      while (dispenser.dispense()){
        System.out.println("Chomp!");
      }
      if (dispenser.isEmpty()){
        System.out.println("Ate all the PEZ!");
      }
     
      dispenser.load(4);
      dispenser.load(2);
       while (dispenser.dispense()){
        System.out.println("Chomp!");
      }
      //TRY-CATCH BLOCK
      try{
      dispenser.load(400);
      } 
      // arguments of the CATCH block are (exceptionTYPE abbrev.)
      // iae --> lower case first letters of the exception
      catch (IllegalArgumentException iae){
        System.out.println("Whoa there");
        System.out.printf("The error was: %s\n", iae.getMessage());
      }
      }
}