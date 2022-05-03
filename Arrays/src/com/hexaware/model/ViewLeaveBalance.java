


/////////////////////////////////////////// array: 1/////////////////////
package com.hexaware.model;

public class ViewLeaveBalance {
	private int[][] a= {{22334,22,3,2},
				{31414,12,5,3},
				{31222,33,2,1},
				{25678,8,1,4}};
	public void leaveDetails(int empId) {
		for(int i=0;i<4;i++) {
			if(a[i][0]==empId) {
				System.out.println("Earned Leave\t|Loss of Pay\t|optional holiday");
			
				System.out.println(a[i][1]+"\t\t"+"|"+a[i][2]+"\t\t"+"|"+a[i][3]);
			}
		}
	}
	
	public void updateLeave(int n, int id) {
		for(int i=0;i<4;i++) {
			if(a[i][0]==id) {
				a[i][n]--;
				System.out.println("Leave Approved");
				System.out.println("You have "+a[i][n]+" leaves as balance");
			}
		}
		
	}
		
	

}
