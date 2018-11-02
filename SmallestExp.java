/* 
   Write a method called smallestExponent that takes an int parameter base
   and an int parameter target. Your method should return the smallest whole
   number exponent exp such that base raised to the power exp is greater than
   or equal to target.
    
*/
public class SmallestExp {
   public static void main(String[] args) {
      System.out.println(smallestExponent(2,1));
      System.out.println(smallestExponent(2, 2));
      System.out.println(smallestExponent(2, 9));
      System.out.println(smallestExponent(3, 10));
   }
   
   public static int smallestExponent(int base, int target) {
      int counter = 0;
      int base2 = 1;
      while ( base2 < target) {
         base2*= base;
         counter++;
      }
      return counter;
   }
}
       