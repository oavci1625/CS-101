import java.util.ArrayList;
import java.util.Scanner;

// header comment
public class Library
{
   // properties
   ArrayList<LibraryBook> bookList = new ArrayList<LibraryBook>() ;

   // constructors
   public int nullMaker(){ //MAKES EVERY PROPERTY NULL
      for( int loop = bookList.size(); loop > 0; loop--){
         bookList.remove(loop-1);
      }
      return 0;
   }
   //methods
   public boolean isEmpty(){ //RETURNS TRUE IF THE LIBRARY IS EMPTY
      if(bookList.size() == 0){
         return true;
      }
      else{
         return false;
      }
   }

   public String toString(){ //TO STRING METHOD
      if(bookList.size() == 0){
         return "The library is EMPTY" + "\n\r";
      }
      else{
         return bookList.toString();
      }
   }

   public boolean add(String title , String author){ //ADDS A NEW BOOK TO THE LIBRARY IF THERE IS A NULL OBJECT
      LibraryBook book;
      book = new LibraryBook();
      book.writeTitle(title);
      book.writeAuthor(author);
      bookList.add(book);
      return true;
   }

   public boolean remove( String bookTitle){ //REMOVES THE BOOK FROM THE LIBRARY
      for( int loop = 0; loop < bookList.size(); loop++){
         if( bookList.get(loop).title.equals( bookTitle)){
            bookList.remove(loop);
         }
      }
      return true;
   }

   public LibraryBook findByTitle( String bookTitle){ //RETURNS THE BOOK OBJECT IF IT IS INCLUDED IN THE LIBRARY
      int number = -1;
      if( bookList.size() > 0){
         for( int loop = 0; loop < bookList.size(); loop++){
            if( bookList.get(loop).getTitle().equals(bookTitle)){
               number = loop;
            }
         }
      }
      
      if( number == -1){
         return null;
      }
      else{
         return bookList.get(number);
      }
   }
}