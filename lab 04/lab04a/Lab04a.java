import java.util.Scanner;

/**
 * __Lab04a___ 
 * @onuralp avc�___
 * @29.10.2019__
 */ 
public class Lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int n;
      int zero;
      int loop;
      double decimal;
      int nextLine;
      // program code
      System.out.println( "Start... Enter a number:");
      n = scan.nextInt();
      zero = 0;
      loop = 0;
      nextLine = 0;
      if(n < 0){
         System.out.println("Please enter a positive value!");
      }
      else{
         // 1. Loop This loop prints out the numbers from 0 to n exclusive
         while(zero < n-1){
            System.out.print(zero + " ");
            zero += 1;
         }
         while(zero == n-1){
            System.out.println(zero + " ");
            zero += 1;
         }
         zero = 0;

         // 2. Loop This loop prints out the numbers from  0 to n exclusive. Five numbers per line
         while(zero < n){
            if((zero+1) % 5 != 0){
               System.out.print(zero + " ");
               zero += 1;
            }
            else{
               System.out.println(zero);
               zero += 1;
            }
         }
         zero = 0;
         if(n % 5 != 0){
            System.out.println("");
         }


         // 3. Loop This loop prints out numbers from n to 0 inclusive
         while(zero < n){
            System.out.print(n-zero + " ");
            zero += 1;
         }
         while(zero == n){
            System.out.println(n-zero + " ");
            zero += 1;
         }
         zero = 0;

         // 4. Loop This loop prints out from -n to n both inclusive
         while(zero <= (2*n)){
            if(Math.abs((zero - n)) % 2 == 0){
               System.out.print((zero-n) + " ");
               zero += 1;
            }
            else{
               zero += 1;
            }
         }
         System.out.println("");
         zero = 0;

         // 5. Loop This loop prints out the squares of the even numbers from 0 to n inclusive. Five numbers per line
         while(zero < n+1){
            if((zero+2) % 10 != 0){
               if(zero % 2 == 0){
                  System.out.print(zero*zero + " ");
                  zero += 1;
               }
               else{
                  zero += 1;
               }
            }
            else{
               if(zero % 2 == 0){
                   System.out.println(zero*zero + " ");
                   zero += 1;
               }
            }
         }
         zero = 0;
         if((n+2) % 10 != 0 && (n+1) % 10 != 0){
            System.out.println();
         }

         // 6. Loop This loop prints out numbers from n to 3 which are divisiable either by 3 or 4. (5 numbers per line)
         while((n-zero) > 2){
            if((loop+1) % 5 != 0){
               if((n-zero) % 3 == 0 ^ (n-zero) % 4 == 0){
                  System.out.print(n-zero + " ");
                  zero += 1;
                  loop += 1;
                  nextLine += 1;
               }
               else{
                  zero += 1;
               }
            }
            else{
               if((n-zero) % 3 == 0 ^ (n-zero) % 4 == 0){
                  System.out.println(n-zero + " ");
                  zero += 1;
                  loop += 1;
                  nextLine += 1;
               }
               else{
                  zero += 1;
               }
            }
         }
         zero = 0;
         loop = 0;
         if(nextLine % 5 != 0){
            System.out.println();
         }
         nextLine = 0;

         // 7. Loop This loop ptints out the all divisiors of the number n in decreasing sequence.
         while((n-zero) > 1){
            if(n % (n - zero) == 0){
               System.out.print(n - zero + " ");
               zero += 1;
               nextLine += 1;
            }
            else{
               zero += 1;
            }
         }
         zero = 0;
         System.out.println();

         // 8. Loop This loop prints out 1/k where k is the integers from n to 1. (Two decimal places)
         while(n - zero < 100 && zero < n){
            decimal = Math.round(1.0 / (n - zero)*100)/100.0;
            System.out.print(decimal + " ");
            zero += 1;
         }
         zero = 0;
         System.out.println("");
      }
      System.out.println( "End.");
   }
}

