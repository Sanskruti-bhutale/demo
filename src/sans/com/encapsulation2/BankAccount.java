package sans.com.encapsulation2;

public class BankAccount {
	private int accountNumber;
	private double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double deposit) {
		if(deposit<0) {
			System.err.println("negative balance can't update please deposit correct price");
			System.exit(0);
		}
		return balance+deposit;
		
	
	}
	public double withdraw(double withdraw) {
		if(balance<withdraw) {
		System.err.println("balance is low enter less amount to withdraw");
		System.exit(0);
		}
		return balance-withdraw;
	}
	

}
