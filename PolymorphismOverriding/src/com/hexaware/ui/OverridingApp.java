/////////////////////////////////////////// polymorphism overriding: 1/////////////////////
package com.hexaware.ui;
import java.util.Scanner;

import com.hexaware.model.*;

public class OverridingApp {

	public static void main(String[] args) {
		String tDomain,trainerF,developerF,dDomain;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Trainer domain:");
		tDomain=s.next();
		System.out.println("Enter Trainer feedback:");
		trainerF=s.next();
		System.out.println("Enter Developer domain:");
		dDomain=s.next();
		System.out.println("Enter Developer feedback:");
		developerF=s.next();
		s.close();

		Developer d=new Developer();
		d.setDomain(dDomain);
		d.setFeedBack(developerF);
		
		Trainer t=new Trainer();
		t.setDomain(tDomain);
		t.setFeedBack(trainerF);
		
		
		System.out.println(t);
		System.out.println();
		System.out.println(d);
	}

}
