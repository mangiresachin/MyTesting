package exceptionHandling;

public class ArithmeticExcep {

	public static void main(String[] args) {
		// Study ArithmeticException
		int a = 10 ;
		int b = 0 ;
//		int div = a/b ;         // Risky Code , Shows ArithmeticException
	
		try {
		int div = a/b ;     //Risky Code
		System.out.println(div);
	} catch (ArithmeticException e) {
		System.out.println(" Change the Value of b !!!!");
	}
		System.out.println("Hi EveryBody !!!");

	}

}
