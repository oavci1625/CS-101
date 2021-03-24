import java.util.Scanner;

public class Lab10b{
   
   public static void main(String[] args){

      Scanner scan = new Scanner( System.in);
      //variables
      String random;
      int randomNumber;
      BigNum[] list;
      list = new BigNum[10];
      int maxLocation;
      int firstN;
      BigNum bigNumCopy;

      //constants

      //program code
      //creating a random array with big nums
      for ( int loop = 0; loop < 10; loop++){
         BigNum b1 = new BigNum();
         random = "";
         for ( int loop1 = 0; loop1 < BigNum.SIZE; loop1++){
            randomNumber = (int)(Math.random() * BigNum.BASE);
            if ( randomNumber < 10){
               random = random + randomNumber;
            }
            else {
               random = random + String.valueOf( (char)(randomNumber + 55));
            }
         }
         b1.create(random);
         list[loop] = b1;
      }
      
      //printing out the list
      for ( int loop = 0; loop < 10; loop++){
         System.out.println( (loop + 1) + " - " + list[loop]);
      }
      
      System.out.println("Enter the number n:");
      firstN = scan.nextInt();
      
      //changing the max with the n-1 th element of the list
      for( int n = firstN; n > 0 ; n = scan.nextInt() ){
         maxLocation = 0;
         for( int loop = 0; loop < n; loop++){
            if( list[maxLocation].isLessThan(list[loop])){
               maxLocation = loop;
            }
         }
         bigNumCopy = list[maxLocation];
         list[maxLocation] = list[ n - 1];
         list[ n - 1] = bigNumCopy;

         for( int loop = 0; loop < 10; loop++){
            System.out.println( (loop + 1) + " - " + list[loop]);
         }

         System.out.println("Enter the number n:");
      }

   } 
}