package ch03;

public class ForEx08 {// 선생님이랑 하나 차이남
	public static void main(String[] args) {
		//for문속 for문 2개
		
		int a;
		for(a=1; a<=5; a++) {
			for(int x=1; x<=5; x++) {
				System.out.println(a+"//"+x);
				
			}//변수 x의 종료
			for(int y=1; y<=5; y++) {
				System.out.println(a+" hello");
			}//변수 y의 종료
		}//변수 a의 종료
		
		
		int b;
		for(b=1; b<=5; b++) {
			for(int x=1; x<=5; x++) {
				System.out.println(b+"//"+x);
				
			}
			for(int x=1; x<=5; x++) {
				System.out.println(b+" hello");
			}//지역변수 
		}
		
		int c;
		int x;
		for( c=1; c<=5; c++) {
			for( x=1; x<=5; x+=1) {
				
			}
		}
	}
}
