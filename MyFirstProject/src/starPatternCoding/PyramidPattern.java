package starPatternCoding;

public class PyramidPattern {

	public static void main(String[] args) {
		// Pyramid USing Space & Star Variables
		
		int Space = 3 ;
		int Star    = 1 ;
		
		for (int i = 1 ; i<=4 ; i++) {
			for (int j = 1 ; j<= Space ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k<=Star ; k++) {
				System.out.print("*");
			}
			System.out.println();
			Space--;
			Star = Star + 2;
		}

	}

}
