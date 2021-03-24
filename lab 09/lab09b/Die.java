// header comment
public class Die
{
   // properties
   int currentFace;

   // CONSTRUCTORS
   //Roll constructor
   public int roll()
   {
      currentFace = (int)(Math.random()*6) + 1;
      return currentFace;
   }

   //Face value constructor
   public int getFaceValue()
   {
      return currentFace;
   }
   
   // METHODS

   //To string constructor
   public String toString()
   {
      return "" + currentFace ;
   }


}