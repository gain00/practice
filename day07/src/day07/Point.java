package day07;

public class Point {
	// 속성(properties) 아래 x,y
	private int x;
	private int y;
	

	//행위(메서드)를 통해서 내부의 속성을 바꾸는게 좋다
	//getter값을 얻는것(읽기전용) 
	//setter 값을 셋팅하는것
	
	
	//빈생성자를 만들지않아도 new Point로 호출해오면 빈생성자를 자바 스스로 만든다
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}


}
