package day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class WordSearcch {
	public static void main(String[] args) {
		// 단어를 입력하면 해당하는 단어 찾아주기 word에서
		// words.txt파일을 읽어서 어레이나 백터에 넣어야한다
		// vector에 집어 넣는거 해보기....
		File file = new File("C:\\Temp\\words.txt");// 외부경로 읽어오기
		Vector<String> wordList = new Vector<>();
		Scanner scanner = new Scanner(System.in);

		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader wordReader = new BufferedReader(fileReader);//한줄씩 읽어오기

			while (true) {
				String line = wordReader.readLine();//한줄읽기는 버퍼리더밖에 지원안함
				if (line == null)break;
				wordList.add(line);
			}
			wordReader.close();//입력끝
			while(true) {
				System.out.println("단어를 입력하세요>>>");
				String searchWord = scanner.nextLine();
				if(searchWord.equals("그만")) break;
				for(int i=0;i<wordList.size();i++) {
					String word = wordList.get(i);
					
					if(word.length()<searchWord.length()) continue;
					String frontWord=word.substring(0,searchWord.length());
					if(searchWord.equals(frontWord)) {
						System.out.println(word);
					}
					
				}
			}
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
