package methodOverloading;

public class Test2 {

	public void add (int a,int b) {
		System.out.println("1:"+(a+b));
	}
    public void add (int a,long b) {
		System.out.println("2:"+(a+b));
	}
    public void add (int a,long b,int c) {
		System.out.println("3:"+(a+b+c));
	}
    public void add (long a,long b,int c) {
    	System.out.println("4:"+(a+b+c));
   	}
    
    public static void main(String[] args) {
		Test2 t = new Test2();
		t.add(12, 15);      // 1
		t.add(17l, 15,23);  // 4
		t.add(45, 77l);     // 2
		t.add(19,12l,13);   // 3
	}
}
