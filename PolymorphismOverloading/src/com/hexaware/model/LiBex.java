


/////////////////////////////////////////// polymorphism overloading: 1/////////////////////

package com.hexaware.model;
public class LiBex {
	private static String[] searchBook= new String[] {"algorithms", "os"};
	private static String[] authors=new String[] {"levitin", "tannenbaum"};
	private static String[] editions=new String[] {"2009","1989"};
	boolean f=false;
	public void book(String TitleName) {
		for(int i=0;i<2;i++){
			if(TitleName.equals(searchBook[i])){
					System.out.println("Found titled book");
					f=true;
					break;
				}
			else
				f=false;
		}
		if(f==false)
			System.out.println("No stock");
	}
	public void book(String TitleName,String author) {
		for(int i=0;i<2||i<2;i++) {
			if(TitleName.equals(searchBook[i])&&author.equals(authors[i])){
					System.out.println("Found book "+searchBook[i]);
					f=true;
					break;
				}
			
			else
				f=false;
		}
		if(f==false)
			System.out.println("No stock");
	}
	
	public void book(String TitleName,String author,String edition ) {
		for(int i=0;i<2||i<2||i<2;i++){
			if(TitleName.equals(searchBook[i])&&author.equals(authors[i])&&edition.equals(editions[i])){
					System.out.println("Found "+searchBook[i]+" by "+authors[i]);
					break;
				}
			else
					f=false;
		}
		if(f==false)
			System.out.println("No stock");
		
	}
}



