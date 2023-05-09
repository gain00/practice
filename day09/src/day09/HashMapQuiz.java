package day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuiz {
public static void main(String[] args) {
//	 A,B,C,D,E,F 7개 과목의 평점 내보기
//	 4.5, 3.5 3 2
	HashMap<String, String> average = new HashMap<>();
	
	
	
	for(int i =0; i<7; i++) {
		System.out.println("과목을 입력하세요");
		Scanner scanner1 = new Scanner(System.in);
		String subject = scanner1.next();
		System.out.println("학점을 입력하세요");
		Scanner scanner2 = new Scanner(System.in);
		String grade = scanner2.next();
		average.put(subject, grade);
		
		
	}
	average.values(0)
	
}
}
