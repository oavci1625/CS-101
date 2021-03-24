import java.util.Scanner;

/**
 * __new way dice game___ 
 * @author __onuralp avcý___
 * @version __27.11.2019__
 */ 
public class TestDiceGame
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      DiceGame diceGame = new DiceGame();


      // program code
      System.out.println( "Start...");
      
      System.out.println("Number of throws for getting 6-6 is: " + diceGame.play() );

      System.out.println( "End.");
   }

}