import java.util.Scanner;

/**
 * __test of big num___ 
 * @author __onuralp avcı___
 * @version __18.12.2019__
 */ 
public class Lab10a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      BigNum b1 = new BigNum();
      BigNum b2 = new BigNum();
      BigNum b3 = new BigNum();
      
      boolean yes = true;
      boolean no = false;
      
      // program code
      System.out.println( "Start...");

      b1.zero();
      b2.create("C7D3377");
      b1.create("CDBE09D9");
      b3.copy(b2);
      
      //test
      System.out.println(b1.isLessThan(b2));
      System.out.println((char)66);
      System.out.println( Character.getNumericValue('1') );
      System.out.println(Integer.toString( Integer.parseInt("B0", 16), 10) );

      //prints all
      System.out.println( b1);
      System.out.println( b2);
      System.out.println( b3);

      //adds b3 to b2
      b2.add(b3);
      System.out.println( b2);
      
      //shifts upward
      b2.shift(yes);
      System.out.println( b2);
      
      //shifts downward
      b2.shift(no);
      System.out.println( b2);
      
      System.out.println( "End.");
   }

}