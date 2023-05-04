package day08;

//inner class
class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

//	public String toString() {
//		return "dd";
//	}
}

public class ObjectTest {
	public static void main(String[] args) {
		// new를 통해서 사용
		Point point = new Point(10, 10);// int같은게아니라 타입이 포인트?
		Point point2 = new Point(10, 10);
		point.setX(11);
		System.out.println(point.getX());
		System.out.println(point.getClass());
		System.out.println(point.hashCode());// point가 getclass를 사용할수있는이유 object를 상속받았기때문
		System.out.println(point2.hashCode());
		System.out.println(point.toString());
	}
}
