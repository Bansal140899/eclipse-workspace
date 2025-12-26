package com.ajaysoft.DSA.Resurison;

import java.util.Scanner;

class d{
	static int product(int a,int b) {
//		if(a<b) 
//			return product(b,a);
//		else
			if(b!=0) 
			return a+product(a,b-1);
		else
			return 0;
		
		
		
	}
}

public class prodectofaofb {
public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter a value:");
		int  a = sc.nextInt();
		System.out.println("enter b value: ");
		int b = sc.nextInt();
		
		
		
		
		
		
		System.out.println(d.product(a ,b));
	}

}
