

/////////////////////////////////////////// BankApplication: 1/////////////////////
package com.hexaware.model;


public class CurrentAccount {
	protected float balance=24000;
	protected String customerName="John", accNumber="100010010023";
	public float getBalance() {
		return balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccNumber() {
		return accNumber;
	}
	
}
