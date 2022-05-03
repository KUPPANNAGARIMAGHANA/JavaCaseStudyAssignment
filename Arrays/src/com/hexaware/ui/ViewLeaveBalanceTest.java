

/////////////////////////////////////////// array: 1/////////////////////

package com.hexaware.ui;

import java.util.Scanner;

import com.hexaware.model.ViewLeaveBalance;

public class ViewLeaveBalanceTest {

	public static void main(String[] args) {
		ViewLeaveBalance v=new ViewLeaveBalance();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter employee Id:\n");
		int n=s.nextInt();
		s.close();
		v.leaveDetails(n);
	}

}
