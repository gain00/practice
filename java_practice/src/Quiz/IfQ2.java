package Quiz;

public class IfQ2 {
	public static void main(String[] args) {
/*
3) 국어 영어 수학 점수와 3과목의 총합 , 평균 점수가 출력되도록 if-else if-else문을 작성해보자
 .평균 : 100 ~ 90 	= A학점
 .평균 : 89 ~ 80	= B학점
 .평균 : 79 ~ 70	= C학점
 .평균 : 69 ~ 60	= D학점
 .평균 : 60점 미만	= F학점

예)
국어 점수는 93점입니다.
영어 점수는 90점입니다.
수학 점수는 85점입니다.
총점은 268 입니다.
평균은 89.0 입니다.
학점은 B입니다.

*/
	int k = 93;
	int e = 90;
	int m = 99;
	int total = k+e+m;
	double aver = total/3;
	String grade = null;
	if(k>100 || e>100 || m>100) {
		System.out.println("잘못입력하셧습니다");
	}else {
		if (aver>=90) {
			grade= "A";
		}else if(aver>= 80) {
			grade= "B";
		}else if(aver>= 70) {
			grade= "C";
		}else if(aver>= 60) {
			grade= "D";
		}else {
			grade = "F";
		}
		
		System.out.println("국어점수는"+k+"점입니다");
		System.out.println("영어점수는"+e+"점입니다");
		System.out.println("수학점수는"+m+"점입니다");
		System.out.println("총점은"+total+"점입니다");
		System.out.println("평균은"+aver+"점입니다");
		System.out.println("학점은"+grade+"입니다");
	}
	
	
	}
}
