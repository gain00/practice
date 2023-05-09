package day09;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		//이름을 입력받아서 제일 긴 이름 출력해보기
		ArrayList<String> nameList =new ArrayList<>();
		nameList.add("토르");
		nameList.add("아이언맨");
		nameList.add("캡틴 아메리카");
		nameList.add("블랙 위도우fffffffffffffffffffffffffffffffffff");
		nameList.add("헐크");
		
		int longest = 0;
		
		for(int i = 0; i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		
		}
		for(int i =0; i<nameList.size();i++) {
			
			if(nameList.get(longest).length() < nameList.get(i).length()) {
				longest = i;
			};
			
		}
		System.out.println("가장 긴 이름은 "+nameList.get(longest));
		
		
	}
}
