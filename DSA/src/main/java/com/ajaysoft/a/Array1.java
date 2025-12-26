package com.ajaysoft.a;

public class Array1 {

	// GIVEN an Array OF marks of students ,if the marks of any student less then 35 print its roll number.[roll number here refers to the indext of the array.?
	
	
	public static void main(String[] args) {
		int marks[] = {100 ,200 ,34,300 ,400 ,500};
		
		for(int i =0; i<marks.length;i++) {
			
			if(marks[i]<35) {
				System.out.println("the roll number of the student :"+i);;
			}
		}
	}
	
	
}
