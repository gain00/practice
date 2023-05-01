package ch03;

public class ForEx05 {
	public static void main(String[] args) {
		//1~100까지 홀수의 합
		int sum1 = 0;
		
		for(int a = 1; a<=100; a+=2) {
			sum1 +=a;
		}
		System.out.println(sum1);
		
		//1~100까지 짝수의 합
		int sum2 = 0;
		int b = 0;
		for(b=2; b<=100; b+=2) {
			sum2+=b;
		}
		System.out.println(sum2);
		
	}
}
