package day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		//예외처리
		try {
			FileReader fileReader = new FileReader("C:\\Windows\\system.ini");
			int c;
			try {
				while((c = fileReader.read())!= -1) {
					System.out.print((char)c);
				}	
				fileReader.close();
			}catch(IOException e) {
				System.out.println("입출력오류");
			}
			
			
			//여기 밑에있는 코드를 실행
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("입출력오류");
		}
	}
}
