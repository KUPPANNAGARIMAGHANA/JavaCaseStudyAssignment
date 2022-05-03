
/////////////////////////////////////////// array: 2/////////////////////

package com.hexaware.ui;

import com.hexaware.model.ArrayFetchDataModel;

public class ArrayFetchData {

	public static void main(String[] args) {
		//ArrayFetchDataModel f=new ArrayFetchDataModel();
		ArrayFetchDataModel[] a=new ArrayFetchDataModel[4];
		a[0]=new ArrayFetchDataModel("Java SE 5",2004,"Static-import");
		a[1]=new ArrayFetchDataModel("Java SE 5",2006,"JVM-improved");
		a[2]=new ArrayFetchDataModel("Java SE 5",2011,"Try-Resource");
		a[3]=new ArrayFetchDataModel("Java SE 5",2014,"Lambda");
		
		
		for(ArrayFetchDataModel i:a)
			System.out.println(i);
	}

}
