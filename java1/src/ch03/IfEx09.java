package ch03;

public class IfEx09 {
	public static void main(String[] args) {
		// 변수 : 선언된 블럭(영역,지역)안에서만 사용가능
		//		블럭이 닫히면 자동으로 삭제된다.
		int a = 100;
		if (a > 0) {
			int x = 1000;
			System.out.println(a);
			System.out.println(x);
		}
		System.out.println(a);
//		System.out.println(x); x변수는 if문 안에서 선언되었기때문에 밖에서는 사용불가
	}
}
