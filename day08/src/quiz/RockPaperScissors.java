package quiz;

import java.util.Scanner;

//player vs Computer

class Player{
	private String name;
	private Scanner scanner = new Scanner(System.in);
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public int turn() {
		System.out.println(name+"[가위(1),바우(2),보(3),끝내기(4)]");
		return scanner.nextInt();
	}
	
}

class Computer extends Player{
	public Computer(String name) {
		super(name);
	}
	public int turn() {
		return (int) Math.random()*3+1;
	}
	
}

public class RockPaperScissors {
	public static void main(String[] args) {
		Player me = new Player("성호");
		System.out.println(me.getName());
		me.turn();
		Computer computer = new Computer("슈퍼컴퓨터");
		System.out.println(computer.getName());
		computer.turn();
	}
}
