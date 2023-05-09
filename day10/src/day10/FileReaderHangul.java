package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderHangul {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Temp\\dion.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"Ms949");
			int c;
			while((c = inputStreamReader.read()) != -1) {//문자의 가장 마지막 -1
				System.out.print((char)c);
			}
		} catch (Exception e) {//모든 예외는 Exception으로 처리가능
			// TODO Auto-generated catch block
			e.printStackTrace();//발생한예외에대해 출력하는 클래스
		}
	}
}