package day09;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	private int id;
	private String tel;
	public Student(int id, String tel) {
	
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
	
}
public class StudentMap {
	public static void main(String[] args) {
		
		HashMap<String,Student> studentMap = new HashMap<>();
		studentMap.put("정진영",new Student(1, "010-1111-3333"));
		studentMap.put("아무개",new Student(2, "010-2222-3333"));
		studentMap.put("장진철",new Student(3, "010-3333-3333"));
		studentMap.put("김기범",new Student(4, "010-4444-3333"));
		studentMap.put("우웅우",new Student(5, "010-5555-3333"));
		Scanner scanner = new Scanner(System.in);
		//이름을 입력하면 id: 1====tel:~~~~
		while(true) {
			System.out.println("이름을 입력해 주세요 exit를 쓰면 종료합니다");
			String name = scanner.next();
			if(name.equals("exit"))break;
			Student student = studentMap.get(name);
			if(student==null) System.out.println("없는 이름 입니다");
			else System.out.println(name +"id : "+ student.getId()+"===tel: " +student.getTel());
		}
	}
}
