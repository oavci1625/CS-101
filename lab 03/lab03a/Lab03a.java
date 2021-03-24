import java.util.Scanner;


/**
 * __number counter___ 
 * @onuralp avcý___
 * @23/10/2019__
 */ 

public class Lab03a
{
   public static void main(String args[])
   {
     //constants
     
     //variables
      Scanner scan = new Scanner(System.in);
      int n;
      int nx;
      
      //program code
      
      n = scan.nextInt();
      nx = n;
      int y = 0;
      while (n >= 3)
      {
         if (y % 5 != 0){
          if (n % 3 == 0 || n % 4 == 0)
          { if (n % 3 == 0 && n % 4 == 0)
               System.out.print("");
            else
               System.out.print(n + " ");
            y = y +1;
          }
         }
         else{
         if (n % 3 == 0 || n % 4 == 0)
          { if (n % 3 == 0 && n % 4 == 0)
               System.out.print("");
            else
               System.out.println(n + " ");
            y = y +1;
         }
         }
n = n - 1;
      
   }
   }
}