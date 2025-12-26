package com.ajaysoft.array;

public class Subarray {
	public static void main(String[] args) {
		int a[]  = {1 ,2 ,3};
		
		for(int i=0; i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				System.out.print("[");
				for(int k=i; k<=j;k++) {
					System.out.print(" "+a[k]+" ");
				}
				System.out.print("]");
			}
			
		}
	}

}
