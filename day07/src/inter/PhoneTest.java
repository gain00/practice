package inter;

public class PhoneTest {
	public static void main(String[] args) {
		Gallaxy gallaxy22 = new Gallaxy();
		gallaxy22.sendCall();
		gallaxy22.receiveCall();
		gallaxy22.samsungPay();
		
		Iphone iphone14 = new Iphone();
		iphone14.sendCall();
		iphone14.receiveCall();
		
		//인터페이스의 좋은점 : 유도리있게 사용가능
		PhoneInterface myPhone = new Gallaxy();
		PhoneInterface myPhone1 = new Iphone();
	}
}
