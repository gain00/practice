package ch03;

public class WhileEx03 {
	public static void main(String[] args) {
		//구구단
		/*
		 * int dan, num; for( dan = 2; dan<10; dan++) { for(num=1; num<=9; num++) {
		 * System.out.println(dan+"x"+ num +"="+(dan*num)); } }
		 */
		int a=2;
		
		while(a<10) {
			int b=1;// 초기식의 위치는 반드시 조건식의 위에
			while(b<10) {//초기값이 없으면 false
				System.out.println(a+"x"+ b +"="+(a*b));
				b++;
			}
			
			a++;
		}
		
		
	}
}
