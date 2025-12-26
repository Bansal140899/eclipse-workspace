package com.ajaysoft.a;
//rotated the given array 
public class K_rotaion {
	public static void reverse(int nums[] ,int i ,int j){
		while(i<=j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
			
		}
		
	}
	{
		
		
	}
	public static void main(String[] args) {
		int arr[] = {1 ,2 ,3 ,4,5,6 ,7};
		int k = 2;
		
		K_rotaion.reverse(arr, 0 ,arr.length-k-1);
    	K_rotaion.reverse(arr ,arr.length-k-1 ,arr.length-1);
    	K_rotaion.reverse(arr, 0, arr.length-1);
	
	}
	

}
