package com.ajaysoft.a;

public class reverseARRAY {
   public static void main(String[] args) {
	int arr[] = {1 ,2,3,4,5,6,7};
	int size = arr.length-1;
	
	for(int i = 0; i<size/2; i++) {
		int temp = arr[i];
		arr[i] = arr[size-i];
		arr[size-i] = temp;
	}
	
	for(int i = 0;i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	
	
}
}
