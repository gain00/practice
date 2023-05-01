package ch03;

public class SwitchEx03 {
	public static void main(String[] args) {
		int a = 10;
		switch(a) {
			case 10 :
				System.out.println("10점");
				break;// 만나면 스위치문을 빠져나간다 case종료
					  // 조건문 반복문 : if문, for문, Do-while문에 사용됨
						// 아스키코드  97 'a' 65 'A' 
			case 9:
				System.out.println("9점");
				break;
			case 8:
				System.out.println("8점");
				break;
			default:
				System.out.println("0점");
				
		}
	}
}
