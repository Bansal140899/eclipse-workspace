package com.ajaysoft.array;

public class StringArray {
	public static void main(String[] args) {
		int a[][] = {{1,2,3} ,{4,5,6} ,{7,8,9} };
		
		
//		for(int i=0; i<a.length;i++) {
//			int sum=0;
//			for(int j=0;j<a.length;j++) {
//				sum = sum+a[j][i];
//				
//			}
//			System.out.println("the sum is column wise is "+sum);
//		
//			
//		}
		int  b[][] = new int[3][3];
		
		for(int i=0; i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				System.out.print(" "+a[i][j]);
				
			
				
			}
			System.out.println();
		
			
		}
		
		for(int i=0; i<a.length;i++) {
		
			for(int j=0;j<a.length;j++) {
				b[i][j] = a[j][i]; 
				
			}
			
		
			
		}
		
for(int i=0; i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				System.out.print(" "+b[i][j]);
				
			
				
			}
			System.out.println();
		
			
		}
		
	}

}
