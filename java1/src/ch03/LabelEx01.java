package ch03;

public class LabelEx01 {
	public static void main(String[] args) {
		int a, b;
		aa : for(a=1; a<=5; a++) {// aa라는 이름 붙여줌
			for(b=1; b<=5; b++) {
				if(b==3) {
					break aa; // aa까지 중지 시키겠다
				}
				System.out.println(a+"--"+b);
			}
		}
	}
}
