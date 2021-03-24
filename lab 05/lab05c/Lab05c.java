import java.util.Scanner;

/**
 * __Lab05c___ 
 * @author __onuralp avcı___
 * @version __6.11.2019_
 */ 
public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      double sum;
      String choice;
      StringBuilder value;

      // program code

      sum = 0.0;

      System.out.println("Welcome to \"SimpleCalc\"...");


      //Loop 1 It stays in this loop ıntil the user selects quit
      do
      {
         // Program interace
         System.out.println("------------------");
         System.out.println("[" + sum + "]");
         System.out.println("------------------");
         System.out.println("  +,-,*,/ value");
         System.out.println("  Clear");
         System.out.println("  Quit");
         System.out.println("Select:");
         choice = scan.nextLine();

         //changic string to string builder in order to be able to format it
         // if statement is needed for avoding any error when the user enters less than 2 char string because program removes first to chars
         if( choice.length() > 1){
            value = new StringBuilder(choice);
            value.deleteCharAt(0);
            value.deleteCharAt(0);

            //Defining each operation

            if( choice.charAt(0) == '+'){
               sum += Double.parseDouble(value.toString());
            }

            if( choice.charAt(0) == '-'){
               sum += -Double.parseDouble(value.toString());
            }

            if( choice.charAt(0) == '*'){
               sum = sum * Double.parseDouble(value.toString());
            }

            if( choice.charAt(0) == '/'){
               sum = sum / Double.parseDouble(value.toString());
            }

            //This is the first if statement for clear. It look for exact word "clear" or "Clear"
            if( (choice.equals("clear")) || (choice.equals("Clear")) ){
               sum = 0;
            }
         }
         else{
            //This is the second if statement for clear. It look for only one character "c" or "C"
            choice = choice + " ";
            if( choice.charAt(0) == 'C' || choice.charAt(0) == 'c' ){
               sum = 0;
            }
         }
      }while( !choice.equals("Quit") && !choice.equals("quit") && choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');


   }

}