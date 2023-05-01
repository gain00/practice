package cho2;

public class Ex02 {
	public static void main(String[] args) {
		//증강연산자의 위치와 순서
		//변수 앞 ( 선증가 1순위) / 변수 뒤 ( 후증가 마지막순위}
		int a = 10;
//		System.out.println(a++);// 출력 10 연산 11
//		System.out.println(++a);// 연산 12 출력 12
//		System.out.println(a++);// 출력 12 연산 13
//		System.out.println(++a);// 출력 14 연산 14
//		a++;//연산 15
//		System.out.println(++a);// 연산 16 출력 16 
//		System.out.println(a);// 출력 16

		System.out.println(a--); //출력 10 연산 9
		System.out.println(--a); //연산 8 출력 8
		System.out.println(a--); //출력 8 연산 7
		System.out.println(a--); //출력 7 연산 6
		System.out.println(--a); //출력 5 연산 5
		a--; 					 //연산 4
		System.out.println(--a); //출력 3 연산 3
		System.out.println(a);   //출력 3
		
}
}
