/* 
   Write a static method called acronym that takes as a parameter a string containing a phrase and that returns
   a string that has the acronym for the phrase. For example, the following call:
   acronym("self contained underwater breathing apparatus")
   should return "SCUBA". The acronym is formed by combining the capitalized first letters of each word in the
   phrase. Words in the phrase will be separated by one or more spaces. There might be extra spaces at the beginning
   or end of the phrase. The string passed as a parameter will not contain any characters other than spaces and
   letters, and is guaranteed to contain at least one word. Below are several sample calls.

*/
public class Acronym2 {
   public static void main(String[] args) {
      System.out.println(acronym("   automatic   teller   machine  "));       
      System.out.println(acronym("personal identification number"));          
      System.out.println(acronym("computer science"));                       
      System.out.println(acronym("merry go round"));                          
      System.out.println(acronym("  All   my   Children  "));                 
      System.out.println(acronym(" grand   old   party  "));                 
      System.out.println(acronym("  loner  "));     
   }
   
   public static String acronym(String w) {
      String result = "";
      boolean inWord = false;
      
      for (int i = 0; i < w.length(); i++) {
         if (inWord && w.charAt(i) == ' ') {
            inWord = false;
         } else if (!(inWord) && w.charAt(i) != ' ') {
            result += w.charAt(i);
            inWord = true;
         }
      }
      return result.toUpperCase();
   }
}
         
                               