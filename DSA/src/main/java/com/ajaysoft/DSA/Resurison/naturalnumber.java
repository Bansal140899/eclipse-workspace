package com.ajaysoft.DSA.Resurison;

import java.util.Scanner;

class Demo{
	static void prnt(int number) {

		if(number >= 1) {
			
			prnt(number-1);
			System.out.println(number+" ");
			
		}
			
		
		
		
	}
}

public class naturalnumber {
	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		int  number = sc.nextInt();
		
		Demo.prnt(number);
		
	}

}
