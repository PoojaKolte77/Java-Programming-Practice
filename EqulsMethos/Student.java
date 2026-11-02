public class Student {
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"tushar");
		Student s2 = new Student(2,"akshay");
		Student s3=new Student(3,"sandeep");
		Student s7= new Student(2, "akshay");
		Student s4=s1; 
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equals(s4)); // true
		System.out.println(s2.equals(s7)); // false
		
		}
	}
