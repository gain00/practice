package instance;

class Person{}//이너클래스
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher{}
class StudentWorker extends Student{}


//생성자 오버로드 여러개 만드는거
//메서드 오버로드 여러개 만드는거
//메서드 오버라이드 부모를 가지고 있는 메서드를 재정의(업그레이드시켜서 사용하려고)(덮어쓰기)해서 사용하는거


public class InstanceTest {
	 
	static void print(Person person) {
		if(person instanceof Person){ 
			System.out.println("사람입니다");
		}
		if(person instanceof Student) System.out.println("학생입니다");
		if(person instanceof Researcher) System.out.println("Researcher입니다");
		if(person instanceof Professor) System.out.println("교슈입니다");
		if(person instanceof StudentWorker) System.out.println("StudentWorker입니다");
	}
	
	public static void main(String[] args) {
		print(new Researcher());
	}
}
