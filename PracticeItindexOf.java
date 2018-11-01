public class PracticeItindexOf {
	public static void main(String[] args) {
		System.out.println(indexOf("how are you", "are"));
	}
	public static int indexOf(String a, String b) {
		int test = 0;
      int ticker = 0;
		for (int i = 0; i < a.length(); i++) {
			if ( a.charAt(i) == b.charAt(ticker)) {
				test++;
			} else {
				test=0;
			}
			if ( test == b.length()) {
				return i-test +1;
			}
      ticker++;
      if (ticker>b.length()-1) {
         ticker =0;
      }
		}
   return -1;
	}
}