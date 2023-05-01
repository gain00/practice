package day05;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		//array : 순서매기기
		//인덱스 0부터 시작된다.
		// 인덱스에 해당하는 데이터가 있다. class01[0]="어쩌구", "저쩌구"
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max=0;
		System.out.println("양수 5개를 입력해주세요.");
		for(int i = 0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			//System.out.println(intArray[i]);
			if(max<intArray[i]) {
				max = intArray[i];
			}
			
		}
		System.out.println("입력한수중 가장 큰수는 "+max);
		scanner.close();
	}
}
