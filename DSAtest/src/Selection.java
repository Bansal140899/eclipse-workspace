
public class Selection {
	public static void main(String[] args) {
		int num[] = {3 ,4 ,5 ,7 ,8,6,3,0,0,8,06,06,76,6,8,9,890};
		
		
		for(int i = 0; i<num.length; i++) {
			int min = num[i];
			
			for(int j =i+1; j<num.length; j++) {
				if(num[j]<min) {
					
					min = num[j];
					num[j] = num[i];
					num[i] = min;
					
				
				}
				
			}
			
		}
		
		for(int i :num) {
			System.out.print(i+" ");
		}
	}

}
