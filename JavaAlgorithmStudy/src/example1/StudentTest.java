package example1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	//학생정보 저장하기
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	public void setStudent(String name, String no){
		Student student = new Student(name,no);
		studentList.add(student);
	}
	
	//학생검색(이름 -> 학번)
	public String IsStudent(String name) {
		String Answer = "";
		System.out.println("Do you want to search? : y or n > ");
		Scanner scanner = new Scanner(System.in);
		String inputText = scanner.nextLine();
		int i = 0;
		
			switch(inputText) {
				case "y" : 
					i = i + 1;
					Student student = new Student();
					student = studentList.get(i);
					if(name.equals(student.getName()))
						Answer = "The Student no.is " + student.getNo();
					else Answer ="No Student";
					
				case "n" : 
					break;
				default : 
					Answer = "Finish";
					break;
			}return Answer;
			}
	}
		



