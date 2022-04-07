package exceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// Use of MultipleCatchBlock Must have One try Block & Many CatchBlock
		
		int a = 10 ;
		int b = 0 ;
//		int div = a/b ;  // RiskyCode find out Run then compile shows line no. 
		try {
			int div = a/b ;
			System.out.println(div);
		} 
		catch (ArithmeticException e) {
			System.out.println("Change the Value of b");
		}
		
		catch (NullPointerException e) {
		System.out.println("No Actions Taken on NULL Value");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Enter Character Argument between 0-7 if Velocity");
		}
		catch (Exception e) {
			System.out.println("Number Never Divided By Zero");
		}
						
		System.out.println("Hi WelCome Here !!!!!!");
}

}
