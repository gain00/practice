package ch03;

public class SwitchEx01 {
	public static void main(String[] args) {
		// Switch문 변수의 값을 가지고 평가한다.
		// 결과값을 int와 String 타입으로 사용한다.
		// {}블럭만 영역이다.
		
		int a = 30;
		switch(a) {
		case 50 :
			System.out.println("50");
			break;
		case 30 :
			System.out.println("30");
			break;
		case 10 : 
			System.out.println("10");
			break;
			
		}
		
		int num = 3;
		switch(num) {
			
			case 1:
				System.out.println(1); // 해당되는 case밑에 부분을 모두 실행
			case 2:
				System.out.println(2);
			case 3:
				System.out.println(3);
			case 4:
				System.out.println(4);
			default :
				System.out.println(0); //만족되는값이 없으면 default로 간다
			
		}
		
	}
}
