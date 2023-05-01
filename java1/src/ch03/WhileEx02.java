package ch03;

public class WhileEx02 {
	public static void main(String[] args) {
		//while문에서 break 사용
		int a=0;
		while(true) {//일부러 무한반복 동작
			a++;
			System.out.println("안녕이란말 헬로");
			if(a==10) {
				break;// if문과 break사용해서 while문을 빠져나감
			}
		}
		
	}
}
