// This file contains some sample methods that are similar to questions that might be
// asked on the midterm exam.
import java.util.*;

public class MidtermPractice {
   public static void main(String[] args) {
      System.out.println(containsSeven(123456));
      System.out.println(containsSeven(1234567));
      System.out.println(containsSeven(7));
      System.out.println(containsSeven(8675309));
      System.out.println(containsSeven(24680));
      System.out.println();
      
      System.out.println(sumDigits(123456));
      System.out.println(sumDigits(1234567));
      System.out.println(sumDigits(7));
      System.out.println(sumDigits(8675309));
      System.out.println(sumDigits(24680));
      System.out.println();
      
      rollSeven();
      System.out.println();
      rollSeven();
      System.out.println();
      rollSeven();
      System.out.println();
      System.out.println();
      
      System.out.println(doubleLetters("abcde"));
      System.out.println(doubleLetters("Mississippi"));
      System.out.println(doubleLetters("abracadabra"));
      System.out.println();      
   }
   
   
   // Write a static method called containsSeven that takes a single integer parameter
   // and returns a true if the value passed contains a 7 as one of its digits, and false
   // otherwise. You may assume the value passed is non-negative. You may not use Strings
   // to solve this problem.
   public static boolean containsSeven(int num) {
      while (num != 0) {
         int digit = num % 10;
         if (digit == 7) {
            return true;
         }
         num = num / 10;
      }
      return false;
   }
   
   // Write a static method called digitSum that takes an integer n as a parameter and 
   // returns the sum of the digits of n. You may assume n is non-negative.
   public static int sumDigits(int num) {
      int total = 0;
      while (num != 0) {
         int digit = num % 10;
         total += digit;
         num = num / 10;
      }
      return total;
   }

   // Write a static method called rollSeven that simulates the rolling of two dice until
   // their sum is equal to 7.  The method should print each roll and its sum and print 
   // the number of rolls it took to get to 7. Consider this sample execution:
   //     Roll #1: 3 + 5 = 8
   //     Roll #2: 2 + 1 = 3
   //     Roll #3: 1 + 4 = 5
   //     Roll #4: 3 + 4 = 7
   //     Found 7 in 4 rolls.
   // You must exactly reproduce the format of this sample execution.   
   public static void rollSeven() {
      Random rand = new Random();
      
      int total = 0;
      int count = 0;
      while (total != 7) {
         int roll1 = rand.nextInt(6) + 1;
         int roll2 = rand.nextInt(6) + 1;
         total = roll1 + roll2;
         count++;
         
         System.out.println("Roll #" + count + ": " + roll1 + " + " + roll2 + " = " + total);
      }
      System.out.println("Found 7 in " + count + " rolls.");
   }
   
   // Write a static method called doubleLetters that takes a String as a parameter and 
   // returns a new String where each letter of the original string has been replaced with
   // two of that letter.  For example, doubleLetters("hello") should return "hheelllloo".   
   public static String doubleLetters(String str) {
      String result = "";
      for (int i = 0; i < str.length(); i++) {
         // result = result + str.substring(i, i + 1) + str.substring(i, i + 1);
         result = result + str.charAt(i) + str.charAt(i);
      }
      return result;
   }
}