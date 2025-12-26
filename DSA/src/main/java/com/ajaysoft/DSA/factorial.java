package com.ajaysoft.DSA;

import java.util.Scanner;

class fact{
	static int fact_rec(int num) {
		if(num==0) {
			return 1;
		}else {
			return num*fact_rec(num-1);
		}
	}
	
	static long fact_loop(int  num) {
		
	long f = 1;
	
	for(int i=1; i<=num; i++) {
		f = f*i;
	}
	return f;
	}
	
	
}
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(fact.fact_loop(number));
		System.out.println(fact.fact_rec(number));
	}

}
