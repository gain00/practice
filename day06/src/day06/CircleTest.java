package day06;

public class CircleTest {//써클테스트라는 프로그램을 만듬
	public static void main(String[] args) {
		//내가 만든 써클(메서드?객체?)사용
		Circle gong = new Circle(30,"축구공");
		System.out.println(gong.name+"의 넓이는 "+gong.getArea()+" 입니다");
		
		
		Circle circle = new Circle();
		circle.name="써클";
		circle.radius=10;
		circle.getArea();
		System.out.println(circle.name+"의 넓이는 "+circle.getArea()+" 입니다");
		
		Circle pizza = new Circle();//생성자를 불러오는방법
		pizza.name = "도미노피자";
		pizza.radius = 25;
		System.out.println(pizza.name+"넓이는"+pizza.getArea()+"입니다");
		//던킨도너츠
		
		Circle donut = new Circle();
		donut.name = "던킨도너츠";
		donut.radius= 5;
		System.out.println(donut.name+"넓이는"+donut.getArea()+"입니다");
	}
}
