package Quiz;

public class IfQ1 {
	public static void main(String[]	args) {
	/* score에 점수입력시 아래와 같이 출력되도록 if-else if-else문을 작성해보자.
	 * 예)
점수는 93점입니다.
학점은 A입니다.

점수는 83점입니다.
학점은 B입니다.

점수는 73점입니다.
학점은 C입니다.

점수는 63점입니다.
학점은 D입니다.

점수는 53점입니다.
학점은 F입니다.
*/	
		int score = 55;
		char grade;
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("점수는"+ score +"점입니다");
		System.out.println("학점은"+ grade + "입니다");
		
	}
}
