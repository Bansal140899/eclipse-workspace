package com.ajaysoft.a;

public class sortting {
	public static void buvlesort(int arr[]) {
		int length =  arr.length-1;
		
		for(int i =0; i<length; i++) {
			for(int j =0; j<length-i; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		for(int num :arr) {
			System.out.println(num);
		}
	}
	
	public static void selectionsort(int arr[]) {
		for(int i =0; i<arr.length-1; i++) {
			int min = Integer.MAX_VALUE;
			
			for(int j =0; j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					min = Math.min(min, arr[j]);
				}
			}
			arr[i] = min;
		}
		for(int num :arr) {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		//bubule sorting algrothim
		
		int arr[] = {1 ,7,5,3,22,5,7,9,0,10 ,5,6,7};
		
	   buvlesort(arr);
	   
	   selectionsort(arr);
	}

}
