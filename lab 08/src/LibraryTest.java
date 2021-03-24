import java.util.Scanner;
import lab08.*;
/**
 * __testing library___ 
 * @author __onuralp avci___
 * @version __04.12.2019__
 */ 
public class LibraryTest
{
   static int choice;
   static Scanner scan = new Scanner( System.in);
   static Library library = new Library();

   public static void menu( String[] args)
   {

      // constants

      // variables

      // program code
      System.out.println( "Welcome to library");
      System.out.println( "1 - SHOW ALL BOOKS");
      System.out.println( "2 - FIND A BOOK");
      System.out.println( "3 - ADD A NEW BOOK");
      System.out.println( "4 - RESET LIBRARY");
      System.out.println( "5 - EXIT");
      System.out.print( "Please enter the number of the thing you want to do:");
      choice = scan.nextInt();
      scan.nextLine();
   }

   public static void action( String[] args)
   {

      // constants

      // variables

      // program code
      System.out.println( "You found the book!");
      System.out.println( "1 - LOAN");
      System.out.println( "2 - RETURN");
      System.out.println( "3 - REMOVE");
      System.out.println( "4 - EXIT TO MAIN MENU");
      System.out.print( "Please enter the number of the thing you want to do:");
      choice = scan.nextInt();
      scan.nextLine();
   }

   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      String title;
      String dueDate;
      String author;

      // program code
      menu(args);
      //SHOW METHOD
      if( choice == 1){
         System.out.println(library.toString());
         main(args);
      }
      //FIND METHOD
      else if( choice == 2){
         title = scan.nextLine();
         if( library.findByTitle(title) != null){
            System.out.println(library.findByTitle(title));
            action(args);
            //Loaning the book
            if( choice == 1){
               System.out.println("Enter the new due date:");
               dueDate = scan.nextLine();
               library.findByTitle(title).loan(dueDate);
               main(args);
            }
            //Returning the book
            else if( choice == 2){
               library.findByTitle(title).leave();
               main(args);
            }
            //Deleting the book from the library
            else if( choice == 3){
               library.remove(title);
               main(args);
            }
            //main menu
            else{
               main(args);
            }
         }
         else{
            System.out.println("");
            System.out.println("We could not find the book please choose again");
            System.out.println("");
            main(args);
         }
      }
      //ADDING A NEW BOOK METHOD
      else if( choice == 3){
         title = scan.nextLine();
         author = scan.nextLine();
         library.add(title, author);
         main(args);
      }
      //RESETING THE LIBRARY METHOD
      else if( choice == 4){
        library.nullMaker();
        main(args);
      }
      //EXIT METHOD
      else{
         System.out.println("Bye Bye...");
      }
   }
}