package System.out;

public class ForEx11 {
	public static void main(String[] args) {
		int a,b;
		for( a=1; a<=5; a++) {
			for( b=1; b<=5; b++) {
				if(b==3) {
					break;
				}
				System.out.println(a+"--"+b);
			}
		}
	}
}
