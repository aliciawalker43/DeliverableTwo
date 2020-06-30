import java.util.Scanner;
import java.util.Random;

public class CoinToss {

	public static void main(String[] args) {
		
		Scanner scnr= new Scanner(System.in);
		Random rand= new Random();
		

		String headsOrTailsGuess;
		String wantToPlay;
		String compPick=("");
		int compGuess;
		float numberOfFlips=0;
		int heads=0;
		int tails=0;
		int x= 0;          //used in counter
		int correctCount=0;  // number of correct guesses
		
		
	
		
		//user input how many times to flip
		System.out.println(" How many times shall we flip a coin?");
		numberOfFlips=scnr.nextInt();
		
		
		
		//Ask user to pick
		System.out.println(" Guess which will have more: choose heads or tails?");
		headsOrTailsGuess= scnr.next();
		
	
		
		// repeat coin flips based on user input number of flips (Loop)
		for (int i =1; i < numberOfFlips; i++) {
		
			//System.out.println ("Computer picked " + heads+ " Heads and"  +tails+ " Tails! ");
			
			while ( numberOfFlips > x) {  // Random Results Counter
				x++;
				
			//Computer generates a pick
		 compGuess= rand.nextInt(2);
		 
		
			
		 
			if (compGuess== 0) { 
				System.out.println("Heads");
				heads ++; //counter
			} else {System.out.println ("Tails");
			    tails ++; //counter
			} 
			
			
	    
			
			if ((headsOrTailsGuess.equalsIgnoreCase("heads")) && (compGuess ==0)) {
			 correctCount++ ;
			 } else if ((headsOrTailsGuess.equalsIgnoreCase("Tails")) && (compGuess ==1)) {
				 correctCount ++;}
			 }
			
			 
			 }
			
			System.out.print(" Your guess " + headsOrTailsGuess + " came up " + correctCount + " time(s)!");
			
			System.out.print (" You won " + (correctCount/ numberOfFlips * 100) + "% of Flips!");
			 
				 
		  }
		
		}

	
		

		
	 
		
    
		
  


			
		
		
		
		
	
		
		
	


