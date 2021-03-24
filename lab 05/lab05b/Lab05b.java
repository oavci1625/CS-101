import java.util.Scanner;

/**
 * __Lab 05 b prints out the cells with their column and row number___ 
 * @author __onuralp avcı___
 * @version 5.11.2019
 */ 
public class Lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      String strColumn;
      String strRow;
      int intColumn;
      int intRow;
      int currentColumn;
      int currentRow;
      int space;


      // program code

      System.out.println("Enter column number:");
      strColumn = scan.next();

      System.out.println("Enter row number:");
      strRow = scan.next();

      //defining int values of strRow and strColumn in different integer variables intRow and intColumn
      intColumn = Integer.parseInt(strColumn);
      intRow = Integer.parseInt(strRow);

      //Current column and row are for printing the current values of the cell
      currentColumn = 1;
      currentRow = 1;

      //FIRST LOOP This loop prints the cells with their row and column number
      for( int intRowLoop = intRow; intRowLoop > 0 ; intRowLoop += (-1)){
         for( int intColumnLoop = intColumn; intColumnLoop > 0; intColumnLoop += (-1)){
            //Space is the number of spaces in the cell and it is redefined for every turn in the loop
            space = 5 - Integer.toString(currentColumn).length() - Integer.toString(currentRow).length();
            //printing the spaces
            for( int spaceLoop = space; spaceLoop > 0; spaceLoop += (-1)){
               System.out.print(" ");
            }
            //printing the value
            System.out.print(currentRow + "," + currentColumn);
            currentColumn += 1;
         }
         System.out.println("");
         //Program passes to next line which means next row, So 1 is added to row and column is again assigned as 1
         currentColumn = 1;
         currentRow += 1;
      }
      System.out.println("");

      //reseting  the values of row and column for other loops
      currentRow = 1;
      currentColumn = 1;

      //SECOND LOOP Prints out the product of the column and row number
      for( int intRowLoop = intRow; intRowLoop > 0 ; intRowLoop += (-1)){
         for( int intColumnLoop = intColumn; intColumnLoop > 0; intColumnLoop += (-1)){
            space = 6 - Integer.toString(currentColumn * currentRow).length();
            for( int spaceLoop = space; spaceLoop > 0; spaceLoop += (-1)){
               System.out.print(" ");
            }
            System.out.print(currentRow * currentColumn);
            currentColumn += 1;
         }
         System.out.println("");
         currentColumn = 1;
         currentRow += 1;
      }
      System.out.println("");

      currentRow = 1;
      currentColumn = 1;

      
      //THIRD LOOP Prints the number of the cell from 1 to n which is equal to (intRow * intColumn)
      for( int intRowLoop = intRow; intRowLoop > 0 ; intRowLoop += (-1)){
         for( int intColumnLoop = intColumn; intColumnLoop > 0; intColumnLoop += (-1)){
            space = 6 - Integer.toString(currentColumn).length();
            for( int spaceLoop = space; spaceLoop > 0; spaceLoop += (-1)){
               System.out.print(" ");
            }
            System.out.print(currentColumn);
            currentColumn += 1;
         }
         System.out.println("");
      }
      System.out.println("");


      currentRow = 1;
      currentColumn = 1;

      
      //FOURTH LOOP Only prints the number of row in the first cell in the row. then print "-" in the remaining cells
      for( int intRowLoop = intRow; intRowLoop > 0 ; intRowLoop += (-1)){
         space = 6 - Integer.toString(currentRow).length();
         for( int spaceLoop = space; spaceLoop > 0; spaceLoop += (-1)){
            System.out.print(" ");
         }
         System.out.print(currentRow);
         for( int intColumnLoop = intColumn - 1; intColumnLoop > 0; intColumnLoop += (-1)){
            for( int x = 5; x > 0; x += (-1)){
               System.out.print(" ");
            }
            System.out.print("-");
            currentColumn += 1;
         }
         System.out.println("");
         currentColumn = 1;
         currentRow += 1;
         
      }
      System.out.println("");

   }

}