public class Student2 {

	private int rollno;
	private String name;
	 
	
	public Student2(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public static void main(String[] args) {
		Student2 s1 = new Student2(1,"tushar");
		Student2 s2 = new Student2(2,"akshay");
		Student2 s3 = new Student2(3,"sandeep");
		Student2 s7 =  new Student2(2, "akshay");
		Student2 s4 = s1;
		System.out.println(s1==s2); // false
		System.out.println(s1==s3); // false
		System.out.println(s1==s4); // true
		System.out.println(s2==s7); // false 
		int a=20;
		int b=a;
		int c= 30;
		int d= 50;
		int e= 30;
		System.out.println("variable comparision");
		System.out.println(a==b); 
		System.out.println(c==d);
		System.out.println(c==e);
		
	}
}