package day05;

public class Score {
	public static void main(String[] args) {
		double scoreList[][]= {{4.45,4.36},{2.35,4.6},{2.43,1.45},{4.1,4.5}};
		//4년 학점 평균 구해보기
		double average=0;
		for(int aver=0; aver<scoreList.length; aver++) {
			for(int aver2=0; aver2<scoreList[aver2].length; aver2++) {
				average+=scoreList[aver][aver2];
			}
		}
		System.out.println(average/(scoreList.length*scoreList[0].length));
		
	}
}
