package com.riz.sample;

import java.util.Scanner;

class Guesser {

	int guessNum;
	boolean inRange = false;

	int getGuessNumber() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Guesser !, Guess the Number between 1 and 10 :");
		guessNum = scanner.nextInt();

		if (!checkRange(guessNum)) {
			getGuessNumber();
		}
		return guessNum;

	}

	private boolean checkRange(int guessedNumber) {

		if (guessedNumber > 0 && guessedNumber <= 10) {
			inRange = true;
		} else {
			System.out.println("Number not in Range, Try another Number");
		}

		return inRange;

	}

}

class Player {

	int guessNum;
	boolean inRange = false;

	int getGuessNumber(int i) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Player" + i + "!, Guess the Number :");
		guessNum = scanner.nextInt();
		if (!checkRange(guessNum)) {
			getGuessNumber(i);
		}
		return guessNum;
	}

	private boolean checkRange(int guessedNumber) {

		if (guessedNumber > 0 && guessedNumber <= 10) {
			inRange = true;
		} else {
			System.out.println("Number not in Range, Try another Number");
		}

		return inRange;

	}
}

class Umpire {

	int numFromGuesser;
	int numFromPlayer[];
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	boolean inRange = false;

	void getNumberFromGuesser() {
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.getGuessNumber();
		
	}

	int getNumberFromPlayers(int i) {

		Player player = new Player();

		numFromPlayer1 = player.getGuessNumber(i + 1);

		return numFromPlayer1;

	}

	/*
	 * void compare() {
	 * 
	 * if (numFromGuesser == numFromPlayer1) { if (numFromGuesser == numFromPlayer2
	 * && numFromGuesser == numFromPlayer3) {
	 * System.out.println("All players guessed the Number"); } else if
	 * (numFromGuesser == numFromPlayer2) {
	 * System.out.println("Player 1 & 2 guessed the Number"); } else if
	 * (numFromGuesser == numFromPlayer3) {
	 * System.out.println("Player 1 & 3 guessed the Number"); } else {
	 * System.out.println("Player 1 guessed the Number"); } } else if
	 * (numFromGuesser == numFromPlayer2) { if (numFromGuesser == numFromPlayer3) {
	 * System.out.println("Player 2 & 3 guessed the Number"); } else {
	 * System.out.println("Player 2 guessed the Number"); } } else if
	 * (numFromGuesser == numFromPlayer3) {
	 * System.out.println("Player 3 guessed the Number"); } else {
	 * System.out.println("No players guessed the number"); }
	 * 
	 * }
	 */
	public boolean doPlayAgain() {
		boolean playAgain = true;
		System.out.println("Would you want to play the game again ? Press 'Yes' or 'No' !");

		Scanner scan = new Scanner(System.in);
		String play = scan.nextLine();

		if (play.equalsIgnoreCase("Yes")) {
			playAgain = true;
		} else {

			System.out.println("Thank you ! Have a nice day");
			playAgain = false;
		}
		System.out.println("================================================");
		return playAgain;
	}

	public int getNumberOfPlayers() {
		System.out.println("How many players to play the game?");
		Scanner scan = new Scanner(System.in);
		int numOfPlayers = scan.nextInt();
		return numOfPlayers;
	}

	public void compare(int[] numberFromPlayers) {
		int count = 0;
		for (int i = 0; i < numberFromPlayers.length; i++) {

			if (numberFromPlayers[i] == numFromGuesser) {
				count++;
				System.out.println("Player " + (i + 1) + " guessed the number correctly");
			}

		}
		if (count == 0) {
			System.out.println("No one guessed correctly !!");
		}

	}
}

public class GuesserGame {

	public static void main(String args[]) {
		boolean playAgain = true;

		Umpire umpire = new Umpire();
		while (playAgain) {

			umpire.getNumberFromGuesser();
			int numOfPlayers = umpire.getNumberOfPlayers();
			int array[] = new int[numOfPlayers];
			for (int i = 0; i < numOfPlayers; i++) {

				array[i] = umpire.getNumberFromPlayers(i);
			}

			umpire.compare(array);
			System.out.println();
			playAgain = umpire.doPlayAgain();
		}

	}

}
