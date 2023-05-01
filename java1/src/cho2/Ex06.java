package cho2;

public class Ex06 {
	public static void main(String[] args) {
		//문자열 연산 (+)
		//연결한다 의 의미
		String a = "JDK" + 6.0;
		System.out.println(a);
		String b = a + "특징";
		System.out.println(b);
		String c = "JDK"+3+3.0;//jdk와 3의 연산이 우선되서 문자열로 연산
		System.out.println(c);
		int d = 3+3.0;
		System.out.println(d);
		String e = 3+ 3.0+ "JDK";//3과 3.0의 연산이 우선되서 숫자로 연산
		System.out.println(e);
		
		
		int g = 100;
		String f = "100";
		System.out.println(g+f);// int + String : String +하면 무조건 결과는 String타입으로 나온다
		
		
	}
}
