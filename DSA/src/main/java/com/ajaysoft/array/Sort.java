package com.ajaysoft.array;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int a[] = {3 ,5,1,6,3,7,32};
		int length = a.length;
		int temp;
		
		for(int i=0; i<length;i++) {
			System.out.println("hello arrya before sorting "+a[i]);
		}
		Arrays.sort(a);
		
		for(int i=0; i<length;i++) {
			for(int j=i+1; j<length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
		System.out.println("after sorting:    ");
		for(int i=0; i<length;i++) {
			System.out.println("after sorting "+a[i]);
		}
		
	System.out.println(Arrays.binarySearch(a, 5));	
		
	}

}
