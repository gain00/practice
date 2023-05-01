package ch03;

public class ForEx02 {
	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){ 실행문 }
		// 실행순서 : 초기식 - 조건식 - 실행문 - 증감식 -조건식 - 실행문 -증감식 --------
		// 초기식: 처음 단 한번만 실행
		// 조건식 : 조건식의 결과가 true일때 실행문 실행, 몇번 반복하는지 알수있다.
		// 증감식 : 증강함. 대입연산자가 사용된다
		// 조건식이 false일때 for문 종료

		for (int a = 1; a <= 3; a++) {
			System.out.println("안녕하세요");
		}
		
		for(int b=0; b<=5; b++) {
			System.out.println(b);
		}
		
		System.out.println("-------------------------------");
		//1~100가지 출력되는 코드
		for(int x=1; x<=100; x++) {
			System.out.println(x);
		}
	}
}
