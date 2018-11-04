/*
   Write a method named swapDigitPairs that accepts a positive integer n as a parameter
   and returns a new integer whose value is similar to n's but with each pair of digits
   swapped in order. For example, the call of swapDigitPairs(482596) would return 845269.
   Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8. If the number
   contains an odd number of digits, leave the leftmost digit in its original place. For example,
   the call of swapDigitPairs(1234567) would return 1325476. You should solve this problem
   without using a String.
*/
public class swapDigitPairs {
   public static void main(String[] args) {
      System.out.println(swapDigitPairs(1234567));
      System.out.println(swapDigitPairs(482596));
      System.out.println(swapDigitPairs(10));

   }
   public static int swapDigitPairs(int n) {
      int result = 0;
      int mult = 1;
      
      while (n >= 10) {
         int digA = n % 10;
         int digB = n / 10 % 10;
         result += digB * mult;
         result += digA * mult * 10;
         mult *= 100;
         n /= 100;
      }
   return result + n * mult;
   }
}
      