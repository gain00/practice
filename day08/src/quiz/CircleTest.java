package quiz;

class Circle {
	private double x, y, radius;

	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public boolean equals(Object obj) {
		Circle circle = (Circle) obj;
		if (circle.x == x && circle.y == y)
			return true;

		return false;
	}
}

public class CircleTest {
//	1. Circle class를 만든다.
//	x,y radius가 속성으로 들어간다.
//equal를 오버라이딩햇서
//두점의 좌표가 같으면 좌표가 같습니다 출력, 아니면 좌표가 다릅니다 출력
	public static void main(String[] args) {
		Circle circle = new Circle(10,10,100);
		Circle circle2 = new Circle(10,10,200);
		if(circle.equals(circle2)) {
			System.out.println("좌표가 같습니다");
		}else {
			System.out.println("좌표가 다릅니다");
		}
		
	}

}
