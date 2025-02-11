package oops;

public class Encapsulation {
	
	//Private Variables(Why Private:- its part of encapsulation to hide data from easy access)
	private String accountHolder;
	private double balance;
	
	//Constructor to initialize values
	/*A constructor is special method automatically calls when we create a object for a class
	 * its name is same as class name*/
	public Encapsulation(String accountHolder, double balance) {
		
		this.accountHolder = accountHolder;
		this.balance = balance;
	/*"this" keyword assigns the received value from constructor method to the class variable
	 * constructor helps to set the private initial values when creating an object*/	
	}
	
	//Getter & Setter Methods
	/*This methods are used to read the private variable values outside the class
	 * we use these methods to safely access the private variables */
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>=0) {
			this.balance = balance;
		}else {
			System.out.println("Balance cannot be negetive");
		}
	}
	public void displayAccountDetails() {
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Available Balance: "+balance);
	}
	
	
	
}






