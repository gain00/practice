package day10;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferdTest {
	public static void main(String[] args) {
		FileReader fileReader;
		int c;
		try {
			fileReader = new FileReader("C:\\Temp\\test.txt");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out, 1);
			
			while((c=fileReader.read())!=-1) {
				bufferedOutputStream.write(c);
				
			}
			//bufferedOutputStream.flush();//버퍼가다찼을때
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
