package day05;

public class Array02 {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 5, 6, 8, 555, 67 };// 배열을 만들때는 변수에 ~s를 붙이거나 List를 붙인다
		System.out.println(nums.length);// 배열의 길이
		int total = nums.length;
		int sum = 0;
		for (int i = 0; i < total; i++) {
			sum += nums[i];

		}
		System.out.println(sum);
		System.out.println((double) sum / total);// 실수로 받고싶으면 형변환

		// for-each -> 기존 for문과 달리 요소수만큼 자동으로 반복된다
		int sum02 = 0;
		for (int j : nums) {
			sum02 += j;
		}
		System.out.println(sum02);

		String fruits[] = { "딸기", "사과", "복숭아", "키위" };
		for (String fruit : fruits) {
			System.out.print(fruit + ",");
		}
		// 2차원 배열
		int intArray[][] = new int[2][3];
		intArray[0][0] = 1;
		intArray[0][1] = 1;
		intArray[0][2] = 1;

		intArray[1][0] = 100;
		intArray[1][1] = 200;
		intArray[1][2] = 300;

//		intArray[2][0] = 1; 안나옴 배열은 0부터 시작
//		intArray[2][1] = 1;
//		intArray[2][2] = 1;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(intArray[i][j] + ",");
			}
		}
		String animals[] = { "강아지", "고양이", "사자", "랑이" };
		System.out.println(animals[1]);
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		for (String animal : animals) {
			System.out.println(animal);
		}

		// 3,5,6,7,8,14,37,64,87,90를 입력받았을때 3의배수만 출력
		int nums02[] = { 23, 45, 67, 78, 56, 3, 9, 12, 85, 889889 };

//		for (int i = 0; i < nums02.length; i++) {
//			if (nums02[i] % 3 == 0) {
//				System.out.println(nums02[i]);
//			}
//		}
		for (int j : nums02) {
			if(j % 3 == 0) {
				System.out.println(j);
			}
		}
	}
}
