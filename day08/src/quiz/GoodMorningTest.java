package quiz;

import java.util.Calendar;

public class GoodMorningTest {
//	 현재 시간을 출력하는데 15시 15분
//	 6~11 goodmoring
//	 12~17goodafternoon
//	 18~21goodevening
//	 22~ goodnight
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minutes = now.get(Calendar.MINUTE);
		System.out.println(hourOfDay+":"+minutes);
		if(hourOfDay>=6 && hourOfDay<11) {
			System.out.println("good morning");
		}else if(hourOfDay>=11 && hourOfDay<18) {
			System.out.println("good afternoon");
		}else if(hourOfDay>=18 && hourOfDay<22) {
			System.out.println("good evening");
		}else {
			System.out.println("good night");
		}
	}
}
