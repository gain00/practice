package ch03;

public class WhileEx04 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=5) {
			sum+=i;
			i++;
			
		}
		System.out.println(sum);
	
		//1~100까지의합
		
		int a = 0;
		int b = 0;
		while(a<=100) {
			b+=a;
			a++;
			
		}
		System.out.println(b);
		
		
	}
}
