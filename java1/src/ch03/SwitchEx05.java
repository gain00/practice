package ch03;

public class SwitchEx05 {
	public static void main(String[] args) {
		char grade = 'B';// 스위치문 주의사항 변수와 case의 타입이 같아야한다
		switch(grade) {
			case 'A' :
			case 'a' :
			case 'c' :
				System.out.println("최고등급입니다");
			case 'B':
			case 'b':
				System.out.println("중간 등급입니다");
				break;
			default:
				System.out.println("최저등급입니다");
		}
	}
}
