package com.hexaware.model;

public class Bank {
	public int bankAccount(int bal,int debit)
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
	public int creditAmount(int bal,int credit)
	{
		bal=bal+credit;
		System.out.println("balance:"+bal);
		return bal;
	}

}
