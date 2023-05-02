package day06;

public class Student {
//다음 코드에서 Student 클래스의 객체를 생성하고, 
	// 생성된 객체의 이름을 "kim"으로 설정하고,
	// 학년을 3으로 설정하는 코드를 작성하세요.
	String name;
	int grade;
	
	public Student(){
		
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("이름은"+name);
		
	}
	public void setGrade(int grade) {
		this.grade = grade;
		System.out.println("학년은"+grade);
	}
	
	
}
