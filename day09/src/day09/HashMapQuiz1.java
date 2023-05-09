package day09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuiz1 {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		nations.put("한국", 5000);
		nations.put("미국", 25000);
		nations.put("중국", 100000);
		nations.put("인도", 120000);
		nations.put("일본", 15000);
		
		System.out.println("나라를 입력해주세요 exit를 누르면 빠져나갑니다");
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String nation = scanner.next();
			if (nation.equals("exit"))break;
			else if(nation.equals(null))System.out.println("나라를입력해주세요");
			else if(nations.containsKey(nation)) System.out.println(nation + " : " +nations.get(nation) +"만명");
			else System.out.println("다른 나라를 입력해주세요");
		}
	
	}
}
