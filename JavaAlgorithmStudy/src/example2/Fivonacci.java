package example2;

public class Fivonacci {

	public static void main(String[] args) {
		//1 1 2 3 5 8 
		int num1 = 1;
		int num2 = 1;
		int result = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			num1 = num2;
			num2 = result;
			result = num1 + num2;
			System.out.println(result);
		}
	
	}

}
