package ch03;

public class ForEx04 {
	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 0; i <= 5; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		
		
		int sum2 = 0;
		int a;
		for(a=1; a<=5; a++) {
			sum2+=a;
		}
		System.out.println(sum2);
		System.out.println("-----------------------");
		
		//1~100가지의합
		
		int sum3 = 0;
		int b;
		for( b=1; b<=100; b+=1) {
			sum3 += b;
		}
		System.out.println(sum3);
		
		
		
	}
	

		
		
}
