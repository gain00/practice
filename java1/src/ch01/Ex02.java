package ch01;

public class Ex02 {// 클래스 선언, 클래스 이름 == 소스파일 이름 
	public static void main(String[] args) {
		// 변수
		// 데이터타입 이름; 선언
		// 이름 = 값; 대입(값의 저장)
		int a;
		a = 10;
		// 변수를 사용한다는건 변수 안에있는 값을 사용한다는 것
		//System.out.println(a);
		/*
		 변수의 초기화 : 변수에 최초의 값을 넣어주는 것
		 변수는 선언된 영역 안에서만 사용가능
		 변수 이름 : 소문자 사용, 어떤것을 사용할지 유추 가능한 이름 사용.
		 		  int age; String name;
		 = : 대입 - 오른쪽에 있는 값을 왼쪽에 대입한다.
		 변수를 사용한다는건 변수 안에있는 값을 사용한다는것.
		 변수는 하나의 값만을 저장하는 저장소
		 제일 마지막에 대입된 값만 남음
		 갯수 상관없이 선언 가능
		 이름 길이 상관없음.
		*/
		a = 20;
		System.out.println(a);
		int aa = 20; // 선언과 대입 한번에 가능
		System.out.println(aa);
		
		int c = aa;
		System.out.println(c);
		
		int d = 
				c+a;//세미콜론이 있어야 하나의 실행문이라는 의미
		System.out.println(d);
	}// main영역
}// class영역
