package day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneWriter {
	public static void main(String[] args) {
		//전화번호부
		//Scanner scanner = new Scanner();
File file = new File("C:\\Temp\\phone.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			Scanner scanner = new Scanner(System.in);
			System.out.println("전화번호입력프로그램입니다");
			while(true) {
				System.out.println("이름 전화번호");
				String line = scanner.nextLine();
				if(line.equals("exit"))break;
				fileWriter.write(line);
				fileWriter.write("\r\n");
				
			}
			fileWriter.close();
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
