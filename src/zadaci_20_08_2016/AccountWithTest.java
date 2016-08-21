package zadaci_20_08_2016;
/*
	Account
	-------
-id: int
-balance: double
-annualInterestRate: double
-dateCreated: String
------------------------
+Account()
+Account(id: int,balance: double)
+getId(): int
+setId(): void
+getBalance(): double
+setBalance(): void
+getAnnualInterestRate(): double
+setAnnualInterestRate(): void
+getDateCreated(): String
+getMontlyInterestRate(): double
+getMontlyInterest(): double
+withdraw(amount: double): void
+deposit(amount: double): void
*/

public class AccountWithTest {

	public static void main(String[] args) {

		// creates Account instance
		Account acc = new Account();
		// sets Account details
		acc.setId(1122);
		acc.setBalance(20000);
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println("Id of account is: " + acc.getId() + ", curent balance on acc: " + acc.getBalance()
				+ ", montly interest: " + acc.getMontlyInterest() + " of the account that was created: "
				+ acc.getDateCreated());

	}
}

class Account {

	// data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	java.util.Date date = new java.util.Date();
	String dateCreated = date.toString();

	// non argument constructor
	Account() {
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	// we get monthly interest rate by dividing annual rate with 12
	public double getMontlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMontlyInterest() {
		return (balance * (annualInterestRate / 12)) / 100;
	}

	// if we withdraw money we decrease balance by entered amount
	public void withdraw(double amount) {
		balance -= amount;
	}

	// if we deposit money we decrease balance by entered amount
	public void deposit(double amount) {
		balance += amount;
	}
}
