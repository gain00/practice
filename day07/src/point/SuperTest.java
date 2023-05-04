package point;

//inner class 따로 파일을 안만들고 여기 안에서 쓰는 클래스 
class Point{
	private int x,y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}


}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		//쓰지않으면 기본생성자 호출
//		super();//Point호출 매개변수없는 부모생성자를 호출
		//super(x,y);//Point(int x, int y)호출 매개변수있는 부모생성자를 호출
		this.color = color;
	}
	
	public void showColorPoint( ) {
		System.out.println(color);
		this.showPoint();
	}
}

public class SuperTest {
	public static void main(String[] args) {
		ColorPoint colorPoint = new ColorPoint(10,10,"red");
		colorPoint.showColorPoint();
	}
}
