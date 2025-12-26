package com.ajaysoft.DSA.Resurison.String;

import java.util.Scanner;

class D{
	static boolean sewS(String s ,int i ,int j) {
		if(i>j)
			return true;
		
		if(s.charAt(i)=='(' && s.charAt(j)==')' || s.charAt(i)=='{' && s.charAt(j)=='}' || s.charAt(i)=='[' && s.charAt(j)==']')
			return sewS(s ,i+1 ,j-1);
		else
			return false;
		
	}
	
}


public class paarenthis {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter ANY sTRING");
		String s = obj.nextLine();
		System.out.println(D.sewS(s ,0 ,s.length()-1));
	}

}
