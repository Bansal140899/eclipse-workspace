package com.ajaysoft.DSA;

public class swapbybitwise {
	public static void main(String[] args) {
		int a = -10;
		int b = 20;
//		 b = b^a;
//		 
//		
//		System.out.println(a);
//		a=b^a;
//		System.out.println(b);
//		b=b^a;
//		System.out.println(a);
		
		System.out.println(a +"or"+b);
		a = a+b-(b=a);
		System.out.println(a+"or"+b);
		
		
	}

}
