package org.lu.ics.labbar;

import java.util.ArrayList;

public class Person {

	private String pNbr;
	private String name;
	private ArrayList<BankAccount> accounts;
	
	public Person(String pNbr, String name){
		this.pNbr = pNbr;
		this.name =name;
		accounts = new ArrayList<BankAccount>();
		
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public void setpNbr(String newNbr) {
		pNbr = newNbr;
	}
	public String getName() {
		return name;
	}
	public String getpNbr() {
		return pNbr;
	}
	public void addAccount(BankAccount acc) {
		accounts.add(acc);
	}
	
	
	public BankAccount getAccount(String nbr){
		for(BankAccount temp : accounts) {
			if(temp.getNbr().equals(nbr)) {
				return temp;
			}
				
		}
		return null;
	}
	public String getAllAccounts(){
		String combined = "Kontonummer: ";
		for(BankAccount temp : accounts) {
			combined +="\n" + temp.getNbr();
			combined += "\n" + " Saldo: " + temp.getBalance();
		}
		return combined;
	}
	
	
	
}
