package methodOverloading;



public class AutomaticPromotion {

	
    public void add (float a,long b) {
		System.out.println("2:"+(a+b));
	}
    public void add (long a,double b,float c) {
		System.out.println("3:"+(a+b+c));
	}
    public void add (int a,long b,double c) {
    	System.out.println("4:"+(a+b+c));
   	}
    public void add (int a,double b) {
		System.out.println("5:"+(a+b));
	}
    public void add (int a,long b) {
		System.out.println("6:"+(a+b));
	}
    public void add (double a,int b) {
		System.out.println("1:"+(a+b));
	}
    
    public static void main(String[] args) {
	
        AutomaticPromotion t = new AutomaticPromotion();
	//	t.add(12, 15);      // 6 1
		t.add(17l, 15,23);  // 3 4
		t.add(45,77l);     //  6 2
		//t.add(19,12l,13);   // 4 3
	}

	
}