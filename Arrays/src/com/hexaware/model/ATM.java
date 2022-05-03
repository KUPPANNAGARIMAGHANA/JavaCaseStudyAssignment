

/////////////////////////////////////////// array: 3/////////////////////

package com.hexaware.model;

public class ATM {
	private String projName;
	private int projId,numberOfPeople;
	public ATM(int projId,String projName, int numberOfPeople) {
		this.projId=projId;
		this.projName=projName;
		this.numberOfPeople=numberOfPeople;
	}
	public ATM() {
		/*default constructor*/
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s",projId,projName,numberOfPeople);
	}

}
