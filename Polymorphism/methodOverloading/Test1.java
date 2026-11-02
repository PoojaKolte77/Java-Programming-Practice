
package methodOverloading;

public class Test1 {
	
	public void demo(int a) {
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
    public void demo(long b) {
		int a = 50;
		long c = a+b;
		System.out.println(c);
	}
    
    public static void main(String[] args) {
		
    	Test1 t = new Test1();
    	t.demo(10);
    	t.demo(10l);
//    	t.demo(30.0);
	}
	

}
