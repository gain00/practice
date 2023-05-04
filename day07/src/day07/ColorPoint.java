package day07;

public class ColorPoint extends Point {
//	private int x; 쓸데없는 코드 중복
//	private int y;
//	
//	public void showPoint() {
//		
//	}
	
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		this.showPoint();//부모가 허용하는거만 물려받을수있음 private로 사용하면 못물려받음 
	
	}
}
