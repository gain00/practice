package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class ImageCopy {
	public static void main(String[] args) {
		File originalImg = new File("C:\\\\Temp\\\\jun.jpg");
		File copyImg = new File("C:\\\\Temp\\\\jun_copy.jpg");//덮어쓰기
		byte buffer[] = new byte[1024];
		int c;
		try {
			FileInputStream fileInputStream = new FileInputStream(originalImg);
			FileOutputStream fileOutputStream = new FileOutputStream(copyImg);
		
			while((c = fileInputStream.read())!= -1) {
				fileOutputStream.write((byte)c);//이미지는 이진데이터이기때문에 int나더블보단 byte로 처리하는게 가장 효율적
			
			}
			fileInputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
