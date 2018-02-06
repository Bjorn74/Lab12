import java.util.Random;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variables
		UserPlayer player1 = new UserPlayer();
		int userChoice;
		int compChoice;
		char userCont = 'y';

		System.out.println("Thanks for playing Rock, Paper, Scissors, Lizard, Spock.");
		System.out.println();

		while (userCont == 'y') {
			Random random = new Random();
			int compPlayer = random.nextInt(8);
			if (compPlayer == 4) {
				RockPlayer rocky = new RockPlayer();
				System.out.println();
				System.out.println("You are playing against Rocky. Good Luck.");
				System.out.println();
				player1.setRoshamboValue();
				userChoice = player1.getRoshamboValue();
				System.out.println(rocky.toString());
				System.out.println(player1.toString());
				System.out.println();
				System.out.println(theDecider(userChoice, 0));

			} else {
				RandomPlayer computer = new RandomPlayer();
				computer.giveName();
				System.out.println("You are playing against " + computer.getName() + ". Good Luck.");
				System.out.println();
				player1.setRoshamboValue();
				userChoice = player1.getRoshamboValue();
				computer.setRoshamboValue();
				compChoice = computer.getRoshamboValue();
				System.out.println(computer.toString());
				System.out.println(player1.toString());
				System.out.println();

				System.out.println(theDecider(userChoice, compChoice));
			}

			userCont = Validator.getChar(scan, "Would you like to continue? (y/n)");

		}
		System.out.println();
		System.out.println("Thank you for playing our game.\nDon't forget to be awesome!");
		scan.close();
	}

	public static String theDecider(int player, int computer) {

		String returnText = "Don't make me pull over.";
		if (player == computer) {
			returnText = "Tie. Try again.";
		}
		switch (player) {
		case 0:
			if (computer == 1) {
				returnText = "Paper covers Rock. You lose.";
			}
			if (computer == 2) {
				returnText = "Rock crushes Scissors, as it always has. You win.";
			}
			if (computer == 3) {
				returnText = "Rock crushes Lizard. You win.";
			}
			if (computer == 4) {
				returnText = "Spock vaporizes Rock. You lose.";
			}
			break;
		case 1:
			if (computer == 0) {
				returnText = "Paper covers Rock. You win.";
			}
			if (computer == 2) {
				returnText = "Scissors cut Paper. You lose.";
			}
			if (computer == 3) {
				returnText = "Lizard eats Paper. You lose.";
			}
			if (computer == 4) {
				returnText = "Paper disproves Spock. You win.";
			}
			break;
		case 2:
			if (computer == 0) {
				returnText = "Rock crushes Scissors, as it always has. You lose.";
			}
			if (computer == 1) {
				returnText = "Scissors cut Paper. You win.";
			}
			if (computer == 3) {
				returnText = "Scissors decapitate Lizard. You win.";
			}
			if (computer == 4) {
				returnText = "Spock smashes Scissors. You lose.";
			}
			break;
		case 3:
			if (computer == 0) {
				returnText = "Rock smashes Lizard. You lose.";
			}
			if (computer == 1) {
				returnText = "Lizard eats Paper. You win.";
			}
			if (computer == 2) {
				returnText = "Scissors decapitate Lizard. You lose.";
			}
			if (computer == 4) {
				returnText = "Lizard poisons Spock. You win.";
			}
			break;
		case 4:
			if (computer == 0) {
				returnText = "Spock vaporizes Rock. You win.";
			}
			if (computer == 1) {
				returnText = "Paper disproves Spock. You lose.";
			}
			if (computer == 2) {
				returnText = "Spock smashes Scissors. You win.";
			}
			if (computer == 3) {
				returnText = "Lizard poisons Spock. You lose.";
			}
			break;
		default:
			break;
		}

		return returnText;
	}

}
