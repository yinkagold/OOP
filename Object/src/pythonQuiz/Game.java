package pythonQuiz;

import java.util.Scanner;

public class Game {

	String player1;
	String player2;
	String date;
	String place;
	String result;

	/*public Game() {

	}

	public Game(String player1, String player2, String date, String place,
			String result) {
		this.player1 = player1;
		this.player2 = player2;
		this.date = date;
		this.place = place;
		this.result = result;
	}
*/
	@Override
	public String toString() {
		return "Game [player1=" + player1 + ", player2=" + player2 + ", date="
				+ date + ", place=" + place + ", result=" + result + "]";
	}

	public String search(String player1, String player2) {
		if (this.player1== player1 || this.player2 == player2)
			return toString();
		else
			return "Game not found";
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter player 1");
		String player1 = scan.next();
		System.out.println("Enter player 2");
		String player2 = scan.next();
		System.out.println("Enter Date");
		String date = scan.next();
		System.out.println("Enter Place");
		String place = scan.next();
		System.out.println("Enter result");
		String result = scan.next();
		
		
		Game game = new Game();
		game = new Game();
		System.out.println(game.toString());
		System.out.println();
		
	}

}
