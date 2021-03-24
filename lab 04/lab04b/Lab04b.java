import java.util.Scanner;

/**
 * __Lab04b___ 
 * @Onural Avcı___
 * @29.10.2019__
 */ 
public class Lab04b
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      //constants

      //variables
      int n;
      int number;
      int sum;
      int max;
      int min;
      //program code

      n = 100;
      sum = 0;
      max = 0;
      min = 0;
      System.out.println("Enter your number(s):");

      while (n > 0){
         number = scan.nextInt();
         sum = sum + number;
         n = n - 1;
         if (number > max){
            max = number;
         }
         if (number < min){
            min = number;
         }
      }
      System.out.println("Sum of the number(s) is " + sum);
      System.out.println("Average of the number(s) is " + sum/100);
      System.out.println("Maximum of the number(s) is " + max);
      System.out.println("Minimum of the number(s) is " + min);   
   }
}