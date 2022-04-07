package exceptionHandling;

public class NullPointExcep {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// NullPointerException
		
		String name = null ;
//		name.charAt(0);     //Risky Code Shows NullPointerException
		
		try {
			name.charAt(0);
		} catch (Exception e) {
			System.out.println("No Actions Taken if Value is NULL");
		}
		
		System.out.println("Hi All WelCome !!!");
	}

}
