package day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PhoneBufferReader {
	public static void main(String[] args) {
		File phone = new File("C:\\Temp\\phone.txt");
		FileReader fileReader;
		try {
			fileReader = new FileReader(phone);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while(true) {
				String line = bufferedReader.readLine();
				if(line == null) break;
				System.out.print(line+"\r\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
