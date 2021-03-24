package lab08;
import java.util.Scanner;

// header comment
public class Library
{
   // properties
   LibraryBook b1;
   LibraryBook b2;
   LibraryBook b3;
   LibraryBook b4;


   // constructors
   public int nullMaker(){ //MAKES EVERY PROPERTY NULL
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
      return 0;
   }
   //methods
   public boolean isEmpty(){ //RETURNS TRUE IF THE LIBRARY IS EMPTY
      if( b1 == null && b2 == null && b3 == null && b4 == null ){
         return true;
      }
      else{
         return false;
      }
   }

   public String toString(){ //TO STRING METHOD
      if( b1 == null && b2 == null && b3 == null && b4 == null ){
         return "The library is EMPTY" + "\n\r";
      }
      else{
         return "" + b1 + "\n\r" + b2 + "\n\r" + b3 + "\n\r" + b4 + "\n\r";
      }
   }

   public boolean add(String title , String author){ //ADDS A NEW BOOK TO THE LIBRARY IF THERE IS A NULL OBJECT
      if( b1 == null){
         b1 = new LibraryBook();
         b1.writeTitle(title);
         b1.writeAuthor(author);
         return true;
      }
      else if( b2 == null){
         b2 = new LibraryBook();
         b2.writeTitle(title);
         b2.writeAuthor(author);
         return true;
      }
      else if( b3 == null){
         b3 = new LibraryBook();
         b3.writeTitle(title);
         b3.writeAuthor(author);
         return true;
      }
      else if( b4 == null){
         b4 = new LibraryBook();
         b4.writeTitle(title);
         b4.writeAuthor(author);
         return true;
      }
      else{
         return false;
      }
   }

   public boolean remove( String book){ //REMOVES THE BOOK FROM THE LIBRARY
      if (book.equals(b1.title)){
         b1 = null;
         return true;
      }
      else if (book.equals(b2.title)){
         b2 = null;
         return true;
      }
      else if (book.equals(b3.title)){
         b3 = null;
         return true;
      }
      else if (book.equals(b4.title)){
         b4 = null;
         return true;
      }
      else{
         return false;
      }
   }

   public LibraryBook findByTitle( String book){ //RETURNS THE BOOK OBJECT IF IT IS INCLUDED IN THE LIBRARY
      if ( b1 != null && book.equals(b1.title)){
         return b1;
      }
      else if ( b2 != null && book.equals(b2.title)){
         return b2;
      }
      else if ( b3 != null && book.equals(b3.title)){
         return b3;
      }
      else if ( b4 != null && book.equals(b4.title)){
         return b4;
      }
      else{
         return null;
      }
   }
}