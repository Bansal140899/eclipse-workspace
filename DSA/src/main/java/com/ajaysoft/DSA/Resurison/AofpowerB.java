package com.ajaysoft.DSA.Resurison;

import java.util.Scanner;

class Demo1{
	
	static int power(int a , int b) {
		if(b==0) {
			return 1;
		}else {
			
			return a*power(a,b-1);
		}
	}
}

public class AofpowerB {
	
public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		int  a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		
		System.out.println(Demo1.power(a ,b));
	}

}
