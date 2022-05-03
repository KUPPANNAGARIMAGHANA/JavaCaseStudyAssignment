

///////////////////////////////////Class - Variables, Function---1,2 //////////////////////////

package com.hexaware.ui;
import com.hexaware.model.Bank;
import java.util.*;
public class BankOperations {
	
///////////////////////////////////Class - Variables, Function---3  //////////////////////////
	
	public static void main(String[] args) {
		int b,d,t,op,c;
		Scanner s=new Scanner(System.in);
		Bank bank=new Bank();
		System.out.println("Enter number of operations:");
		t=s.nextInt();
		b=10000;
		while(t>0)
		{
			
			System.out.println("Select operation:");
			System.out.println("1:Debit\n2:Credit");
			op=s.nextInt();
			if(op==1)
				{
					System.out.println("enter amount to be debited");
					d=s.nextInt();
					b=bank.bankAccount(b,d);
				}
			else
			{
				System.out.println("enter amount to be credited");
				c=s.nextInt();
				b=bank.creditAmount(b,c);
			}
			System.out.println();
			t=t-1;
		}
		s.close();
	}

}
