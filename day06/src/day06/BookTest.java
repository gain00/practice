package day06;

public class BookTest {
	public static void main(String[] args) {
		Book littlePrince = new Book();
		littlePrince.showInfo();//showInfo void를 추가해야 생김
		
		Book java = new Book("java 코딩");
		System.out.println(java.author+java.title);
		
		Book untitle = new Book();
		untitle.showInfo();
		
		Book myBook = littlePrince;
		littlePrince.author="san thecjjivberry";
		myBook.author = "장성호";
		
		//기본 타입이 아닌 변수들은 참조를 한다. 복사하지않는다.
		int arr01[] = {1,2,3};
		int arr02[] = arr01;
		arr02[1] = 200;
		System.out.println(arr01[1]);//주소를 던져줌
		
		
	}
}
