

/////////////////////////////////////////// polymorphism overloading: 1/////////////////////
package com.hexaware.ui;

import java.util.Scanner;
import com.hexaware.model.*;

public class LibexSearch{

	public static void main(String[] args) {
		LiBex l=new LiBex();
		Scanner s=new Scanner(System.in);
		int c,t;
		String title,a,e;
		System.out.println("Would you like to select a book or 2?");
		t=s.nextInt();
		while(t>0) {
			System.out.println("Search by \n 1.Title\n 2.Title and author\n 3.Title, pulisher and Edition\n 4.Enter 4 to stop search");
			c=s.nextInt();
			if(c==1) {
				System.out.println("Enter Title: (\"algorithms\", \"os\")");
				title=s.next();
				l.book(title);
			}
			else if(c==2) {
				System.out.println("Enter Title (\"algorithms\", \"os\") and Author:(\"levitin\", \"tannenbaum\")");
				title=s.next();
				a=s.next();
				l.book(title,a);
			}
			else if(c==3) {
				System.out.println("Enter Title(\"algorithms\", \"os\"), author (\"levitin\", \"tannenbaum\") and edition(\"2009\",\"1989\")");
				title=s.next();
				a=s.next();
				e=s.next();
				l.book(title,a,e);
			}
			else{
				System.out.println("Thank you");
				
			}
			t--;	
		}
		s.close();

	}
}


