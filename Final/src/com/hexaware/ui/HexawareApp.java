package com.hexaware.ui;

import com.hexaware.model.Hexaware;

public class HexawareApp {

	public static void main(String[] args) {
		Hexaware h=new Hexaware();
		System.out.println("Company Name:"+h.getCompanyName()+"\nHead quartered in "+h.getCompanyHQ()+"\nFoundation year:"+h.getYear());

	}
}
