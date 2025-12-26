package com.ajaysoft.array;

public class Identity {
	public static void main(String[] args) {
		int a[][] = {{1 ,0 ,0} ,{5 ,1,0} ,{0 ,0 ,1}};
		boolean isvalid = true;
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j && a[i][j] !=0) {
					isvalid = false;
					System.out.println("not identity matrix");
				}
				if(i==j && a[i][j] !=1) {
					isvalid =false;
					System.out.println("not identity matirx");
				}
			}
		}
		
		if(isvalid==true) {
			System.out.println("is validd identirty");
		}else {
			System.out.println("not identity matrix");
		}
	}

}
