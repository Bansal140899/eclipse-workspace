package com.ajaysoft.DSA;

import java.util.ArrayList;
import java.util.Scanner;

class trib{
	static ArrayList<Integer> tribb(int num){
		int f1=0,f2=1,f3=2,f4;
		
		ArrayList<Integer> a1=new ArrayList();
		
		a1.add(f1);a1.add(f2);a1.add(f3);
		
		for(int i=1; i<=num-3;i++) {
			f4 = f1+f2+f3;
			a1.add(f4);
			f1=f2;
			f2=f3;
			f3=f4;
			
			
		}
		
		return a1;
	}
}

public class tribonacchi {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number= sc.nextInt();
System.out.println(trib.tribb(number));
		
	}

}
