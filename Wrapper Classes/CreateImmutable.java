public class CreateImmutable {

	private int i;
	
	CreateImmutable(int i){
		this.i=i;
	}
	
	public CreateImmutable modify(int i) {
		if(this.i==i) {
			return this;
		}
		else {
			return new CreateImmutable(i);
		}
	}
	
	public static void main(String[] args) {
		CreateImmutable c1 = new CreateImmutable(10); // object c1
		CreateImmutable c2 = c1.modify(100);  // new object 
		CreateImmutable c3 = c1.modify(10);   // reuse same object c1
		CreateImmutable c4 = c1.modify(100); // new object 
		System.out.println(c1==c2); // false
		System.out.println(c1==c3); // true
		System.out.println(c2==c4); // false
		
//		equals method : address (reference) check
//		System.out.println(c1.equals(c2)); // false
//		System.out.println(c1.equals(c3)); // true
//		System.out.println(c2.equals(c4)); // false
		
	}
	
}