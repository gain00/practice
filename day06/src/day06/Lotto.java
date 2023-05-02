package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {//함수를 생성자화
	public Lotto() {
		
	}
	public Lotto(int many) {
		howMany(many);
	}
	public void howMany(int many) {
		for(int i =0; i<many; i++) {
			makeLotto();
		}
		
	}
	//기능이 겹칠때 접근 제한자 private
	private void makeLotto() {
		int lotto[] = new int[6]; // 공간확보
		Scanner  sc = new Scanner(System.in);
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
