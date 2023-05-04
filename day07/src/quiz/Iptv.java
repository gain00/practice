package quiz;

public class Iptv extends ColorTv {
	private String ip;
	public Iptv(String ip,int size, int color) {
		super(size, color);//super는 항상 첫째줄에 선언
		this.ip = ip;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void showInfo() {
		
		System.out.print(ip+"ip");
		super.showInfo();//이렇게하면 ColorTv의 getcolor가 필요없게됨
	}
	
//IPTV는 ColorTv를 상속받아서 
//	String ip를 속성으로 가진다.
//	생성자 함수에
//	new IPTV("192.168.0.8",66,3840)
}
