package Quiz;

public class ForQ3 {
	public static void main(String[] args) {
		int a ,b;
		
		for(a=1; a<=5; a++) {
			for(b=1; b<=5-a; b++) {
				System.out.print(" ");
			}
			for(b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(a=1; a<=5; a++) {
			
			for(b=1; b<a; b++) {
				System.out.print(" ");
			}
			for(b=0; b<=5-a; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
