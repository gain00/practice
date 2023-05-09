package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputstreamTest {
	public static void main(String[] args) {
		byte byteArray[]= new byte[6];
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Temp\\test.png");
			int num =0;
			int c;
			while((c=fileInputStream.read())!=-1) {
				byteArray[num] = (byte)c;
				num++;
				
			}
			for(int i=0; i<byteArray.length; i++) {
				System.out.println(byteArray[i]+" ");
			}
			fileInputStream.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
