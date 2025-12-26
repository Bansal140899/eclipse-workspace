package com.ajaysoft.DSA;

import java.util.ArrayList;
import java.util.Scanner;

class fib{
	static ArrayList<Integer> fib(int num) {
		
		int f1=0 ,f2=1 ,f3;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(f1);a1.add(f2);
		
		System.out.println(f1 + " "+f2);
		for(int i=1; i<=num-2; i++) {
			
			f3 = f1+f2;
			a1.add(f3);
			f1=f2;
			f2=f3;
			
		}
		return a1;
		
	}
}

public class fiboonachi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		System.out.println(fib.fib(number));
	}

}
