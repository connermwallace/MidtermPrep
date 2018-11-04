/*
   Write a method printStripped that takes a String as an argument and that prints
   a complete line of output with any comments stripped from the String. Comments
   are defined to be characters enclosed in the characters "<" and ">". More precisely,
   text is "normal" until you encounter a "<" character. From that point on the text is
   considered a comment until you encounter a ">" character, at which point you return
   to normal text. This definition allows for "<" inside a comment and ">" outside a 
   comment. You may assume that there are no unclosed comments in the String.
*/

public class PrintStripped { 
   public static void main(String[] args) {
      printStripped("this is plain text");
      printStripped("this has a normal comment <right here> to be removed");
      printStripped("this has multiple less-than in a comment <<<<<see?>");
      printStripped("this > has <comment>greater-than outside a comment >>");
      printStripped("<hi>this has <foo> multiple <bar> comments<baz><>.");
   }
   
   public static void printStripped(String text) {
      String result = "";
      boolean inComment = false;
      for (int i = 0; i < text.length(); i++) {
         if( inComment && text.charAt(i) == '>') {
            inComment = false;
         } else if (!inComment && text.charAt(i) == '<') {
            inComment = true;
         } else if (!inComment) {
            result += text.charAt(i);
         }
      }
      System.out.println(result);
   }       
}
      
      