package Quiz;

public class ForQ1 {
	public static void main(String[] args) {
		//순차적으로 별이 늘어나도록 포문써서 만들기
		//사고방식 : 가로반복과 세로반복이 있기때문에 변수 2개
		int a = 0;
		int b = 0;
		for(a=1; a<=5; a++) {
			for(b=1; b<=a; b++) {// b가 a보다 작거나 같을때까지 반복
				System.out.print("*");//ln = 줄바꿈
			}
			System.out.println();
		}
	}
}
