import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		System.out.print("Guess which will have more: heads or tails? ");
		Scanner userInputForGuess = new Scanner(System.in);
		String headsOrTailsGuess = userInputForGuess.nextLine();

		int correctCount = 0;

		System.out.print("How many times should we flip a coin? ");
		Scanner userInputForFlips = new Scanner(System.in);
		int numberOfFlips = Integer.valueOf(userInputForFlips.nextLine());
		System.out.println();

		for (int i = 1; i <= Integer.valueOf(numberOfFlips); i++) {
			int random = (int) (Math.random() * 2);
			String coinFlip = "";
			if (random == 1) {
				coinFlip = "heads";
				if (coinFlip.equals(headsOrTailsGuess)) {
					correctCount++;
				}
				System.out.println("heads");
			} else {
				coinFlip = "tails";
				if (coinFlip.equals(headsOrTailsGuess)) {
					correctCount++;
				}
				System.out.println("tails");
			}
		}
		System.out.println();
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");
		int percent = (correctCount * 100 / numberOfFlips);
		System.out.println("That's " + percent + "%.");
	}
}
