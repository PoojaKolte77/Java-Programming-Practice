public class Student1 {
	
	private int rollno;
	private String name;
	
	public Student1(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public boolean equals(Object obj)
	 {
	 try{
	 String name1=this.name;
	 int rollno1=this.rollno;
	 Student1 s2=(Student1)obj;
	 String name2=s2.name;
	 int rollno2=s2.rollno;
	 if(name1.equals(name2) && rollno1==rollno2)
	 {
	 return true;
	 }
	 else return false;
	 }
	 catch(ClassCastException e)
	 {
	 return false;
	 }
	 catch(NullPointerException e)
	 {
	 return false;
	 }
	 
	 }
	public static void main(String[] args) {
		Student1 s1 = new Student1(1,"tushar");
		Student1 s2 = new Student1(2,"akshay");
		Student1 s3 =  new Student1(3,"sandeep");
		Student1 s7 =  new Student1(2, "akshay");
		Student1 s4 = s1;
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equals(s4)); // true
		System.out.println(s2.equals(s7)); // true
		
		}
}
