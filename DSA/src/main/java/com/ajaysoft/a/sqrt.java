package com.ajaysoft.a;

public class sqrt {
	public static void main(String[] args) {
		int number = 65;
		
		int i =1;
		int j = 65;
		int ans=0;
		
		while(i<=j) {
			int mid  = (i+j)/2;
			if(i*i == mid) {
				System.out.println(i);
				break;
			}else if(i*i <mid) {
		         ans = i-1;
				j=mid-1;
				
				
			}else {
		        
				i=mid+1;
				
			}
			i++;
			
		}
		
		
		
		
		
		
	
//		for(int k =1; k<j/2; k++) {
//			if(k*k>number) {
//				System.out.println(i-1);
//				
//			}
		

		System.out.println(ans);
	}

}
