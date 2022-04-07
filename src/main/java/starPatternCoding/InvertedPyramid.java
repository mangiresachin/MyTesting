package starPatternCoding;

public class InvertedPyramid {

	public static void main(String[] args) {
		// Inverted Pyramid
		
		int Space = 0 ;
		int Star    = 7 ;
		
		for (int i = 1 ; i <= 4 ; i++) {             //4 Rows
			for (int j = 1 ; j<=Space ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k<=Star ; k++ ) {
				System.out.print("*");
			}
			System.out.println();
			Space++;
			Star = Star - 2 ; 
		}
	}

}
