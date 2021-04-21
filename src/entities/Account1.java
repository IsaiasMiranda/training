package entities;

public class Account1 {

	private int accountNumber;
	private String name;
	private double balance;

	public Account1(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public Account1(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double value) {
		this.balance -= (value + 5);
	}
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public String toString() {
		return "Account: " + getAccountNumber()
				+ ", Holder: " + getName()
				+ ", Balance: $: " + String.format("%.2f", getBalance());
	}

}
