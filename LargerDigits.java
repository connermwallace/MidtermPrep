/* 
 Write a static method named largerDigits that accepts two integer parameters
 a and b and returns a new integer c where each digit of c gets its value from
 the larger of a's and b's digit in the same place. That is, the ones digit of
 c is the larger of the ones digit of a and the ones digit of b, and the tens
 digit of c is the larger of the tens digit of a and the tens digit of b, and
 so on. You may assume that a and b are positive integers (greater than 0).
*/

public class LargerDigits {
   public static void main(String [] args) {
      System.out.println(largerDigits(90, 38906735));
      System.out.println(largerDigits(56002, 123321));
   }
   public static int largerDigits(int a, int b) {
      int result = 0;
      int mult = 1;
      while (a > 0 && b > 0) {
         int aDig = a % 10;
         int bDig = b % 10;
         if (aDig > bDig) {
            result += mult * aDig;
         } else {
            result += mult * bDig;
         }
         mult *= 10;
         a/=10;
         b/=10;
      }
      return result;
   }
}