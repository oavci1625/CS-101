import java.util.Scanner;

/**
 * __Lab 05 D___ 
 * @author __onuralp avcı___
 * @version __6.11.2019__
 */ 
public class Lab05d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int numberOfTerms;
      double divider;
      double pi;
      double accuracy;

      // program code

      // First method using Math.PI
      System.out.println(Math.PI);

      //Second method using pi formula
      System.out.println("Enter the number of terms:");
      numberOfTerms = scan.nextInt();
      divider = 1.0;
      pi = 0;
      for( int numberOfTermsLoop = numberOfTerms; numberOfTermsLoop > 0; numberOfTermsLoop += (-1)){
         pi = pi + (4.0 / divider);
         if ( divider > 0){
            divider += 2.0; 
         }
         else{
            divider += -2.0;
         }
         divider = divider * (-1);
      }
      System.out.println(pi);

      //reset the value of pi and divider
      pi = 0;
      divider = 1.0;

      //Third method 
      System.out.println("Enter the accuracy you want:");
      accuracy = scan.nextDouble();

      do{
         pi = pi + (4.0 / divider);
         if ( divider > 0){
            divider += 2.0; 
         }
         else{
            divider += -2.0;
         }
         divider = divider * (-1);
      }while( accuracy < Math.abs(Math.PI - pi) ); 
      System.out.println((Math.PI - pi));
      System.out.println(pi);


   }

}