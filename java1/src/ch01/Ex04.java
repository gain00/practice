package ch01;

public class Ex04 {
	public static void main(String[] args) {
		//논리형 boolean
		//결과값이 t/f로 나온다.
		
		boolean a;//클래스가 다르기 때문에 같은 이름의 변수 사용 가능
		a = true;
		System.out.println(a);
		boolean b = false;
		System.out.println(b);
		
		int x = 10;
		int y = 5;
		boolean c = x>y;
		System.out.println(c);
		
		c = (x != y);
		System.out.println("z의 결과는 "+c);
	}
}
