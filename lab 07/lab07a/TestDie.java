import java.util.Scanner;
/**
 * __new way dice game___ 
 * @author __onuralp avcý___
 * @version __27.11.2019__
 */ 

public class TestDie
{
   public static void main(String[] args){
      Scanner scan = new Scanner( System.in);

      //variables
      Die die1;
      Die die2;

      //constants

      //program code
      die1 = new Die();
      die2 = new Die();
      die1.roll();
      System.out.println( die1);
      System.out.println( die2);


   }
}