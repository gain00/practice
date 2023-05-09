package day09;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<String> nameList =new ArrayList<>();
		nameList.add("토르");
		nameList.add("아이언맨");
		nameList.add("캡틴 아메리카");
		nameList.add("블랙 위도우fffffffffffffffffffffffffffffffffff");
	
		
		
		Iterator<String> it = nameList.iterator();
		while(it.hasNext()) {
			System.out.println();
		}
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
	}
}
