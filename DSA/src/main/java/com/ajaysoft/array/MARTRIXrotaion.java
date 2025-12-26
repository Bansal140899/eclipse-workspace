package com.ajaysoft.array;

public class MARTRIXrotaion {
	public static void main(String[] args) {
		int matrix[][] = {{1 ,2,3} ,{4 ,5,6} ,{7 ,8,9}};
		int n=  matrix.length-1;
		
		int crr[][] = new int[3][3];
		
		for(int i =0; i<=n;i++) {
			for(int j =0; j<=n;j++) {
				crr[i][j] = matrix[n-j][i];
			}
		}
		
		for(int i =0; i<=n;i++) {
			for(int j =0; j<=n;j++) {
				System.out.print(" " + matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("after rotaton of 90 degree of matrix");
		
		for(int i =0; i<=n;i++) {
			for(int j =0; j<=n;j++) {
				System.out.print(" " + crr[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
