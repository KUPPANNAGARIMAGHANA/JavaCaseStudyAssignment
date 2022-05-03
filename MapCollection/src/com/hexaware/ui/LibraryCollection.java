

///////////////////////////////////////////map collection/////////////////////


package com.hexaware.ui;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class LibraryCollection {

	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<>();
		h.put("Java", 2);
		h.put("Servlet", 1);
		h.put("JSF", 2);
		System.out.println("Availability of books:");
		for(Entry<String,Integer> i:h.entrySet()){
			System.out.println(i.getKey()+" "+i.getValue());
		}
		Scanner s=new Scanner(System.in);
		String book;
		System.out.println(" Enter Book Name:");
		book=s.next();
		s.close();
		boolean f=false;
		for(String i:h.keySet()) {
			if(i.equalsIgnoreCase(book)) {
				System.out.println("Book Issued");
				f=true;
			}
		}
		if(!f)
			System.out.println("No Stock");
		System.out.println(".........................");
		HashMap<String,Integer>hm=new HashMap<>();
		hm.put("Hibernate",500);
		hm.put("Spring",300);
		hm.put("Struts",600);
		hm.put("AngularJS",800);
		int sum=2200;
		System.out.println("Amount to be paid to the vendor:"+sum);
		System.out.println(".......................");
		System.out.println("Books, whose price is greater than 500 are:");
		for(Entry<String,Integer> i:hm.entrySet()) {
			if(i.getValue()>500) {
				System.out.println(i.getKey());
			}
				
		}
	}
}
