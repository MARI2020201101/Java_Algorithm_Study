package example3;

import java.util.Scanner;

public class Mode {
	//1 2 2 3 1 4 2 2 4 3

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		int[] modes = new int[10];
		for(int i = 0; i <10 ; i++) {
		modes[numbers[i]]++;
		}

		int numname = 0;
		int mode = 0;
		for(int i=0; i<10; i++) {
			if(modes[i] >mode) {
				mode = modes[i];
				numname = i;
			}System.out.println("mode number : " + numname + " , mode value : " + mode);
		}
	}

}
