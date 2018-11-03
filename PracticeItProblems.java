public class PracticeItProblems {
   public static void main(String[] args) {
      System.out.print(weave(2384,12));
      System.out.println();
      printStripped("<hi>this has <foo> multiple <bar> comments<baz><>.");  
      System.out.println();
      System.out.print(digitRange(1));
      System.out.println( undouble("oops"));
      System.out.println(countParitySwitches(800));
      System.out.println(hashTag("  fuNNY    #@*^!&  sYMbols  "));
      System.out.println(undouble("mississipppppppppppppi"));
      printSquare(1,5);
      System.out.println(filter(56665565, 6));
      System.out.println(countWords("  T'was brillig, and the *$&*#$   toves     "));        
      System.out.println(assertions(151));        

   }
      
   public static int weave(int a, int b) {
      int result = 0;
      int mult = 1;
      while ( a>0 || b>0) {
         result += (b%10)*mult;
         result += (a%10)*mult*10;
         a/=10;
         b/=10;
         mult*=100;
      }
      return result;
   }
   
   public static int countWords(String w) {
      boolean inWord = false;
      int counter = 0;
      for(int i = 0; i< w.length();i++) {
         if (inWord && w.charAt(i) == ' ') {
            inWord = false;
         }
         else if (!inWord && w.charAt(i) != ' ') {
            counter ++;
            inWord = true;
         }
      }
      return counter;
   }
   
           
            
   
   public static void printStripped(String text) {
      String result = "";
      int first = text.indexOf("<");
      while (text.indexOf("<") != -1 ) {
         int last = text.indexOf(">", first + 1);
         text = text.substring(0,first) + text.substring(last+1,text.length());
         first = text.indexOf("<");
         
         
      }
      System.out.print(text);
   }
   
   public static int digitRange(int value) {
      int max = value % 10;
      int min = value % 10;
      
      while(value!=0) {
         int digit = value%10;
         max = Math.max(max,digit);
         min = Math.min(min,digit);
         value/=10; 
      }        
      return max - min;   
   }
   
   public static String undoubsdle(String word) {
      char last = word.charAt(0);
      String result = "";
      for (int i = 0; i < word.length(); i++) {
         char temp = word.charAt(i);
         if (last!=temp) {
            result += word.charAt(i);
         }
         last = temp;
      }
      return result;
   }
   
   public static int countParitySwitches(int num) {
      boolean last = (num % 10) %  2 == 0;
      num/=10;
      int counter = 0;
      while (num != 0) {
         boolean digit = (num % 10) %  2 == 0;
         if ( digit !=last ){
            counter++;
         }
         last = digit;
         num /=10;
      }
      return counter;
   }
   
   public static String hashTag(String words) {
      String result = "#";
      char last = words.charAt(0);
      for (int i = 0; i < words.length(); i++){
         if ((last == ' ' && words.charAt(i) != ' ')||i==0 && words.charAt(i) != ' ') {
            String temp = words.substring(i, i+1);
            result += temp.toUpperCase();
         }
         else if (words.charAt(i) != ' ') {
            result += words.charAt(i);
         }
         last = words.charAt(i);
      }
   return result;
   }
   public static String undouble(String w) {
      String result = "";
      char last = 'A';
      for(int i = 0; i <w.length();i++) {
         char current = w.charAt(i);
         if(current != last) {
            result += w.charAt(i);
         }
         last = current;
      }
      return result;
   }
   
   public static void printSquare(int min, int max) {
      for(int i =0; i<max-min+1;i++) {
         for(int j=min + i; j<=max; j++){
            System.out.print(j);
         }
         for(int j =0; j<i; j++) {
            System.out.print(min+j);
         }
         System.out.println();
      }
   }
   
   public static int filter(int num, int d) {
      int mult = 1;
      int result = 0;
      while (num>0){
         int digit = num%10;
         if(digit!=d){
            result +=digit*mult;
            mult*=10;
         }
      num/=10;
      }
      return result;
   }
   // Finds largest prime factor of n
   public static int assertions(int n) {
      int x = 2;
      // Point A
      while (x < n) {
      	// Point B
      	if (n % x == 0) {
      		n = n / x;
      		x = 2;
      		// Point C
      	} else {
      		x++;
      		  // Point D
      	}
      }
      // Point E
      return n;
   }
}





            
            
         
         
      
   
     
            

         