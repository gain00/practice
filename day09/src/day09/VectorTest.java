package day09;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector <Integer>	vec = new Vector<>();
		vec.add(5);
		vec.add(3);
		//vec.add("aaa"); 들어갈 타입에 맞게
		vec.add(1);
		vec.add(1,100);//vec 1부분에 100을 끼워넣음
		System.out.println(vec.get(1));
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		for(int i = 0; i<vec.size(); i++) {
			int num = vec.get(i);
			System.out.print(num+",");
			
		}
		System.out.println();
		for( int num:vec) {
			System.out.print(num+",");
		}
		
		
	}
}
