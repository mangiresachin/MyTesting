package starPatternCoding;

public class StarSpaceInvertedTrianglePattern {

	public static void main(String[] args) {
		// Using Initializing Star variable
		
		int Star = 5  ;                                   // if rightAngleTriangle then Star = 1
		
		for ( int i=1 ; i<=5 ; i++ ) {
			
			for( int j=1 ; j<=Star ; j++ ) {
				System.out.print( "* " );
			}
			System.out.println( );
			Star--;                                         // Star must be inceremental Star++
		}

	}

}
