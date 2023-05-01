package ch01;

public class ForEx {
	public static void main(String[] args) {
		//1부터 100까지의 숫자 중에서 3의 배수와 5의 배수를 출력하는 프로그램을 작성해보세요. 
		//단, 3의 배수와 5의 배수 중에서 공통으로 포함되는 숫자는 한 번만 출력해야 합니다.
		/*
		 * int a; int b; int c; boolean[] d ; for(a=1; a<=100; a++) { if(a%3 == 0) {
		 * System.out.println("3의배수: "+a);
		 * 
		 * }else if(a%5==0) { System.out.println("5의배수: " +a);
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * //10부터 1까지의 정수를 역순으로 출력하는 for문을 작성해보세요. int a; for(a=10; a>0; a--) {
		 * System.out.println(a); }
		 */
		//구구단 중에서 짝수 단(2단, 4단, 6단, 8단)을 출력하는 for문을 작성해보세요.
		int x;
		int y;
		int z;
		for(x=2; x<9; x+=2) {
			for(y=1; y<=9; y+=1) {
				System.out.println(x+"*"+y+"="+(x*y));
			}
		}




	
	}
}
