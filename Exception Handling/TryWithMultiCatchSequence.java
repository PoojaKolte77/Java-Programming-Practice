public class TryWithMultiCatchSequence {

public static void main(String[] args) {
		
		try
		{
		System.out.println("try block executed");
		System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
		System.out.println("catch block 1 executed");
		}
		catch(ArithmeticException e)
		{
		System.out.println("catch block 2 executed");
		}
		
		catch(Exception e)
		{
		System.out.println("catch block 3 executed");
		}
		
		finally
		{
		System.out.println("finally block executed");
	}
  }
}