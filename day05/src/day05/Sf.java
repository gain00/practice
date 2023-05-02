package day05;

import java.util.Scanner;

public class Sf {

	int num = 100; //전역변수
	public static void main(String[] args) {
//		//주어진 배열 2개가 있을때...
//		String coursse[] = {"Java", "C++","HTML5","컴퓨터구조","안드로이드"};
//		inre score [] = {95, 88, 76, 62, 55};
//
//		1. 과목명을 키보드로 입력받았을때 해당하는 점수를 출력하는 프로그램을 짜시오.
//		2. 반복문 돌려서 "exit"를 입력받으면 빠져 나가게 하고 아니면 해당하는 점수를 출력하게도 해보세요.

		String course[] = { "java", "c++", "html5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		
		Scanner scanner = new Scanner(System.in);
		//scope = 변수의 유효범위
		// 대부분의 프로그래밍 언어들의 변수 scope는 block안에서 유효하다.
		//특정언어들은 function scope를 가지기도한다
		while (true) {
			System.out.println("과목이름을 입력해주세요 점수를 알려드립니다");
			String courseName = scanner.next();
			int x = 0;
			if (courseName.equals("exit"))
				break;// 실행문이 한줄이면 중괄호 생략가능

			for (x = 0; x < score.length; x++) {

				if (courseName.equals(course[x])) {
					System.out.println(score[x]);
					break;
				}
				
				
			}
			// 여기다가 없는 과목 처리
			if(x==score.length) {System.out.println("없는과목입니다 다시 입력해주세요");}
			
		}
			System.out.println("끝났음");
	}
}
