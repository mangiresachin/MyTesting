package starPatternCoding;

public class StarTrainglePattern {

	public static void main(String[] args) {
		// Star RightAngle Triangle by Two Way
		//By Using for Loop & By initializing Star as variable
		
//				     int Star =1 ;
		for (int i = 1 ; i<=5 ; i++) {
			
			for (int j = 1 ; j<=i ; j++) {        // j<=Star
			
					System.out.print("* ");
					}
					System.out.println();
//					Star++;
			}
	}	
}
