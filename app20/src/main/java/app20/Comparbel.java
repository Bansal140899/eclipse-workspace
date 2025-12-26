package app20;

public class Comparbel {
	public static void main(String[] args) {
		int arr[] = {1  ,2,3,4,5,6,78,9 , 0 ,0};
		
		for(int i =0; i<arr.length; i++) {
			int x = arr[i];
			for(int j =i+1; j<arr.length; j++) {
				if(x>arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
