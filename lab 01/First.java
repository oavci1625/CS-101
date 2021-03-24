import java.util.Scanner;
public class First
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      int x = 0;
      int y ;
      y = scan.nextInt();
      
      while (x < 3){
         
         if (y == 5){
         System.out.println("it is 5");
         x = x + 1;
         while (x < 2){
            y = scan.nextInt();}
         }
      else if (y < 0)
         {
         System.out.println("it is negative");
         x = x + 1;
         while (x < 2){
            y = scan.nextInt();}
         }
      else if (y >= 0 && y<5)
         {
         System.out.println("it is in between 0 and 5");
         x = x + 1;
         while (x < 2){
            y = scan.nextInt();}
         }
      else
             {
         System.out.println("it is more than 5");
         x = x + 1;
         while (x < 2){
            y = scan.nextInt();}
         }
      }
   }
}