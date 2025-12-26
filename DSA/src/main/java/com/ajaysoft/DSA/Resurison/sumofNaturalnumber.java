package com.ajaysoft.DSA.Resurison;

import java.util.Scanner;

class Demoo{
	static int sum(int number) {
		if(number==1) {
			return 1;
		}else {
			return number+sum(number-1);
		}
	}
}

public class sumofNaturalnumber {
   
public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		int  number = sc.nextInt();
		
		
		System.out.println(Demoo.sum(number));
	}
	
}
