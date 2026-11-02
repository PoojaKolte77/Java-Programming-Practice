public class NestedIfExample {
	
	public static void main(String[] args) {
		
		int a = 60;
		int b = 50;
		int c = 30;
		
		if (a>b) {
			if(a>c) {
				System.out.println("maximum: "+a);
			}
			else {
				System.out.println("maximum: "+c);
			}
		}
		else {
		 if(b>c)
		 {
			 System.out.println("maximum: "+b);
		 }
		 else {
			 System.out.println("maximum: "+c);
		 }
			
			
	} 
		
	}
	
}
