import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;

/**
 * __html page creator___ 
 * @onuralp avcý___
 * @23.10.2019__
 */ 
public class Lab03c
{
   public static void main( String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner( System.in);
      PrintStream originalStdOut = System.out;

      // constants
      final String DOCTYPEHTML = "<!DOCTYPE html>";
      final String HTML = "<html>";
      final String HEAD = "<head>";
      final String TITLE = "<title>";
      final String STITLE = "</title>";
      final String SHEAD = "</head>";
      final String BODY = "<body>";
      final String HR = "<hr>";
      final String HL = "<h1>";
      final String SHL = "</h1>";
      final String P = "<p>";
      final String SP = "</p>";
      final String SBODY = "</body>";
      final String SHTML = "</html>";
      final double tax5 = 0.05;
      final double tax15 = 0.15;
      final double tax25 = 0.25;
      
      // variables
      String name;
      int age;
      double grosssalary;
      double netsalary;
      String comments;
      double taxrate;
      
      
      //program codes 
      
      /*System.out.println( "Enter your name: ");*/
      name = scan.nextLine();
      /*System.out.println( "Enter your age: ");*/
      age = scan.nextInt();
      /*System.out.println( "Enter your salary: ");*/
      grosssalary = scan.nextDouble();
      /*System.out.println( "Enter comment: ");*/
      scan.nextLine();
      comments = scan.nextLine();
      
      System.setOut( new PrintStream( "magic.htm" ) );
      
      if (grosssalary < 0 || grosssalary > 10000 || age < 0){
         System.out.println("This input is not valid.");
      }
      else{
      
      if(grosssalary < 1000){
         netsalary = (grosssalary - 100) - (grosssalary - 100)*tax5;
         taxrate = tax5 * 100;
      }
      else if (grosssalary >= 1000 && grosssalary <= 5000){
         netsalary = (grosssalary - 100) - (grosssalary-100)*tax15;
         taxrate = tax15 * 100;
      }
      else{
         netsalary = (grosssalary - 100) - (grosssalary-100)*tax25;
         taxrate = tax25 * 100;
      }
      
      
      System.out.println(DOCTYPEHTML);
      System.out.println( "");
      System.out.println( HTML);
      System.out.println( "");
      System.out.println( HEAD);
      System.out.println( TITLE+name+"'s Home Page"+STITLE);
      System.out.println( SHEAD);
      System.out.println( "");
      System.out.println( BODY);
      System.out.println( "");
      System.out.println( HR);

      if (Files.exists(Paths.get(name + ".jpg"))){
         System.out.println("<img src=\"" + name + ".jpg\">");
      }
      
      System.out.println( HL+name+SHL);
      System.out.println( P + "Age:" + age + SP);
      System.out.println( P + "Salary: " + netsalary + "(" + taxrate + "% tax rate)" + SP);
      System.out.println( P + "Comments: " + comments + SP);
      System.out.println( HR);
      System.out.println( "");
      System.out.println( SBODY);
      System.out.println( "");
      System.out.println(SHTML);
      }
      System.out.close();
      System.setOut( originalStdOut);
      System.out.println( "Webpage created.");
   }

}