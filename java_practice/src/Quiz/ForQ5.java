package Quiz;

public class ForQ5 {
	public static void main(String[] args) {
		int a,b;
		for(a=0; a<5; a++) {
			for(b=0; b<a; b++) {
				System.out.print(" ");
			}
			
			for(b=0; b<9-a*2; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
//a = 1 b= 9  2 7   3 5  4 3 , a=5 b=1       