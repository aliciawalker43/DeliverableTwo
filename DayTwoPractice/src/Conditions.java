
public class Conditions {
	
	public static void main (String[] args) {
		
		int numStudents = 8;
		int numSpotsInClass = 10;
		
		if ( numStudents > numSpotsInClass) {
			System.out.println("You cannot join!"); 
		}
		
		else if ((numStudents < numSpotsInClass) && (numStudents == 8)) {
			System.out.println("You can join the class :-)");
		}
		
		else {
			System.out.println("Class is full!");
		}
		
		
	}

}
