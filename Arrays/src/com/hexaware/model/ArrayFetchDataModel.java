

/////////////////////////////////////////// array: 2/////////////////////
package com.hexaware.model;

public class ArrayFetchDataModel {
	 private String r;
	 private int d;
	private  String h;
	public ArrayFetchDataModel(String r,int d,String h) {
		this.r=r;
		this.d=d;
		this.h=h;
	}
	public ArrayFetchDataModel() {
		/* Default constructor*/
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s",r,d,h);
	}
}
