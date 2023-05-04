package day08;
class Jum{
	public Jum(String a) {
		String year= a.substring(0, 2);
		String month= a.substring(2, 4);
		String date= a.substring(4, 6);
		
		System.out.println(year+"년"+month+"월"+date+"일");
		//다시해보기
	}
	
}

public class StringTest {
	public static void main(String[] args) {
		String str01 = new String("Java");
		String str02 = new String("JavaScript");

		System.out.println(str01.length());
		System.out.println(str02.length());
		System.out.println(str01.contains("J"));
		
		System.out.println(str01.concat(str02));
		
		String str03 = "Java,Oracle,JavaScript,Jsp,Spring";
		
		
		String strList[] = str03.split(",");
		System.out.println(strList[0]);
		
		for(String str : strList) {
			System.out.println(str);
		}
		
		String jumin = "9012135487";
		String jumin6 = jumin.substring(0, 6);
		System.out.println(jumin6);
		//90년 12월 12일
		Jum jum = new Jum(jumin);
		
		
		
	}
}
