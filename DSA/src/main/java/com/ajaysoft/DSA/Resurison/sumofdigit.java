package com.ajaysoft.DSA.Resurison;
import java.util.*;

class ddd{
	static int rev(int a, int len) {
		if(a==0)
			return 0;
	else
		return (int) (((a%10)*Math.pow(10 ,len-1))+rev(a/10 ,--len));
		
	}
}

public class sumofdigit {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter a value:");
		int  a = sc.nextInt();
		System.out.println(ddd.rev(a, 4));
		
		
		
	}

}
