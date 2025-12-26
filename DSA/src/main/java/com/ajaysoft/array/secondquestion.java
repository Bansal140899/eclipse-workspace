package com.ajaysoft.array;

import java.util.Arrays;

public class secondquestion {
	public static void main(String[] args) {
		int a[] = {4,1,5,3,6,2};
		int low =0, length =a.length ,high = length-1;
        int temp;
        Arrays.sort(a);
        
        while(low<high) {
        	System.out.println(a[low]);
        	System.out.println(a[high]);
        	low++;
        	high--;
        }

	 for(int i=0;i<length;i++) {
		 System.out.println(a[i]);
	 }
	
	}
	
	
	

}
