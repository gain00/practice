package day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student1 {
	String name,id,department;
	double grade;
	public Student1(String name, String id, String department, double grade) {

		this.name = name;
		this.id = id;
		this.department = department;
		this.grade = grade;
	}
	//속성으로 name,id,department,grade만 더블 를 가진다
	//getter/setter둘다
	//모든 속성을 매개변수로 가지는 생성자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + ", department=" + department + ", grade=" + grade + "]";
	}
	

}

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student2> studentList = new ArrayList<>();
		studentList.add(new Student2("장성호","1","java",3.6));
		studentList.add(new Student2("이정재","2","python",3.0));
		studentList.add(new Student2("김국진","3","javascript",2.6));
		studentList.add(new Student2("고요한","4","c++",1.6));
		Student2 list;
		Iterator<Student2> it = studentList.iterator();
//		while(it.hasNext()) {
//			list = it.next();
//			System.out.println(list.toString());
//			
//		}
		while(true) {
			
			
			System.out.println("이름을 입력하세요");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.next();
			if(name.equals("exit"))break;
			else if(name.equals(null))System.out.println("이름이 비었습니다");
			for(int i =0; i<studentList.size();i++) {
				Student2 student = studentList.get(i);
				if(student.getName().equals(name)) {
					System.out.println(student.toString());
				}
			}
			
			
		}
		
		//4명의 학생을 생성해서 studentList에 넣기
		//모든 학생의 정보를 출력해보기 iterator이용해보기.
		//while 문 돌려서 이름을 입력받아 정보 출력해보기.
	}
}
