
///////////////////////////////////////////collection list/////////////////////


package com.hexaware.ui;
import java.util.Scanner;
import java.util.LinkedList;
public class CollectionList {

	public static void main(String[] args) {
		int n,i,j;
		LinkedList<String> l=new LinkedList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter count of Item list:");
		n=s.nextInt();
		System.out.println("Enter items:");
		for(i=0;i<n;i++)
			l.add(s.next());
		
		System.out.println("Items in the list:");
		for(j=0;j<l.size();j++)
			System.out.println(l.get(j));
		s.close();
		
	}

}
