package day06;

public class Circle {
	int radius;
	String name;
	String name1;
	
	//과적하다. =생성자 overload 생성자의 이름이 같게 여러개만들경우
	public Circle() {//생성자에는 리턴타입을 명시하지않는다
		System.out.println("나는 circle");
	}
	
	public Circle(int r, String a) {// 생성자의 이름이 같아도 형태가 다르면 여러개 만들기 가능
		radius = r;
		name = a;
	}
	
	public Circle(int r, String a, String b) {// 생성자의 이름이 같아도 형태가 다르면 여러개 만들기 가능
		radius = r;
		name = a;
		name1 = b;
	}
	
	public double getArea() {//리턴타입을 가지지때문에 반드시 리턴해야한다
		return 3.14*radius*radius;
	}
	
}
