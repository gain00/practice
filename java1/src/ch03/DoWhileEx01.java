package ch03;

public class DoWhileEx01 {
	public static void main(String[] args) {
		//while문을 뒤집은거
		//무조건 한번은 실행한다.
		
		int a = 0;
		while(a<3) {
			a++;
			System.out.println("hello");
		}
		
		
		//do-while문
		int b = 0;
		
		do {
			b++;
			System.out.println("hihihi");
			
		}while(b<3);
	}
}
