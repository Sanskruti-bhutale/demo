package sans.com.encapsulation;
//
//public class BankAccount {
//	
//	private double balance;
//	
//	public void setdeposit(double balance) {
//		this.balance=balance;
//	}
//	public double getBalance() {
//		return this.balance;
//	}
//	
//
//	public static void main(String[] args) {
//	BankAccount b=new BankAccount();
//		b.setdeposit(1200);
//		System.out.println(b.getBalance());
//
//	}
//
//}



public class BankAccount {
    
    private double balance;
    
    public BankAccount(double balance) {
    	this.balance=balance;
    	System.out.println("initial balance :"+balance);
    }

    // Method to deposit money (adds to balance)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
    	if(amount>0 && amount<=balance) {
    		balance-=amount;
    		
    	}else {
    		System.out.println("withdrawal amount is too high");
    	}
    			
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(500);
        b.deposit(1200);
        b.deposit(300); // additional deposit
        System.out.println("Current Balance: $" + b.getBalance());
        b.withdraw(500);
        System.out.println("After withdraw Current Balance: $" + b.getBalance());
    }
}
