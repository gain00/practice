package day06;

import java.util.Scanner;

public class Lotto {
	//Math.Random()*45로 범위
	double lot;
	
	public Lotto(int a) {
		
		for(int b=0; b<a; b++) {
			int lotto[] = new int[6];
			for(int c =0; c<lotto.length; c++) {
				if(c<lotto.length-1) {
					lotto[c] = (int)(Math.random()*45);
					System.out.print(lotto[c]+",");
				}else {
					lotto[c] = (int)(Math.random()*45);
					System.out.print(lotto[c]);
				}
				
			}
			System.out.println();
			
		}
	}
	
}
