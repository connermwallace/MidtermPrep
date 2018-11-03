import java.util.*; 

public class MidtermReview {

	public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
		boolean result = checkPrime(7);
      System.out.println(result);
      findRange(console);
	}
   
	public static boolean checkPrime(int n) {
		int counter =1;
		System.out.print("factors of " + n + " = 1");
		for( int i =2; i<= n; i++){
			if( n% i ==0) {
				System.out.print(", " + i);
				counter++;
			}
		}
      System.out.println("\nTotal factors of " + n + " = " + (counter));
	   return (counter == 2);
	}
   
   public static void findRange(Scanner console) {
      System.out.print("number (0 to quit) ? ");
      int n = console.nextInt();
      int max = n;
      int min = n;
      while(n!=0) {
         if(n > max) {
            max = n;
         }
         if (n<min) {
            min = n;
         }
         System.out.print("number (0 to quit) ? ");
         n = console.nextInt();
      }
      System.out.println("Range = " + (max - min));
   }      
}
