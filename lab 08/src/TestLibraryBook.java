import java.util.Scanner;
import lab08.*;
/**
 * __This is library program___ 
 * @author __onuralp avci___
 * @version _27.11.2019__
 */ 
public class TestLibraryBook
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      LibraryBook book1 = new LibraryBook();
      LibraryBook book2 = new LibraryBook();
      LibraryBook book3 = new LibraryBook(); //This book3 will have the same properties with book2

      // constants

      // variables
      String dueDate;
      int bookNumber;

      // program code
      System.out.println( "Start...");
      
      
      //Creating a new Book 1 manually
      book1.writeTitle("Dirilis Canakkale");
      book1.writeAuthor("Turgut Ozakman");
      book1.writeDueDate("11.10.2019");
      book1.writeTimesLoanded(5);
      LibraryBook book1copy = book1;
      
      //Creating a new Book 2 manually
      book2.writeTitle("Su Cilgin Turkler");
      book2.writeAuthor("Turgut Ozakman");
      book2.writeDueDate("05.02.2019");
      book2.writeTimesLoanded(2);

      //Creating a new Book 3  with same properties with Book 2 manually
      book3.writeTitle("Su Cilgin Turkler");
      book3.writeAuthor("Turgut Ozakman");
      book3.writeDueDate("05.02.2019");
      book3.writeTimesLoanded(2);


      //Showing each condition with booleans
      System.out.println(book1 == book1copy);
      System.out.println(book1.equals(book1copy));
      System.out.println(book1 == book2);
      System.out.println(book1.equals(book2));
      System.out.println(book2 == book3);
      System.out.println(book2.equals(book3));
      System.out.println(book2.hasSameTitle(book3));
      System.out.println(book2.hasSameAuthor(book3));

      System.out.println("End");
   }

}