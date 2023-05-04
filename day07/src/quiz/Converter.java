package quiz;

import java.util.Scanner;

public abstract class Converter {
	abstract public double convert(double src);//바꿔주기
	abstract public String srcString();
	abstract public String destString();
	protected double ratio=1200;
	public double ratio2;
	
	public void converting() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString()+"을"+destString()+"로바꾸어줍니다");
		System.out.println(srcString()+"을 입력하세요");
		double inputValue = scanner.nextDouble();
		double result = Math.round(convert(inputValue)*100);
		System.out.println("변환결과:"+result/100+destString()+"입니다");
	
	}

}
