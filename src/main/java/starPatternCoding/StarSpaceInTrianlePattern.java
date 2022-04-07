package starPatternCoding;

public class StarSpaceInTrianlePattern {

	public static void main(String[] args) {
		// USing Space & Star

		int Space = 0;
		int Star    = 5;
		
		for (int i = 1 ; i<=5 ; i++) {                            //OuterLoop for Row
			
			for (int j = 1 ; j<=Space ; j++) {               // To Print Space
				System.out.print(" ");
			}
			for (int k=1 ; k<=Star ; k++) {                  // To Print Star
				System.out.print("*");
			}
			System.out.println();
			Space++;
			Star--;
		}
		
	}
	
}
