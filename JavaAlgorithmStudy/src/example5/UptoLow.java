package example5;

import java.util.ArrayList;

public class UptoLow {

	public static void main(String[] args) {
		//helloWorlD ->HELLOwORLd
		/*char a = 65;
		char z = 90;//no. 26
		char b = 97;
		System.out.println(a);
		System.out.println(z);
		System.out.println(b);*/
		//
		//�빮������(65~90) �ҹ�������(97~122) �Ǻ�
		//�빮���̸� + 32
		//�ҹ����̸� - 32
		char[] input = {'h','e','l','l','o','W','o','r','l','D'};
		for(char c : input) {
			if(c <= 90) {
				c = (char)(c + 32);
			}else {
				c = (char)(c - 32);
			}
			System.out.println(c);
		}
		
		
	}

}
