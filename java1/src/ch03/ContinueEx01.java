package ch03;

public class ContinueEx01 {
	public static void main(String[] args) {
		//Continue문
		//반복문 돌아가서 실행해라 라는 의미
		//증감식, 조건식으로 바로 간다
		
		int a ;
		for(a=1; a<=7; a++) {
			if(a==3) {
				continue;	//밑의 코드를 실행하지않음
				
			}
			System.out.println(a);
		}
		
	
	
	}
	
}
