package day05;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		//50000,10000,5000,1000,500,100,50,10
		//배열은 규칙이 없는것에 규칙을 만들어 줄때 사용한다.
		Scanner scanner= new Scanner(System.in);
		System.out.println("얼마를 바꿀건가요?? 금액을 입력하시오 엔터");
		int money = scanner.nextInt();
		
		//오만원36장,만원0장,오천원 1장, 천원 4장, 오백원 1장,백원 3장, 50원 한장, 10원 3장
		
		int wlvp[] = {50000,10000,5000,1000,500,100,50,10};
		
		for (int x = 0; x<wlvp.length; x++ ) {
			

				System.out.println(wlvp[x]+"원:"+money/wlvp[x]);
				money = money%wlvp[x];

		}
		scanner.close();
	}
}
