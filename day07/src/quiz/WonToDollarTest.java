package quiz;

public class WonToDollarTest {
public static void main(String[] args) {
	WonTOYuan yuanConverter = new WonTOYuan(51);
	yuanConverter.converting();
	WonToDollar dollarConverter = new WonToDollar(1330);
	dollarConverter.converting();
	WonToEuro EuroConverter = new WonToEuro(1475);
	EuroConverter.converting();
	
}
}
