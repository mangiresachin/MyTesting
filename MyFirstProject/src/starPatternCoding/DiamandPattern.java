package starPatternCoding;

public class DiamandPattern {

	public static void main(String[] args) {
		// Diamand Pattern
		
		int Space2 = 3 ;        //Note =  Space COunted from COnsole line
		int Star2    = 1 ;        // Note =Star prints after space
		
		for (int i = 1 ; i<=4 ; i++) {
			for (int j = 1 ; j<=Space2 ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k<=Star2 ; k++) {
				System.out.print("*");
			}
			System.out.println();
			Space2--;
			Star2 = Star2 +2 ;
		}
		
		int Space = 1 ;
		int Star    = 5 ;
		
		for (int i=1 ; i<=3 ; i++) {
			for (int j = 1 ; j<=Space ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k<= Star ; k++) {
				System.out.print("*");
			}
			System.out.println();
			Space ++;
			Star = Star-2;
		}

	}

}
