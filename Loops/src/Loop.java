
public class Loop {
	
	public static void main (String[] args) {
		
		int loopDriver = 4;
		
		while (loopDriver < 7) {
			System.out.println( "Looping...");
			loopDriver++;
		}
		
		for( int i = 4; i < loopDriver; i++) {
			System.out.println("Looping again...");
		}
		
	}

}
