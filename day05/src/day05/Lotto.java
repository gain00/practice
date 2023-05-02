package day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {//정렬해보기 //특정값이 들어가도록하고 랜덤하게//
		Scanner scanner = new Scanner(System.in);
		System.out.println("로또를 몇장 출력하시겠습니까?");
		int num = scanner.nextInt();
		for(int x=0; x<num; x++) {
			int lotto[] = new int[6]; // 공간확보
			System.out.print("로또번호 : ");
			for(int i = 0; i<lotto.length; i++) {
				//static Math 선언하지않고도 사용가능
				lotto[i]=(int)(Math.random()*45)+1;//math의 기본타입은 double 따라서 형변환 해줘야함
				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
						i--;
						break;
					}
				}
			}
			//sorting
			Arrays.sort(lotto);//정렬
			for(int j=0; j<lotto.length;j++) {
				if(j != (lotto.length)-1) {
					System.out.print(lotto[j]+",");
				}else {
					System.out.print(lotto[j]);
				}
				
			}
			System.out.println();
		}
		
	}
}
