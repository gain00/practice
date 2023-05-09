package day09;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuiz {
	public static void main(String[] args) {
//		-1이 입력될때까지 숫자를 입력받아서
//		제일 큰 숫자 출력해보기..
//		가변형 collection
		ArrayList<Integer> number = new ArrayList<>();
		int a=0;
		int big =0;
		System.out.println("숫자를 입력하시오 -1이 입력되면 가장 큰숫자가 출력됩니다");
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			a = scanner.nextInt();
			if(a != -1) number.add(a);
			else {
				for(int i =0; i<number.size();i++) {
					
					if(number.get(big) < number.get(i)) {
						big = i;
					};
					
					
				}
				System.out.println("제일큰숫자는: "+number.get(big));
				break;
			}
			
		}
	}
}
