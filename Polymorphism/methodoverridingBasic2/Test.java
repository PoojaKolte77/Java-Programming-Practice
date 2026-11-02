package methodoverridingBasic2;

public class Test {

	public static void main(String[] args) {
		
		Sbi s = new Sbi();
		System.out.println("sbi"+s.getRateOfInterest());
		Icici i = new Icici();
		System.out.println("icici"+i.getRateOfInterest());
		Hdfc h = new Hdfc();
		System.out.println("hdfc"+h.getRateOfInterest());
		
	}
}
