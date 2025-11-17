package sans.com.encapsulation2;
import java.util.Scanner;

public class BankAcount_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your account number::");
		int accountNum=Integer.parseInt(sc.nextLine());
		
		
	 BankAccount HDFC=new BankAccount();
	 
	 HDFC.setAccountNumber(accountNum);
	 System.out.println("Account number is :: "+HDFC.getAccountNumber());
	 
	 HDFC.setBalance(20000);
	 
	System.out.println( "Your Account balance is :: "+ HDFC.getBalance());
	
	System.out.print("Enter how much money you want to deposit");
	double deposit=Double.parseDouble(sc.nextLine());

	System.out.println("After deposit the balance :: "+	HDFC.deposit(deposit));
	
	System.out.print("Enter how much money you want to withdraw ::");
	double withdraw=Double.parseDouble(sc.nextLine());
	
	System.out.println("After withdraw the balance is :: "+HDFC.withdraw(withdraw));
	 

	}

}
