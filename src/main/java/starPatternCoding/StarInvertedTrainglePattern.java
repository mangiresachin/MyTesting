package starPatternCoding;

public class StarInvertedTrainglePattern {

	public static void main(String[] args) {
		// Using Space & Star variable Declaration
		
		int Space = 4 ;
		int Star    = 1 ;
		
		for (int i = 1 ; i<=5 ; i++) {
			for (int j = 1 ; j<= Space ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k<=Star ; k++) {
				System.out.print("*");
			}
			System.out.println();
				Space--;
				Star++;
		}

	}

}
