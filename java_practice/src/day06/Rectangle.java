package day06;

import java.util.Scanner;

public class Rectangle {
//	Rectangle 클래스를 작성하고, 생성자를 이용하여 가로(width)와
//	세로(height) 값을 입력받도록 하세요. 또한, 사각형의 면적을 
//	계산하는 getArea() 메소드를 작성하세요.
//
//	위에서 작성한 Rectangle 클래스를 이용하여, 
//	두 개의 Rectangle 객체를 생성하고, 
//	각 객체의 가로와 세로 값을 출력하고, 면적을 출력하세요.

	double width;
	double height;
	
	public Rectangle() {
		Scanner width1 = new Scanner(System.in);
		Scanner height1 = new Scanner(System.in);
		System.out.println("가로: ");
		width = width1.nextDouble();
		System.out.println("세로: ");
		height = height1.nextDouble();
		
		
	}
	
	public void getArea() {
		double area = width * height;
		System.out.println("사각형의 면적은 "+area);
	}
	
	
	
}
