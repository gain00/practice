package quiz;

import java.util.Scanner;

//player vs Computer

class Player {
	private String name;
	private Scanner scanner = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int turn() {
		System.out.println(name + "[가위(1),바우(2),보(3),끝내기(4)]");
		return scanner.nextInt();
	}

}

class Computer extends Player {
	public Computer(String name) {
		super(name);
	}

	public int turn() {
		
		return ((int) (Math.random() * 3)) + 1;
	}

}

public class RockPaperScissors {
	public static void main(String[] args) {
		String rockPaperScissors[] = { "가위", "바위", "보" };
		Player me = new Player("성호");
		Computer computer = new Computer("슈퍼컴퓨터");

		while (true) {
			int playerChoice = me.turn();
			if (playerChoice == 4) {
				break;
			} else if (playerChoice != 1 && playerChoice != 2 && playerChoice != 3 && playerChoice != 4) {
				System.out.println("잘못된 숫자를 입력하였습니다 다시입력해주세요");
				continue;
			}
			System.out.println(me.getName() + rockPaperScissors[playerChoice - 1]);

			int computerChoice = computer.turn();
			
			System.out.println(computer.getName() + rockPaperScissors[computerChoice - 1]);
			if (playerChoice == computerChoice) {
				System.out.println("비겻음");

			} else if (playerChoice == 1 && computerChoice == 3) {
				System.out.println("이겼음");
			} else if (playerChoice == 2 && computerChoice == 1) {
				System.out.println("이겼음");
			} else if (playerChoice == 3 && computerChoice == 2) {
				System.out.println("이겼음");
			} else if (playerChoice == 3 && computerChoice == 1) {
				System.out.println("졌음");
			} else if (playerChoice == 1 && computerChoice == 2) {
				System.out.println("졌음");
			} else if (playerChoice == 2 && computerChoice == 3) {
				System.out.println("졌음");
			}
		}
	}
}
