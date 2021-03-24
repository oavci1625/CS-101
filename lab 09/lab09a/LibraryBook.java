import java.util.Scanner;

// header comment
public class LibraryBook
{
   // properties
   String title;
   String author;
   String dueDate;
   int timesLoanded;

   
   // constructors  
   public String writeTitle(String writeTitle) {
      title = writeTitle;
      return writeTitle;
   }
   public String writeAuthor(String writeAuthor) {
      author = writeAuthor;
      return writeAuthor;
   }
   public String writeDueDate(String writeDueDate) {
      dueDate = writeDueDate;
      return writeDueDate;
   }
   public int writeTimesLoanded(int writeTimesLoanded) {
      timesLoanded = writeTimesLoanded;
      return writeTimesLoanded;
   }

   //methods
   public String toString() { //TO STRING METHOD
      String result = "TITLE: " + title + " --- AUTHOR: " + author + " --- DUE DATE: " + dueDate + " --- TIMES LOANDED: "
            + timesLoanded  + "\n\r";
      return result;
   }
   public boolean equals( LibraryBook book) { //EQUALS METHOD WHICH RETURNS TRUE IF THE TITLE AND THE AUTHORS ARE THE SAME
      if( book.title == title && book.author == author){
         return true;
      }
      else{
         return false;
      }
   }
   public boolean hasSameTitle( LibraryBook book) { //RETURNS TRUE IF BOTH BOOKS HAVE SAME TITLE
      if( book.title == title){
         return true;
      }
      else{
         return false;
      }
   }
   public boolean hasSameAuthor( LibraryBook book) { //RETURNS TRUE IF BOTH BOOK HAVE SAME AUTHOR
      if( book.author == author){
         return true;
      }
      else{
         return false;
      }
   }
   public String loan(String writeDueDate) { //LOAN METHOD
      dueDate = writeDueDate;
      timesLoanded ++;
      return dueDate;
   }
   public String leave() { //RETURN METHOD
      dueDate = "";
      return dueDate;
   }
   public  int getTimesLoaned() { //SHOWS THE NUMBER OF TIMES THE BOOK IS LOANDED
      return timesLoanded;
   }
   public  boolean onLoan() { //RETURNS TRUE IF IT IS LOANDED
      if( dueDate != ""){
         return true;
      }
      else{
         return false;
      }
   }
   
   //GET METHODS
   public String getTitle() {
      return title;
   }  
   public String getAuthor() {
      return author;
   }   
   public String getDueDate() {
      return dueDate;
   }   
   public int getTimesLoanded() {
      return timesLoanded;
   }
}