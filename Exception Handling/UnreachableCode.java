public class UnreachableCode {

public static void main(String[] args) {
		
		try
		{
		System.out.println("try block executed");
		}
//		System.out.println("Hello");
		catch(ArithmeticException e)
		{
		System.out.println("catch block executed");
		}
//		System.out.println("Hello");
		finally
		{
		System.out.println("finally block executed");
	}
}
}