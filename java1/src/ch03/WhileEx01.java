package ch03;

public class WhileEx01 {
	public static void main(String[] args) {
		//while문
		//for문 <-> while문을 바꿔보는 연습!
		
		int a = 0;
		while( a<3 ) {
			System.out.println("hello");
			a++;
		}
		
		int b = 0;
		while( b<3 ) {
			b++;	// 증감식의 위치 실행문의 위 아래 상관없음
			
			System.out.println("hi");
		}
	}
}
