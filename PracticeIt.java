import java.util.*;

public class PracticeIt { 
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      balanceCheckbook(scan);
   }
   public static boolean balanceCheckbook(Scanner scan) {
      boolean overdrawn = false;
      System.out.print("initial balance? ");
      double balance = scan.nextDouble();
      double minimum = balance;
      System.out.print("how may transactions? ");
      int transactions = scan.nextInt();
      for (int i=1;i<=transactions;i++) {
         System.out.print(i +"/" + transactions + " amount? ");
         double amount = scan.nextDouble();
         balance += amount;
         System.out.println("new balance = " + balance);
         if (amount<minimum) {
            minimum = amount;
         }
         if(balance<0) {
            overdrawn = true;
         }
            
      }
      System.out.println("minimum balance = $" + minimum);
      return overdrawn;
   }
}