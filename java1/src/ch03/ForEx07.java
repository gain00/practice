package ch03;

public class ForEx07 {
	public static void main(String[] args) {
		//for문 속 for문
		int a;
		for(a=1; a<=5; a++) {
			for(int b=1; b<=5; b++) {
				System.out.println(a+"//"+b);
				
			}
		}
		// 구구단 2*1 = 2
		int x;
		int y;
		for(x=2; x<=9; x++) {
			for(y=1; y<=9; y++) {
				System.out.println(x+"*"+y+"="+(x*y));
			}
		}
	}
}
