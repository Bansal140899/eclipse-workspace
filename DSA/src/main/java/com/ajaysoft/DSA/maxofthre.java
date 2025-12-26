package com.ajaysoft.DSA;

import java.util.Scanner;

class max{
	static int max_three(int a ,int b ,int c) {
		
		
		
		
		
		return (a>b && a>c)?a:((b>c)?b:c);
		
		
	}
	static int max_function(int a, int b,int c) {
		return (Math.max(Math.max(a, b) ,c));
	}
	
	
}

public class maxofthre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(max.max_function(a, b, c));
		System.out.println(max.max_three(a, b, c));
		
		
	}

}
