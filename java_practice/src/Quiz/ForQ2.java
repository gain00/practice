package Quiz;

public class ForQ2 {
	public static void main(String[] args) {
		//12345
		//23456
		//34567
		int a = 0;
		int b = 0;
		int c = 0;
		for(a=0; a<5; a++) {//세로줄 반복
			for(b=1; b<=5; b++) {//가로로 1~5까지
				
					System.out.print(a+b);//a+b 가로로 출력
				
			}
			System.out.println();
		}
		
	}
}
