/*
Write a static method findMatching which takes two strings
as parameters and returns a string of the characters that
are a match in both strings, and '.' otherwise. Characters
are considered a match when equal characters appear at the
exact same location in both strings. Characters in the given
strings which don't match should be represented with a '.' 
character in the resulting string.
*/ 

public class findMatching {

   public static void main(String[] args) {
      System.out.println(findMatching("bunK", "punKed"));
   }
   
   public static String findMatching(String a, String b) {
      String result = "";
      int stop = Math.max(a.length(), b.length());
      
         for (int i = 0; i < stop; i++) {
            if (i >= b.length() || i >= a.length() || a.charAt(i) != b.charAt(i)) {
               result += '.';
            } else if (a.charAt(i) == b.charAt(i)) {
               result += a.charAt(i);
            }
         }
      return result;
   }
}
   
         
      
            
