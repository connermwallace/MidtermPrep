public class IncreasingDigits {
   public static void main(String[] args) {
      System.out.println(increasingDigits(0));
      System.out.println(increasingDigits(18));
      System.out.println(increasingDigits(39));
      System.out.println(increasingDigits(543));
      System.out.println(increasingDigits(37789));
   }
   
   public static boolean increasingDigits(int n) {
      if (n < 10) {
         return true;
      }
      int last = n % 10;
      n /= 10;
      while (n > 0) {   
         int digit = n % 10;
         if (digit >= last) {
            return false;
         }
         n /= 10;
         last = digit;
      }
      return true;
   }
}
      