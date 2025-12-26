package com.ajaysoft.DSA.Resurison;

import java.util.Map;
import java.util.Scanner;

class Demooo{
	static int fact(int number) {
		
		if(number==1 || number==0) {
			return 1;
		}else {
			return number * fact(number-1);
		}
		
	}
		
	
}

public class factorial {
public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		int  a = sc.nextInt();
//		int b = sc.nextInt();
		
		

		
		System.out.println(Demooo.fact(a));
	}
}
