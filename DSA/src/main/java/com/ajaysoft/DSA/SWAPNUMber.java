
package com.ajaysoft.DSA;

import java.util.Scanner;

public class SWAPNUMber {
	
	public static void swap(int a , int b) {
		System.out.println("before swaping a="+a+"and b="+b);
//		int t;
//		t=a;
//		a=b;
//		b=t;
		
		// this is the second logic
//		int c;
//		c= a+b;
//		a=c-a;
//		b=c-b;
		// tbis is the third logic
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
		// this is the forth logic
		a=a*b;
		b = a/b;
		a=a/b;
		System.out.println("after swaping a="+a+"and b="+b);
	}

	
	 public static void main(String []args) {
		 Scanner obj = new Scanner(System.in);
		 System.out.println("enTER A value");
		 int a = obj.nextInt();
		 System.out.println("enter b value");
		 int b = obj.nextInt();
		 swap(a ,b);
		 
	 }
}
