package day06;

import java.util.Scanner;

public class LottoTest {
	public static void main(String[] args) {
		///로또 6자리 
		/// 몇장 뽑을건지 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("받고싶은 로또 매수를 입력하시오");
		int a = scanner.nextInt();
		Lotto lotto = new Lotto(a);
		
	}
}
