import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
      Console console = System.console();      
      String ageAsString = console.readLine("How old are you?  ");
      
      int age = Integer.parseInt(ageAsString);
      if (age < 13){
        console.printf("Sorry you must be at least 13 to use this.\n");
        System.exit(0);
      }

        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        String noun = console.readLine("Enter a noun:  ");
        if (noun.equalsIgnoreCase("dork") ||
            noun.equalsIgnoreCase("jerk")){
          console.printf("That language is not allowed. Exiting. \n\n");
          System.exit(0);
        }
      console.printf("%s is very %s", name, adjective);
      
    }
    
}