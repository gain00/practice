package day07;

public class ColorPointTest {
	public static void main(String[] args) {
		Point point = new Point();//생성자 호출
		point.set(10, 10);
		point.showPoint();
		
		ColorPoint colorPoint = new ColorPoint();
		colorPoint.set(20, 20);
		colorPoint.setColor("red");
		colorPoint.showColorPoint();
		
	}
}
