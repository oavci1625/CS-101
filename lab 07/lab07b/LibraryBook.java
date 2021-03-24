import java.util.Scanner;

// header comment
public class LibraryBook
{
   // properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoanded;


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

   public String toString() {
      String result = "Title: " + title + "\n\rAuthor: " + author + "\n\rDue date: " + dueDate + "\n\rTimes loanded: "
            + timesLoanded;
      return result;
   }

   // methods
   public String loan(String writeDueDate) {
      dueDate = writeDueDate;
      timesLoanded ++;
      return dueDate;
   }

   public String leave() {
      dueDate = "";
      return dueDate;
   }

   public  int getTimesLoaned() {
      return timesLoanded;
   }

   public  boolean onLoan() {
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