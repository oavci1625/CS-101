import java.util.Scanner;

/**
 * __ask for 2 numbers and compute them___ 
 * @onuralp_avcý___
 * @16.10.2019__
 */ 
public class Lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //variables
      
      int numbera;
      int numberb;
      int sum;
      int difference;
      int product;
      int division;
      
      //program code
      
      System.out.println("Enter the first number:");   
      numbera = scan.nextInt();
      
      System.out.println("Enter the second number:");
      numberb = scan.nextInt();
      
      sum = numbera + numberb;
      difference = numbera - numberb;
      product = numbera * numberb;
      division = numbera / numberb;
      
      System.out.println("Sum of the numbers: " + sum);
      System.out.println("Difference of the numbers: " + difference);
      System.out.println("Product of the numbers : " + product);
      System.out.println("Division of the numbers :" + division);
      

   }

}