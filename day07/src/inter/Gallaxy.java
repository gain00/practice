package inter;

public class Gallaxy implements MobilePhoneInterface, Mp3Interface{//자바에서 다중상속은 인터페이스만
//public class Gallaxy extend 어쩌구 implements MobilePhoneInterface, Mp3Interface 클래스 상속도 가능함
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띵띵 디리디리");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화왔어요...");
	}
	
	public void samsungPay() {
		System.out.println("삼성페이");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("sms를 보낼수있음");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("sms를 받을수있음");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("뮤직스타트");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("뮤직 스탑");
	}
	

}
