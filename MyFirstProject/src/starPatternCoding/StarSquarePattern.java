package starPatternCoding;

public class StarSquarePattern {

	public static void main(String[] args) {
		// 5 Row 5Column Square
		// Outer for loop for ROW always (i)
		//Inner for loop for COLUMN always (j)
		
for (int i = 1 ; i<=5 ; i++) {
	
	for (int j = 1 ; j<=5 ; j++) {
			
			System.out.print("*   ");  // Remove ln from Println
		}
			System.out.println();   //To move next line
	}
 }
}
