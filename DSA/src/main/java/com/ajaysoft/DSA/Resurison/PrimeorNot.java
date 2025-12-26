package com.ajaysoft.DSA.Resurison;

import java.util.Scanner;

class da{
	static boolean prime(int number ,int i) {
		if(i == 1) {
			return true;
		}else if(number%i==0){
			return false;
		}else {
			return prime(number ,--i);
		}
		
	}
}

public class PrimeorNot {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter a value:");
		int  a = sc.nextInt();
//		System.out.println("enter b value: ");
//		int b = sc.nextInt();
//		
		
		
		
		
		
		System.out.println(da.prime(a ,a/2));
	}

}
