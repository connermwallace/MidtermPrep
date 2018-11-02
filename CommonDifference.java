public class CommonDifference {
   public static void main(String[] args) {
      System.out.println(commonDifference(1,3,5)); 
   }
   
   public static int commonDifference(int a, int b, int c) {
      int max = Math.max(a,Math.max(b,c));
      int smallest = Math.min(a,Math.min(b,c));
      int second = a + b + c - max - smallest;
      int cd = Math.abs(max-second);
      if (max-second != second-smallest) {
         return -1;
      }
      else {
         return cd;
      }
   }
}
