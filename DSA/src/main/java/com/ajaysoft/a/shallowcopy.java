package com.ajaysoft.a;

public class shallowcopy {
	public static void main(String[] args) {
		int arr[]  = {1 ,2 ,3 ,4, 5, 6};
		int sum = 10;
		
		for(int i =0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length; j++ ) {
				if(arr[i]+arr[j] == 10) {
					System.out.println("first is "+arr[i] +" second elemetn " +arr[j]);
				}
			}
		}
	}

}
