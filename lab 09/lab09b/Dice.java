// header comment
public class Dice
{
   // properties
   int die1Face;
   int die2Face;

   Die die1 = new Die();
   Die die2 = new Die();

   // constructors
   
   //#Roll
   public int roll()
   {
      die1Face = die1.roll();
      die2Face = die2.roll();
      return die1Face + die2Face;
   }

   //#Die 1 Face Value
   public int getDie1FaceValue()
   {
      return die1Face;
   }

   //#Die 2 Face Value
   public int getDie2FaceValue()
   {
      return die2Face;
   }

   //#4 Dice Total
   public int getDiceTotal()
   {
      return die1Face + die2Face;
   }
   
   // methods
   public String toString()
   {
      return "" + roll() + " " + getDie1FaceValue() + " " + getDie2FaceValue() + " " + getDiceTotal();
   }


}