

/*...........String XShopping................*/
package com.hexaware.ui;
import java.util.Scanner;

import com.hexaware.model.Xshopping;

public class StringShopping {
	

	public static void main(String[] args) {
		String userName="";
		Scanner s=new Scanner(System.in);
		System.out.println("Select:\n1.guest user\n2.existing user");
		int userType=s.nextInt();
		if(userType==1){
			System.out.println("Enter Username:");
			userName=s.next();
			
				if(userName.length()>=8) {
					System.out.println("Logged In successfully");
					System.out.println("\n...................................\nOur Products");
					Xshopping.productsList();
				}
				else
					System.out.println("Login failed!");
				
			}
		
		else{
			boolean f=false;
			String passWord;
			System.out.println("Enter User Name:");
			userName=s.next();
			System.out.println("Enter Password:");
			passWord=s.next();
			f=Xshopping.validate(userName, passWord);
			if(f){
				System.out.println("Logged In successfully");
				System.out.println("\n...................................\nOur Products");
				Xshopping.productsList();
			}
			else {
				System.out.println("login failed!");
			}
				
		
		}
		s.close();
	}

}
