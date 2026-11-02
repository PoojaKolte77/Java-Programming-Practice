package throwsKeyword;

public class ThrowsExceptionPropogation {

	public static void main(String[] args) throws InterruptedException{
		doStuff();
		}
		public static void doStuff() throws InterruptedException{
		doMoreStuff();
		}
		public static void doMoreStuff() throws InterruptedException{
		Thread.sleep(5000);
		}
		
//		In the above program if we are removing at least one
//		throws keyword then the program won't compile.
		
}
