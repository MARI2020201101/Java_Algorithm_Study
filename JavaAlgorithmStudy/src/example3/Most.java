package example3;

import java.util.ArrayList;

public class Most {

	ArrayList<Number> numbers = new ArrayList<Number>();
	public ArrayList<Number> inputNum(int n1) {
		for(Number number : numbers) {
			if(number.getNumber()==n1) {
				number.setCount(number.getCount() + 1);
			}else {
				Number newn1 = new Number(n1);
				numbers.add(newn1);
				newn1.setCount(newn1.getCount() + 1);
			}
		}return numbers;
	
	}
	public void mostNum() {
		ArrayList<Integer> counts = new ArrayList<Integer>();
		for(Number number : numbers) {
			int c1 = number.getCount();
			counts.add(c1);
			}
		for(int i = 0; i < counts.size() - 1; i++) {
			
				if(counts.get(i) > counts.get(i+1)) {
					System.out.println(counts.get(i));
			}else {
				System.out.println(counts.get(i+1));
			}
	}
	
		
	}
}
