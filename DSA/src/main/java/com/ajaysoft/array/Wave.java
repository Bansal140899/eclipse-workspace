package com.ajaysoft.array;

import java.util.Arrays;

public class Wave {
	public static void main(String[] args) {
		int a[] = {2,4,5,1,6};
		int length= a.length;
		int temp;
		
		Arrays.sort(a);
		System.out.print(a[0]+" ");
		for(int i=1;i<length-1;i=i+2) {
			temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
			System.out.print(a[i]+" "+a[i+1]+" ");
		}
			System.out.println(a[length-1]);
		
		
	}

}
