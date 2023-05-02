package day06;

public class Book {
	// 제목,작자
	public String title;
	public String author;

	public Book() {//생성자함수는 무조건 빈생성자라도 하나 만들어야함 없으면
		//컴파일러가 빈 생성자를 만들어줌 하지만 빈생성자가 없을때 그냥 생성자가 있으면 만들어주지않음
		title = "";
		author = "";
		//this("","");
	}

	public Book(String title) {
		this.title = title;// this 나 클래스를 가르킴
		author = "작자미상";
	}

	public Book(String t , String a) {
		title = t;
		author = a;
	}

	public void showInfo(){//리턴이없을땐 void
		System.out.println("제목: " + title+","+"작가는 " +author);
	}
}
