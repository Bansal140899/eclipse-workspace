package com.ajaysoft.a;

public class Day2 {
	public static void main(String[] args) {
		int arr[] = {1 ,2,3,-1,3,10, 15,-20};
		int arr1[] = new int[arr.length];
		int arr2[][] = {{0,2} ,{1,4} ,{4,6} };
		int prefix = arr[0];
		int ans[] = new int[arr2.length];
		arr1[0] = arr[0];
		
		
		for(int i= 1; i<arr.length; i++) {
			prefix+=arr[i];
			arr1[i] = prefix;
			
			
		}
		
		for(int i = 0; i<arr2.length;i++) {
			int  left = arr2[i][0];
			int right = arr2[i][1];
			
			ans[i] = arr[left]-arr[right-1];
			
		}
		for(int i = 0; i<=ans.length; i++) {
			System.out.println(ans[i]);
		}
		
	}

}
