package day08;

//Rect라는 class를 만든다. width와 height를 가진다 equals의 조건을 면적이 같으면 같은 Rect로 인정한다.


	class Rect{
		private int width, height;
		
		public Rect(int width, int height) {
			this.width = width;
			this.height = height;
			
			
		}
	

	public boolean equals(Object obj) {
		//==는 객체가 같은지 비교
		//equals는 값비교에 사용 사용하려면 메소드오버라이징으로 재정의(문자열제외)
//		Point02 point = (Point02) obj;
//		if(x==point.x && y==point.y) {
//			return true;//함수는 리턴을 만나면 리턴을 뱉어내고 더이상 실행되지않고 끝남
//		}
		Rect rect = (Rect) obj;
		if(rect.width*rect.height == width*height) {
			return true;
		}
		
		return false;
	}

}

public class EqualsTest {
	public static void main(String[] args) {
		/*
		Point02 pointA = new Point02(10, 10);
		Point02 pointB = new Point02(10, 10);
		Point02 pointC = pointA;
		System.out.println(pointA == pointB);
		System.out.println(pointA == pointC);
		System.out.println(pointA.equals(pointB));
		System.out.println(pointA.equals(pointC));
		*/
		Rect rect01 = new Rect(10,10);
		Rect rect02 = new Rect(50,2);
		System.out.println(rect01.equals(rect02));
	}
}
