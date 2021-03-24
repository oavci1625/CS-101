import java.util.Scanner;

/**
 * __old way dice game___ 
 * @author __onuralp avcý___
 * @version __27.11.2019__
 */ 
public class Lab07a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int diceA;
      int diceB;
      int count;

      // program code
      System.out.println( "Start...");
      count = 0;
      do
      {
         diceA = (int)(Math.random() * 6) + 1;
         diceB = (int)(Math.random() * 6) + 1;
         System.out.print( diceA + " - ");
         System.out.println( diceB);
         count ++;
      }while( diceA + diceB != 12);
      
      System.out.println( "Number of throws for getting 6-6 is : " + count);
      System.out.println( "End.");
   }

}