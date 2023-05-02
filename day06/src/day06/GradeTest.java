package day06;

public class GradeTest {
	public static void main(String[] args) {
		//평균을 소수점 두번째 자리까지 남겨라
		//average()안에 매개변수만큼 소수점 자리를 남겨라
		Grade myGrade = new Grade(91, 80 ,55);
		double avg = myGrade.average(1);
		System.out.println(avg);
		System.out.println(Math.round(avg));

		
		
		
	}
}
