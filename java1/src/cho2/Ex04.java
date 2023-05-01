package cho2;

public class Ex04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		//출력, 증강, 덧셈
		//순서 : 증감 덧셈 출력
//		System.out.println(++a + b); // 11 + 10
//		System.out.println(++a + ++b);// 11 + 11
//		
//		//후증감이기 때문에 가운데 덧셈이 먼저 일어난다.
//		System.out.println(a++ + b++);// 10 + 10
	
		System.out.println(++a + ++a);// 11 + 12
	}
}
