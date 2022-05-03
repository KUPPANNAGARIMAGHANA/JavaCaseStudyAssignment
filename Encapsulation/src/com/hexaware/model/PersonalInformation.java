package com.hexaware.model;

public class PersonalInformation {
	private String address,bankAccNo,passPort;

	public PersonalInformation() {
		//default constructor
	}
	public PersonalInformation(String address, String bankacc, String passPort2) {
		this.address=address;
		this.bankAccNo = bankacc;
		this.passPort=passPort2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankAccNo() {
		return bankAccNo;
	}

	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}

	public String getPassPort() {
		return passPort;
	}

	public void setPassPort(String passPort) {
		this.passPort = passPort;
	}
	

}
