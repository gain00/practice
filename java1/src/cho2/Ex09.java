package cho2;

public class Ex09 {
	public static void main(String[] args) {
		// 대입 연산자
		// 변수의 값을 변경한다
		// ( = , +=, -=, *=, /=, %= )
		int a = 10;
		System.out.println(a+10);
		System.out.println(a*=10);// 대입 연산자와 함께 사용 : 변수의 값이 변한다.
		System.out.println(a+10);
	
		int x = 10;
		int y = ++x;
		System.out.println(x);
		System.out.println(y);
		
		
	}
}
