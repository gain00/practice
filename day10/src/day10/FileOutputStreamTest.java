package day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		byte byteArray[]	= {7,51,3,4,-1,24};
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Temp\\test.out");
			for(int i = 0; i<byteArray.length;i++) {
					fileOutputStream.write(byteArray[i]);
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
}
