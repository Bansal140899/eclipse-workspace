package com.ajaysoft.DSA.Resurison;

import java.util.Scanner;

class ddddd{
	static int com=1;
	static int comm(int a,int b) {
		if(com%a==0 && com%b==0) {
			return com;
			
		}
		com++;
		return comm(a ,b);
	}
}

public class Lcm {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter a value:");
		int  a = sc.nextInt();
		System.out.println("enter b value:");
		int  b = sc.nextInt();
		System.out.println(ddddd.comm(a, b));
	}

}
