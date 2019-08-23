package guessinggame;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guessing Game");
		System.out.println("Make a guess!");
		
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		if (guess==7) {
			System.out.println("You win!!!");
		}else if (guess==0) {
				System.out.println("You have two guesses");
		}else {
			System.out.println("You lose!");
		}
		
		
		}
		
		
	}


