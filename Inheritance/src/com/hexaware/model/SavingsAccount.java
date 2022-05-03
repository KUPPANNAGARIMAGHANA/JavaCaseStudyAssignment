


/////////////////////////////////////////// BankApplication: 1/////////////////////
package com.hexaware.model;

public class SavingsAccount extends CurrentAccount{
	private double minBalance=2500;
	private double time=0.25;
	private int interestRate=5;
	private double sI=(getBalance()*interestRate*time)/100;

	
	public double getMinBalance() {
		return minBalance;
	}
	public double getsI() {
		return sI;
	}
}
