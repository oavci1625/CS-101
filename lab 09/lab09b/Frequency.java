import java.util.ArrayList;
/**
 * __Frequence tree of 1000 time die___ 
 * @author __onuralp avcı___
 * @version __11.12.2019__
 */
public class Frequency{

   public static void main(String[] args){

      ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList<Integer> starList = new ArrayList<Integer>();
      Dice dice = new Dice();

      //variables
      double star;
      int max;
      int row;

      //PROGRAM CODE
      //creating the list with 11 "0" in it
      for( int loop = 0; loop < 11; loop++){
         list.add(0);
      }

      // writing the numbers to the list
      for( int loop = 0; loop < 1000; loop++){
         dice.roll();
         list.set(dice.getDiceTotal()-2 , list.get(dice.getDiceTotal()-2)+1 );
      }

      //finding the maximum of the list
      max = 0;
      for (int loop = 0; loop < 11; loop++){
         if( list.get(loop) > max){
            max = list.get(loop);
         }
      }
      star = max / 10.0;

      //writing the number of stars needED for each number
      for( int loop = 0 ; loop < 11; loop++){
         starList.add(( int)( list.get(loop) / star) );
      }

      //Printing the frequence tree
      row = 10;
      for( int loop = 0; loop < 10; loop++){
         for( int loop2 = 0; loop2 < 11; loop2++){
            if( row - starList.get(loop2) > 0){
               System.out.print("   ");
            }
            else{
               System.out.print(" * ");
            }
         }
         System.out.println("");
         row --;
      }
   }
}