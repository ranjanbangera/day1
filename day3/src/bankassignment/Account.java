package bankassignment;

public class Account {

	private long accNum;
	private double balance;
	final double minbal = 500;

	Person accHolder;

	Account() {}

	public Account(long accNum, double balance,Person accHolder) {

		this.accNum = accNum;
		this.balance = balance;
		this.accHolder=accHolder;
	}

	void deposit(double d)
	{		
		balance += d;
		System.out.println("Deposited 2000 INR to smith's account. :  "+balance);

	}
	void withdraw(double amount)
	{
		if(balance - amount>minbal){
			balance-=amount;
			System.out.println("Withdrawn 2000 INR from Kathy's account :  "+balance);
			
		}
		else{
			System.out.println("Ammount cannot be withdrawn due to minimum balance issue");
		}
	}
	double getBalance()
	{
		return balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
