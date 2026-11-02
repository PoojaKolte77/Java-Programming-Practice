public class WrapperDemo {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(100);
		Integer i1 = new Integer("10");
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i.equals(i1));
	}

}