package ch03;

public class SwitchEx02 {
	public static void main(String[] args) {
		int time = 8;
		switch(time) {
			
			case 8 :
				System.out.println("출근합니다");
			case 9 :
				System.out.println("회의를 합니다");
			case 10 :
				System.out.println("업부를 봅니다");
			default :
				System.out.println("외근을 나갑니다");
			
		}
	}
}
