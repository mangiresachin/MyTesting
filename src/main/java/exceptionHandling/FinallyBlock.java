package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// FinallyBlock Study
		
		String name = "Velocity" ;
//		name.charAt(9) ; 
		
		try {
			name.charAt(9) ; 
		} catch (Exception e) {
			System.out.println("Enter Character Argument between 0-7");
		}
		finally {
			
			System.out.println("finaly run");
		}

	}

}
