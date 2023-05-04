package quiz;

public class TvTest {
	public static void main(String[] args) {
		
		ColorTv colortv = new ColorTv(66,3840);
		colortv.showInfo();
		
		Iptv iptv = new Iptv("192.168.0.8",66,3840);
		iptv.showInfo();
	}
}
