package com.ajaysoft.DSA;

import java.util.Scanner;

class prime{
	static String primeornot(int a) {
		int fact=0;
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				
				fact++;
				
			}
		}
		
		return (fact==2)?"PRime":"not prime";
		
	}
	static boolean primerec(int a , int i) {
	
		if(i==1) {
			return true;
		}else if(a%i==0) {
			return false;
			
		}else {
			return primerec( a,--i);
		}
		
	}
}

public class primeornot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(prime.primeornot(number));
		System.out.println(prime.primerec(number, number/2));
	}

}
