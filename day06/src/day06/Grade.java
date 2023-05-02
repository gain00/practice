package day06;

public class Grade {
	// kor, eng , math
	// 평균을 출력하는 class
	public double kor;
	public double eng;
	public double math;
	public int c = 10;
	public Grade() {
		
	}
	public Grade(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	public double average(int a) {//
		//a는 0의 갯수
		for(int b=1; b<a; b++) {
			c= c*10;
			
		}
		double aver = Math.round(((kor+eng+math)/3)*c);
		return aver/c;
	}
}
