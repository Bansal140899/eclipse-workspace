package com.ajaysoft.DSA.Resurison;

import java.util.Scanner;

class dddd{
	static int c=0;
	static int countofdigit(int num ) {
		
		if(num!=0) {
		    c++;
		    countofdigit(num/10);
		}
		return c;
	}
}

public class countnumberofdigit {
public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
	System.out.println("enter a value:");
	int  a = sc.nextInt();
	System.out.println(dddd.countofdigit(a));
}
}
