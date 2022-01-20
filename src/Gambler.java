import java.util.Random;
import java.util.Scanner;

public class Gambler {

		static void gamble(int noOfTimes, int $Stack, int $Goal) {
		int bets = 0; 
		int wins = 0; 

		
		for (int i = 0; i < noOfTimes; i++) {
			int cash = $Stack;

			while (cash > 0 && cash < $Goal) {
				bets++;

				if (Math.random() < 0.5)
					cash++; 
				else
					cash--; 
			}
			if (cash == $Goal)
				wins++; 
		}

	
		System.out.println();
		System.out.println(wins + " wins out of of " + noOfTimes);
		System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
		System.out.println("Percent of games lost = " + 100.0 * (noOfTimes - wins) / noOfTimes);
		System.out.println("Total bets in " + noOfTimes + " games = " + bets);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, $stack, $goal;
		System.out.println("enter stack amount");
		$stack = s.nextInt();
		System.out.println("enter goal amount");
		$goal = s.nextInt();
		System.out.println("enter no of times to gamble");
		n = s.nextInt();
		s.close();
		gamble(n, $stack, $goal);

	}
}