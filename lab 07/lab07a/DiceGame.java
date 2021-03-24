// header comment
public class DiceGame
{
   // properties
   Dice dice = new Dice();

   // constructors

   // methods
   public int play()
   {
      int count;

      count = 1;
      while( dice.roll() != 12){
         count++;
      }
      return count;
   }
}