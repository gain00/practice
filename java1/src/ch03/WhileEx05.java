package ch03;

public class WhileEx05 {
	public static void main(String[] args) {
		//100까지 홀수 출력
		int a = 0;
		
		while(a<=100) {
			if(a%2 == 1) {
				System.out.println(a);
			}
			a++;
		}
		
		System.out.println("-----------------------------");
		
		//100까지 짝수 출력
		int b = 0;
		while(b<=100) {
			if(b%2 == 0) {
				System.out.println(b);
			}
			b++;
		}
	}
}
