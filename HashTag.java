/*
   Write a static method called hashTag that takes a String as a parameter and returns
   the String converted to a hashtag. A hashtag is a pound sign (#) followed by a phrase,
   where each word is capitalized. Words in the original string are separated by one or
   more spaces. For example, the call hashTag("I love computer science") would return
   "#ILoveComputerScience"
*/

public class HashTag { 
   public static void main(String[] args) {
      System.out.println(hashTag("  fuNNY    #@*^!&  sYMbols  "));
      System.out.println(hashTag("    sPooOOOooOoOky"));
      System.out.println(hashTag("I love computer science"));
      System.out.println(hashTag(""));
   }
   
   public static String hashTag(String s) {
      String result = "#";
      boolean inWord = false;
      
      for (int i = 0; i < s.length(); i++) {
         if (!(inWord) && s.charAt(i) != ' ') {
            inWord = true;
            result += Character.toUpperCase(s.charAt(i));
         } else if (inWord && s.charAt(i) == ' ') {
            inWord = false;
         } else if (inWord) {
            result += Character.toLowerCase(s.charAt(i));
         }
      }
      return result;
   }
}
         
         
      