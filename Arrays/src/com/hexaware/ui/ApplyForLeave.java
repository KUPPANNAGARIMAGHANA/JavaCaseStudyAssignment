package com.hexaware.ui;

import java.util.Scanner;

import com.hexaware.model.ViewLeaveBalance;

public class ApplyForLeave {

	public static void main(String[] args) {
		ViewLeaveBalance v=new ViewLeaveBalance();
		Scanner s=new Scanner(System.in);
		int n,id;
		System.out.println("Enter employee Id:");
		id=s.nextInt();
		System.out.println("Apply for (select 1 or 2):\n1.Earned Leave\n2.Optional Holiday");
		n=s.nextInt();
		s.close();
		if(n==1) {
			v.updateLeave(n,id);
		}
		else
			v.updateLeave(3,id);
	}

}
