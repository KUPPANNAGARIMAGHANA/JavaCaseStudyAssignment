
/////////////////////////////////////////// array: 3/////////////////////




package com.hexaware.ui;

import com.hexaware.model.ATM;

public class ATMArrayOfObject {

	public static void main(String[] args) {
		ATM[] a=new ATM[4];
		a[0]=new ATM(311,"Finger Vein",5);
		a[1]=new ATM(321,"Magneprint",15);
		a[2]=new ATM(411,"magstripe",10);
		a[3]=new ATM(231,"Frontend",12);
		System.out.println("\tprojId\tproject Name\tno.of people");
		for(ATM i:a) {
			System.out.println("\t"+i);
		}
		
	}

}
