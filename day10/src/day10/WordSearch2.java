package day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class WordSearch2 {
	public static void main(String[] args) {
		// 단어를 입력하면 해당하는 단어 찾아주기 word에서
		// words.txt파일을 읽어서 어레이나 백터에 넣어야한다
		// ArrayList에 집어 넣는거 해보기....
		
		File word = new File("C:\\Temp\\words.txt");
		
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			FileReader fileReader = new FileReader(word);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while(true) {
				String a = bufferedReader.readLine();
				if(a == null)break;
				arrayList.add(a);
			}
			bufferedReader.close();
			while(true) {
				System.out.println("단어를 입력하면 해당단어를 찾아줍니다");
				String b = scanner.nextLine();
				if(b.equals("그만")) break;
				for(int i = 0; i<arrayList.size(); i++) {
					String words = arrayList.get(i);
					if(b.length()>words.length()) continue;
					
				}
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
