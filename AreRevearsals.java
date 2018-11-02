/*
 Write a static method named areReversals that accepts two strings and
 returns true if the strings are reversals of each other, i.e. if one
 word is equal to the other word spelled backwards. Case does not matter.
*/

public class AreRevearsals {

	public static void main(String[] args) {
		System.out.println(areRevearsals("HELLO", "olleh"));
	}
	
	public static boolean areRevearsals(String a, String b) {
      a = a.toLowerCase();
      b = b.toLowerCase();
      if (a.length() != b.length()) {
         return false;
      }
      for (int i = 0; i < a.length(); i++) {
         if (a.charAt(i) != b.charAt(b.length() - i - 1)) {
            return false;
         }
      }
	return true;   
	}
}
