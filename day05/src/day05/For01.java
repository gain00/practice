package day05;

public class For01 {
	public static void main(String[] args) {
		//1+2+3+....+9+10=55
		
		int x,y=0;
		
		for(x=1; x<=10; x++) {
			y+=x;
			if(x<10) {
				System.out.print(x+"+");
				
			}else {
				System.out.println(x+"="+y);
			}
		}
	}
}
