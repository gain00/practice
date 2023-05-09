package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PhoneReader {
	public static void main(String[] args) {
		File phone = new File("C:\\Temp\\phone.txt");
		
		try {
			int c;
			FileReader fileReader = new FileReader(phone);
			while((c=fileReader.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
