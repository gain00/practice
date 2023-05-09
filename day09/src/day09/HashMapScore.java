package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScore {
	public static void main(String[] args) {
		HashMap<String, Integer> score = new HashMap<>();//해시맵 객체만 타입으로 선언가능
		score.put("정진영", 85);
		score.put("이정재", 31);
		score.put("장은진", 45);
		score.put("김영택", 22);
		score.put("이하늘", 222);
		score.put("이하늘", 13);//키값이 같으면 하나만 
		
		
		Set<String> keyList = score.keySet();
		Iterator<String> it = keyList.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while(it.hasNext()){
			String name = it.next();
			int num = score.get(name);
			System.out.println(name+":"+num);
			
		}
		
		
		
		
		
	}
}
