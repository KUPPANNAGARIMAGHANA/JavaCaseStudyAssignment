/////////////////////////////////////////// Encapsulation: 2/////////////////////
package com.hexaware.ui;

import com.hexaware.model.Employee;
import java.util.Scanner;

public class EncapsulationApp {

	public static void main(String[] args) {

			String n,p,m,a,b,pp;
			int id;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter Name: ");
			n=s.nextLine();
			System.out.print("\n");
			System.out.print("Enter Phone number: ");
			p=s.nextLine();
			System.out.print("\n");
			System.out.print("Enter Official Email Id: ");
			m=s.nextLine();
			System.out.print("\n");
			System.out.print("Enter Employee Id: ");
			id=s.nextInt();
			System.out.print("\n");
			System.out.print("Enter Address: ");
			a=s.next();
			System.out.print("\n");
			System.out.print("Enter Bank Account Number: ");
			b=s.next();
			System.out.print("\n");
			System.out.print("Enter Passport Number: ");
			pp=s.next();
			System.out.print("\n");
			s.close();
			Employee e =new Employee();
			e.seteName(n);
			e.seteId(id);
			e.setePhone(p);
			e.seteMail(m);
			e.setBankAccNo(b);
			e.setPassPort(pp);
			e.setAddress(a);


			System.out.println(e);
		}
	

}

