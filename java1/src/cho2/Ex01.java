package cho2;

public class Ex01 {
	public static void main(String[] args) {
		//증감연산자(++,--)
		//1증가, 1감소 (boolean타입 사용 불가)
		int a = 10;
		// 할일 두가지 : 연산, 출력
		//증감 연산자가 변수 뒤에 ㅣ있을때 연산이 제일 마지막에 일어남
		System.out.println(++a);//연산, 출력 11 11 -> 선증가
		System.out.println(a);// 출력 11
		System.out.println(a++);//출력, 연산 11 12 -> 후증가
		System.out.println(a);// 출력 12
		
	}
}
