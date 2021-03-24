import java.util.Scanner;

/*
Program description: LAB05A
Name: Onuralp Avcı
Date: 5.11.2019
*/

public class Lab05a{
   public static void main(String[] args){
      
      //constants
      final String star = "*";

      //variables
      int width;
      int height;
      int thickness;
      int btwHeight;
      int btwWidth;
      double sideWidth;
      double sideHeight;
      char answer;
      Scanner scan = new Scanner(System.in);

      //for( String answer = "Y"; answer == "Y" || answer == "y" ; answer = scan.next())

      //program code
      do{
         System.out.println("Please enter width:");
         width = scan.nextInt();
         System.out.println("Please enter height:");
         height = scan.nextInt();
         System.out.println("Please enter thickness:");
         thickness = scan.nextInt();


         //defining side height
         if((2 * thickness) > height){
            sideHeight = height / 2.0;
         }
         else{
            sideHeight = thickness;
         }

         //negative value check
         if (width <= 0 | height <= 0 | thickness <= 0){
            System.out.println("Error: all values must be positive!");
         }
         else{
            //loop for top of the rectangle
            for ( double sideHeightLoop = sideHeight; sideHeightLoop > 0; sideHeightLoop += (-1)){
               for ( int widthLoop = width; widthLoop > 0; widthLoop += (-1)){
                  System.out.print(star);
               }
               System.out.println("");
            }
            //

            //defining between height and width
            btwHeight = height - (2*thickness);
            btwWidth = width - (2 * thickness);

            //defining side width
            if((2 * thickness) > width){
               sideWidth = width / 2.0;
            }
            else{
               sideWidth = thickness;
            }

            //loop for printing the window part
            for ( int btwHeightLoop = btwHeight; btwHeightLoop > 0; btwHeightLoop += (-1)){
               for ( double sideWidthLoop = sideWidth; sideWidthLoop > 0; sideWidthLoop += (-1)){
                  System.out.print(star);
               }
               for ( int btwWidthLoop = btwWidth; btwWidthLoop > 0; btwWidthLoop += (-1)){
                  System.out.print(" ");
               }
               for ( double sideWidthLoop = sideWidth - 0.6; sideWidthLoop > 0; sideWidthLoop += (-1)){
                  System.out.print(star);
               }
               System.out.println("");
               
            }

            //loop for printing bottom part of the rectange
            for ( double sideHeightLoop = sideHeight - 0.6; sideHeightLoop > 0; sideHeightLoop += (-1)){
               for ( int widthLoop = width; widthLoop > 0; widthLoop += (-1)){
                  System.out.print(star);
               }
               System.out.println("");
            }

            // end of else statement
         }

         if((2 * thickness) >= height || (2 * thickness) >= width){
            System.out.println("Oops... no hole!");
         }  
         System.out.println("Do you want to try again?");
         answer = scan.next().charAt(0);

         // end of do statement
      } while(answer == 'Y' || answer == 'y');
      System.out.println("Goodbye.");

      //end of main method
   }
   
   //end of class
}