public class BigNum{

   //properties
   public static int SIZE = 20;
   public static int BASE = 16;
   int[] x = new int[SIZE];;
   String valueString;
   String baseNumber;
   String sumBase;
   int sum;
   
   //constructors
   //makes the base number and the array x zero
   public boolean zero(){
      baseNumber = "";
      for( int loop = 0; loop < SIZE; loop++){
         baseNumber = baseNumber + "0";
      }

      for( int loop = 0; loop < SIZE; loop++){
         x[loop] = 0;
      }
      return true;
   }

   //first empties the BigNum then makes the array x and baseNumber
   public boolean create(String number){
      zero();
      baseNumber = number;
      for( int loop = 0; loop < number.length(); loop++){
         if( Character.getNumericValue( number.charAt( number.length()-loop-1)) > 9){
            x[loop] = Character.getNumericValue( number.charAt( number.length()-loop-1)) + 55;
         }
         else{
            x[loop] = Character.getNumericValue( number.charAt( number.length()-loop-1));
         }
      }

      return true;
   }

   //copies the properties of b2 into the properties of this bigNum
   public boolean copy( BigNum b2){
      for( int loop = 0; loop < SIZE; loop++){
         x[loop] = b2.x[loop];
      }
      baseNumber = b2.baseNumber;
      return true;
   }

   //
   //methods
   //to string method which turns the elements of x into a string
   public String toString(){
      valueString = "";
      for( int loop = 0; loop < SIZE; loop++){
         if( x[ loop] < 10){
            valueString = valueString + String.valueOf( x[ loop]);
         }
         else{
            valueString = valueString + String.valueOf( (char)( x[loop] ) );
         }
      }
      return valueString;
   }

   //checks if the two bignum is equal to each other by using x
   public boolean equals(BigNum other){
      if( x == other.x)
         return true;
      else
         return false;
   }

   //checks if the bignum is zero DÜZELT****
   public boolean isZero(){
      if( Integer.valueOf(baseNumber) == 0){
         return true;
      }
      else{
         return false;
      }
   }

   //shifts the number upward or downward
   public void shift( boolean left){
      if( left){
         for( int loop = SIZE - 1; loop > 0; loop--){
            x[loop] = x[loop - 1];
         }
         x[0] = 0;
      }
      else{
         for( int loop = 0; loop < (SIZE - 1); loop++){
            x[loop] = x[loop + 1];
         }
         x[SIZE - 1] = 0;
      }
   }

   //adds the values of two big num and return overflow
   public int add( BigNum other){
      sum = Integer.valueOf( Integer.toString( Integer.parseInt(baseNumber, BASE), 10) ) 
            + Integer.valueOf( Integer.toString( Integer.parseInt(other.baseNumber, BASE), 10));

      sumBase = Integer.toString( Integer.parseInt(String.valueOf( sum), 10), BASE);

      if( sumBase.length() > SIZE){
         String sumBaseNew;
         sumBaseNew = "";
         for( int loop = 0; loop < sumBase.length() - 1; loop++){
            sumBaseNew = sumBaseNew + sumBase.charAt( loop + 1);
         }
         create(sumBaseNew);
         return Integer.valueOf( sumBase.charAt(0) + "");
      }
      else{
         create( sumBase);
         return 0;
      }
   }

   //returns true if one is smaller than the other
   public boolean isLessThan( BigNum other){
      boolean result;
      result = true;
      for( int loop = SIZE; loop > 0; loop--){
         if( x[SIZE - 1] > other.x[SIZE - 1]){
            result = false;
         }
      }
      return result;
      
   }
   
}