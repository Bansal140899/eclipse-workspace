package com.ajaysoft.array;

public class MatrixROWandColumnSwap {
	public static void main(String[] args) {
		int a[][] = {{1 ,2 ,3} ,{4 ,5,6} ,{7,8 ,9}};
		int m=1,n=2;
		
		for(int i=0; i<a.length;i++) {
			for(int j= 0;j<a.length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("hello swap the row and column ");
		
		
		for(int k =0;k<a.length; k++) {
//			 int t = a[m-1][k];
//			 a[m-1][k] = a[n-1][k];
//			 a[n-1][k] = t;
			 
			 int t = a[k][m-1];
			 a[k][m-1] = a[k][n-1];
			 a[k][n-1] = t;
			 
		}
		
		for(int i=0; i<a.length;i++) {
			for(int j= 0;j<a.length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
