public class ReturnStatement1 {
	
//	return Vs finally:
//	Even though return statement present in try or 
//    catch blocks first finally will be executed
//	and after that only return statement will be considered. i.e finally block dominates
//	return statement.

	public static void main(String[] args) {
		System.out.println(check());
	}
	public static int check() {
		
		try {
			System.out.println(10/0);
			return 111;
		}
		catch(ArithmeticException e){
			return 222;
		}
		finally {
			return 333;
		}
		
	}
}