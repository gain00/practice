package ch03;

public class IfEx07 {
	public static void main(String[] args) {
		int score = 87;
//		if(score>= 90) {
//			System.out.println("A학점");
//			
//		}else if(score>=80) {
//			System.out.println("B학점");
//			
//		}else if(score>=70) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("F학점");
//		}
		String result;
		if(score>= 90) {
			result = "A학점";
			
		}else if(score>=80) {
			result = "B학점";
			
		}else if(score>=70) {
			result = "V학점";
		}else {
			result = "F학점";
		}
		System.out.println(result);
	}
}
