package com.ajaysoft.a;

public class Solution {
	public static void main(String[] args) {
		int nums []= {2 ,0,2,1,1,0};
		int n = nums.length-1;
		
		int zero = 0;
		int one =0;
		
		for(int i = 0; i<=n;i++) {
			if(nums[i]==0) {
			  zero++;
			}
			if(nums[i]==1) {
				one++;
			}
		}
		
		for(int i =0; i<=n;i++) {
			if(i<zero) {
				nums[i]=0;
			}else if(i<zero+one) {
				nums[i] = 1;
			}else {
				nums[i] = 2;
			}
		}
		
		for(int i=0;i<=n;i++) {
			System.out.println(nums[i]);
		}
		
	}

}
