package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student2 {
	String name,id,department;
	double grade;
	public Student2(String name, String id, String department, double grade) {

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
public class StudentTestHashMap {
	public static void main(String[] args) {
		HashMap<String,Student2> studentMap = new HashMap<>();
		studentMap.put("장성호", new Student2("장성호","1","java",3.6));
		studentMap.put("이정재", new Student2("이정재","2","python",3.0));
		studentMap.put("김국진",new Student2("김국진","3","javascript",2.6));
		studentMap.put("고요한",new Student2("고요한","4","c++",1.6));
		//iterator 통해서 반복문 HashMap은 ke
		 Set<String> keylist = studentMap.keySet();
		Iterator<String> it = keylist.iterator();
		while(it.hasNext()){
			String name = it.next();
			Student2 student = studentMap.get(name);
			System.out.println(student);
//			int num = keylist.get(name);
//			System.out.println(name+":"+num);
			
		}
		
		for(Map.Entry<String, Student2> item:studentMap.entrySet()) {
			System.out.println(item.getKey()+":"+item.getValue());
		}
		
        //이름을 입력했을때 출력해보기
		
		
		
		
		
	}
}
