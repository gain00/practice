package ch01;

public class Ex11 {
	public static void main(String[] args) {
		int a=130;
		byte b = (byte)a;// 오버플로우
		System.out.println(b);
		//표현할 수 있는 범위를 ㄴ머어서 나타나ㅡㄴ 형상징크스 알고 넘어가는건지
		
		float f = (float) 5.7;
		
		long c = 100000 * 100000L; // (long) , 1숫자 1과 헷갈릴수있다,L
		
	}
}
