package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TextCopy {
	public static void main(String[] args) {
		File  original = new File("C:\\Windows\\system.ini");
		File copy = new File("C:\\Temp\\system.txt");
		int c;
		try {
			FileReader fileReader = new FileReader(original);
			FileWriter fileWriter = new FileWriter(copy);
			while((c= fileReader.read())!=-1) {
				fileWriter.write((char)c);
			}
			
			fileReader.close();
			fileWriter.close();
			System.out.println(original.getPath()+"를 "+copy.getPath()+"로복사");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
