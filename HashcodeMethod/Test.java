public class Test {
	
	int id;


	
	public int hashCode() {
		return id;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.id=60;
		Test t1 = new Test();
		t1.id=61;
		System.out.println(t);
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
	}
    
}