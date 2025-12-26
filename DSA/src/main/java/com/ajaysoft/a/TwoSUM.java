package com.ajaysoft.a;


//fine the double in the Array whose sum is equal to given value x .[two sum ]
public class TwoSUM {
	public static int sum(int i ,int j) {
		i = i+j;
		return i;
	}
	public static int[] arr(int arr[]) {
		for(int i =0; i<arr.length; i++) {
			arr[i] = arr[i]+2;
		}
		return arr;
	}
	public static void main(String[] args) {
		int i =9;
		int j = 10;
		int arr[] = {1 ,2 ,3 ,4,5,6};
		
		//pass  by value is the
		TwoSUM.sum(5, 6);
		
		System.out.println(i);
		System.out.println(j);
		
		// call  by refernece  
		
		
		for(int k = 0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		
		System.out.println(TwoSUM.arr(arr));
		for(int k = 0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		
	}

}
