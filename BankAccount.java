package org.lu.ics.labbar;

public class BankAccount {

	private double balance;
	private String nbr;
	private Person person;
	
	public BankAccount(double balance, String nbr, Person person) {
		this.balance = balance;
		this.nbr = nbr;
		this.person = person;
	}
	public BankAccount() {
		
	}
	
	public void credit(double amount) {
		if (amount > 0 )
		balance += amount;	
		else
			System.out.println("Måste vara större än 0");
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance)
		balance -= amount;
		else
			System.out.println("måste vara större än 0");
		
	}
	
	public double getBalance() {
		return balance;
	}
	public String getNbr() {
		return nbr;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setNbr(String nbr) {
		this.nbr = nbr;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	public Person getPerson(Person person) {
		return person;
	}
		
}
