package quiz;

public class TV {
//TV라는 클래스를 만든다
//size라는 속성을 가진다.
//생성자는 size를 정할수있다
//
//ColorTV를 만들고 TV를 상속 받는다.
//color라는 속성을 가진다.
//showInfo를 통해 (66인치 1024컬러) 를 출력한다

	private int size;//속성
	public TV(int size) {//생성자
		this.size = size;
	}
	public int getSize() {//size가 private이기 대문에 만듬
		return size;
	}
	
	
	

}

