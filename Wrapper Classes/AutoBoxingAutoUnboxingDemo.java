public class AutoBoxingAutoUnboxingDemo {

//	Until 1.4 version we can't provide wrapper object in the place of primitive and primitive
//	in the place of wrapper object all the required conversions should be performed
//	explicitly by the programmer.
	
	static Integer I = 0;
	public static void main(String[] args) {
		int i = I;
		System.out.println(i);
	}
	
	
}