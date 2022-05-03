
/////////////////////////////////////////// Encapsulation: 1/////////////////////
package com.hexaware.model;

public class Employee extends PersonalInformation{
	private String eName,ePhone,eMail;
	private int eId;
	public Employee(String nam,int id,String num,String mail,String address, String bankacc, String passport)
	{
		super(address,bankacc,passport);
		eName=nam;
		eId=id;
		ePhone=num;
		eMail=mail;
		
	}
	public Employee() {
		// default constructor 
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getePhone() {
		return ePhone;
	}
	public void setePhone(String ePhone) {
		this.ePhone = ePhone;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	@Override
	public String toString() {
		return "Employee Details:\nID:" + eId+"\n"+ "Name:" + eName+"\n" + "Contact:" + ePhone+"\n" + "Mail:" + eMail+"\n" 
				+ "Address:" + getAddress()+"\n" + "Bank Account number:" + getBankAccNo()+"\n" + "Passport Number:"
				+ getPassPort();
	}
	
	
}
