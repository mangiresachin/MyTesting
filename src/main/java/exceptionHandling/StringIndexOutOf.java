package exceptionHandling;

public class StringIndexOutOf {

	public static void main(String[] args) {
		// StringIndexOutOfBoundException Study
		
		String name = "Velocity" ;
//		name.charAt(9);  // StringIndexOutOfBoundsException: String index out of range: 9
		
		try {
			name.charAt(9);
		} catch (StringIndexOutOfBoundsException e) {
		System.out.println("Enter Character Argument in Between 0-7");
		}
		System.out.println("Hi All WelCome !!!!");
	}
	
}
