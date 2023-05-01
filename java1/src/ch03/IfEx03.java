package ch03;

public class IfEx03 {
	public static void main(String[] args) {
		//if-else문
		int a = 6;
		if( a<0) {
			System.out.println("크다");
		}else {//필수 아님. 선택. 단독사용 불가
			System.out.println("작다");
		}
		System.out.println(a);
	}
}
