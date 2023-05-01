package ch03;

public class SwitchEx07 {
	public static void main(String[] args) {
		int score = 0;
		String grade ="B";
		switch(grade) {
			case "A" :
				score = 100;
			case "B" :
				score = 80;
				break;
			default :
				score = 60;
		}
		System.out.println("score는 :" + score);
	}
}
