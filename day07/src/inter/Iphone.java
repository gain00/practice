package inter;

public class Iphone implements PhoneInterface,MobilePhoneInterface{//다중상속

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 울리는 소리");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화왔어요.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}
	

}
