/*
 Write a static method named minOfThree that accepts three integers as parameters.
 The method should return the position of the smallest integer. For example, the 
 call minOfThree(10, 7, 6); should return 3 because the third integer is the smallest.
 Notice that parameters are numbered starting at 1.
*/

public class MinOfThree {
   public static void main(String [] args) {
   
      System.out.println(minOfThree(4,3,-1));
      
   }
   
   public static int minOfThree(int a, int b, int c) {
      if (a == b || b == c || a == c){
         return -1;
      } 
      int smallest = Math.min(a, Math.min(b, c));
      if (smallest == a) {
         return 1;
      }
      if (smallest == b) {
         return 2;
      }
      return 3;
   }
}
      
      