package quiz;

public class WonTOYuan extends Converter {
	
	public WonTOYuan(double ratio) {
		// TODO Auto-generated constructor stub
		//System.out.println();
		super.ratio = 2;
		this.ratio = ratio;
		// 상속받은순간 내께 되기때문에 this 사용가능 내ratio와 부모의 ratio가 따로 취급
		// 하지만 부모한테 상속받은 변수라서 부모클래스의 변수를 초기화하면 자식클래스의 변수도 같이 초기화됨
		//이런 문제를 예방하기위해 private에 getter setter를 사용
		
		//ratio2 = 2;// 딱히 선언해주지않아도 상속받은 변수를 사용가능
	}
	
	@Override
	public double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;// 부모 ratio가 아닌 내 ratio를 사용
	}

	@Override
	public String srcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	public String destString() {
		// TODO Auto-generated method stub
		return "위안";
	}

}
