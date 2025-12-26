package com.ajaysoft.DSA.Resurison.String;
import java.util.Scanner;
class Demo{
	static String rev(String s) {
		if(s== null || s.length()<=1) {
			return s;
		}else {
			 return rev(s.substring(1))+s.charAt(0);
		}
		
	}
}





public class reverse {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter a value:");
		String  a = sc.nextLine();
		
		System.out.println(Demo.rev(a));
		
	}

}
