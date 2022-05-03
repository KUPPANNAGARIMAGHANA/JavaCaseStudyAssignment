


/////////////////////////////////////////// String XShopping/////////////////////
package com.hexaware.model;

public class Xshopping {
	private static final String existingUser="UN:Hexaware";
	private static final String pswd="password123";
	
	public static boolean validate(String name,String pwd) {
		if(name.equals(existingUser)&&pwd.equals(pswd))
			return true;
		return false;
	}
	public static void productsList() {
		System.out.println("Groceries\nDresses\nFast Food\nAccesories\nDaily use");
		
	}
}
