package Quiz;

public class ForQ4 {
	public static void main(String[] args) {
		int a,b;
		
		for(a=1; a<6; a++) {
			for(b=4;b>=a;b--) {
				System.out.print(" ");
			}
			
			for(b=1; b<=a*2-1; b++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}
}
