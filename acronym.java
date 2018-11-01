public class acronym {

	public static void main(String[] args) {
		System.out.println(acronym("self contained underwater breathing apparatus"));
	}
	
	public static String acronym(String w) {
		boolean firstLetter = false;
		String result = "";
      if(w.charAt(0) != ' ')
         result += w.charAt(0);
		for (int i = 1; i < w.length(); i++) {
			firstLetter = w.charAt(i) != ' ' && w.charAt(i-1) == ' ';
			if ((firstLetter)) {
				result += w.charAt(i);
			}
		}
   return result.toUpperCase();

	}
}
			