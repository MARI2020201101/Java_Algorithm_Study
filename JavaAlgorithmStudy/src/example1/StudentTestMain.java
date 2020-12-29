package example1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestMain {

	public static void main(String[] args) {

		Student stu1 = new Student("momo","01");
		Student stu2 = new Student("mina","02");
		Student stu3 = new Student("nana","03");
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) { 
		System.out.println("Do you want to search a student? y or n > ");
		String inputText = scan.next();
		boolean flag = false;
		if(inputText.equals("y")) {
			System.out.println("Please Enter student name");
			String stuName = scan.next();
			
			
			for(Student student : stuList) {
				if (stuName.equals(student.getName())) {
					flag = true;
					String s = student.getNo();
			        System.out.println("Student " + stuName + " number is " + s);
					}
				}
			}
		
		else if(inputText.equals("n")){
			System.out.println("Finish Searching");
			break;}
		
		}
			
	}
}


