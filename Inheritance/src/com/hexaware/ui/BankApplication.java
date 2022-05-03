


/////////////////////////////////////////// BankApplication: 1/////////////////////
package com.hexaware.ui;

import com.hexaware.model.*;
import java.util.Scanner;
public class BankApplication {
	public static float bankAccount(float bal,int debit)
	{
		if((bal-debit)<5000)
			System.out.println("You don't have sufficient balance");
		else
			{
				System.out.println("debited successfully");
				bal=bal-debit;
			}
		System.out.println("balance:"+bal);
		return bal;
	}
	public static float creditAmount(float bal,int credit)
	{
		bal=bal+credit;
		System.out.println("balance:"+bal);
		return bal;
	}

	public static void main(String[] args) {
		int op,d,c;
		boolean t=true;
		SavingsAccount s=new SavingsAccount();
		
		float b=s.getBalance();
			
		Scanner sc=new Scanner(System.in);
		
		while(t){
			System.out.println("Welcome "+s.getCustomerName()+"! your account number:"+s.getAccNumber());
			System.out.println("Select operation:");
			System.out.println("1:Debit\n2:Credit\n3:Find Interest Added:\n4:click '4' to Logout");
			op=sc.nextInt();
			if(op==1) {
				
				System.out.println("enter amount to be debited (Minimum balance should be:"+s.getMinBalance()+")\n");
				d=sc.nextInt();
				b=bankAccount(b,d);
			}
			else if(op==2){
				System.out.println("enter amount to be credited");
				c=sc.nextInt();
				b=creditAmount(b,c);
			}
			else if(op==3){
				System.out.println("Interest added:"+s.getsI());	
			}
			else {
				System.out.println("Logged Out successfully");
				t=false;
			}
		}
		sc.close();
		
	}

}
