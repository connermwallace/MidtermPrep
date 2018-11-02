public class IsConsecutive {
   public static void main(String[] args) {
      System.out.println(twoConsecutive(1, 2, 12));
      System.out.println(twoConsecutive(1, 12, 2));
      System.out.println(twoConsecutive(2, 4, 6));   
      System.out.println(twoConsecutive(8, 8, 8));
   }
   
   public static boolean twoConsecutive(int a, int b, int c) {
      return (Math.abs(a-b)==1 || Math.abs(b-c)==1 || Math.abs(a-c)==1);
   }
}