public class Student {
	
	private int studentId;
	private String studentName;
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentId=14;
		s.studentName="demo";
		System.out.println(s);
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	}