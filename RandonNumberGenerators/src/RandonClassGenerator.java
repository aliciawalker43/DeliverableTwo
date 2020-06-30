import java.util.Random;

public class RandonClassGenerator {
	
	public static void main ( String[] args ) {
		
		int ourRando;
		Random rand = new Random();
		
		ourRando = rand.nextInt(6) + 1;
		
		System.out.println(ourRando);
	}

}
