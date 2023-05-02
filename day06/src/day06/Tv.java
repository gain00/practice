package day06;

public class Tv {
	//company, year, size
	//showInfo()라는 메서드를 통해서 제품 정보 출력
	String company = "";
	int year = 0;
	int size = 0;
	public Tv(){
		
	}
	public Tv(String c,int y,int s) {
		company = c;
		year = y;
		size = s;
	}
	
	public void ShowInfo() {
		System.out.println("우리집Tv는 "+ company
				+ "이고 "+year+"년도에 생산되었고" 
				+size+"인치입니다");
	}


}
