package example4;

import java.util.ArrayList;

public class Binary {

	public static void main(String[] args) {
		//19 -> 10011(2)
		//19¸¦ 2·Î ³ª´©¸é ->1
		//9¸¦ 2·Î ³ª´©¸é -> 1
		// 19 = 0½Â*1 + 1½Â*1 + 2½Â*0 + 3½Â*0 + 4½Â*1
		
		int value = 19;
		ArrayList<Integer> bins = new ArrayList<>();
		int i = 0;
		while(value>0) {	
			bins.add(value%2);
			value = value/2;
			System.out.println(value);
			System.out.println(bins);
			i++;
		}

		
	/*	int i = 0;
		String binary = bins[i];
		for(i =0 ; i <bins.length -1 ; i ++) {
			binary = bins[i+1] + binary;
		}
		System.out.println(binary);*/
		
		/*int value = 19;
		
		String bin0 = Integer.toString(value%2);
		value = value/2;
		System.out.println(bin0);
		System.out.println(value);
		
		
		String bin1 = Integer.toString(value%2);
		value = value/2;
		System.out.println(bin1);
		System.out.println(value);
		
		String bin2 = Integer.toString(value%2);
		value = value/2;
		System.out.println(bin2);
		System.out.println(value);
		String bin3 = Integer.toString(value%2);
		value = value/2;
		System.out.println(bin3);
		System.out.println(value);
		String bin4 = Integer.toString(value%2);
		value = value/2;
		System.out.println(bin4);
		System.out.println(value);
		if(value==0) {
			System.out.println(bin4+bin3+bin2+bin1+bin0);
		}
		*/

	}

}
