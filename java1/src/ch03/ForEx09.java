package ch03;

public class ForEx09 {
	public static void main(String[] args) {
		// 반복문 속 조건문 <-> 조건문 속 반복문
		for(int a=1; a<=10; a++) {
			//for문의 조건식이 true일때 실행
			if(a%2 == 0) {
				//if문의 조건식잉 true일때 실행
				System.out.println(a+" : 작수");
			}else {
				//if문의 조건식잉 false일때 실행
				System.out.println(a+" : 홀수");
			}
		}
	}
}
