package com.ajaysoft.DSA;

import java.util.Scanner;

class sumnumber{
	
	static int sum_natural(int a) {
		int sum=0;
		
		for(int i=0;i<=a; i++) {
			sum=sum+i;
		}
		
		return sum;
		
	}
	
	static int sum_recurision(int a) {
		if(a==0) {
			return 0;
		}else {
			return a+sum_recurision(a-1);
		}
		
		
	}
}

public class sumofnatural {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(sumnumber.sum_recurision(number));
		
		
		System.out.println(sumnumber.sum_natural(number));
	}

}
