
public class Fact1 {
	
	public static int fact(int number) {
		int fact =1;
		if(number == 0) {
			return 1;
		}
		for(int i =1; i<=number; i++) {
			fact =fact*i;
		}
		return fact;
	
	}
	public static void main(String[] args) {
		int number = 5;
				
		System.out.println(fact(number));
	}

}
