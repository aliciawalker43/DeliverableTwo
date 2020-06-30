import java.util.Random;
import java.util.Scanner;


public class Roshambo {
	
	public static void main(String[] args) {
		
		Random Rand = new Random();
		Scanner scan= new Scanner (System.in);
		
		String wantToPlay = "";
		String userInput = "";
		String computerInput;
		int compRand;
		int userWins = 0;
		int compWins = 0;
		int ties = 0;
		
		
		// Greet the user
		
		System.out.println("Welcome to our Roshambo Game !!");
		System.out.println("and welcome to your DEEEEMMMMIIIISSSEEE!!!!");
		
		// Ask if they want to play
		
		System.out.println(" Want to play? (Y) or (N)");
		wantToPlay = scan.nextLine();
		
		while ((wantToPlay.contains("Y")) || (wantToPlay.contains("y"))) {
		
		// Ask for user input 
		
		System.out.println("Ok, choose (R) for Rock, (P) for Paper, (S) for Scissor");
		userInput = scan.nextLine();
		
		System.out.println("Your Pick " + userInput);
		
		// Create computer's input
		
		compRand = Rand.nextInt(3);
		
		if (compRand == 0) {
			computerInput = "R";
		} else if ( compRand == 1) { 
			computerInput = "P";
		} else { 
				computerInput = "S";
		}
		System.out.println("The A.I. chose" + computerInput);
		
		
		// Show results ( wins, losses, ties )
		
		if (userInput.equalsIgnoreCase(computerInput)) {
			System.out.println("TIE GAME!");
			ties = ties + 1;
			
		} else if ((userInput.equalsIgnoreCase("R")) && (computerInput.equals("P"))) {
			System.out.println("You Lose!!");
			compWins ++;
		} else if ((userInput.equalsIgnoreCase("R")) && (computerInput.equals("S"))) {
			System.out.println("You Win!!");
			userWins ++;
		} else if ((userInput.equalsIgnoreCase("P")) && (computerInput.equals("S"))) {
			System.out.println("You Lose!!");
			compWins ++;
		} else if ((userInput.equalsIgnoreCase("P")) && (computerInput.equals("R"))) {
			System.out.println("You Win!!");
			userWins ++;
		} else if ((userInput.equalsIgnoreCase("S")) && (computerInput.equals("R"))) {
			System.out.println("You Lose!!");
			compWins ++;
		} else if ((userInput.equalsIgnoreCase("S")) && (computerInput.equals("P"))) {
			System.out.println("You Win!!");
			userWins ++;
	}
		System.out.println(" Want to play again? (Y) or (N)");
		wantToPlay = scan.nextLine();
		}
		System.out.println("Ok, user" + userWins + "A.I" + compWins + "ties" + ties);
		
		System.out.println("Ok, Thanks for visiting our game!");


}
}
	
	