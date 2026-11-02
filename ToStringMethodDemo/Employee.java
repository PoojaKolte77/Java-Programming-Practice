public class Employee {

  private int id;
  private String name;
  
//  public String toString() {
// 	  String s = "Akshay";
// 	  return s;
//  }
  
  @Override
  public String toString() {
  	return "id=" + id + ", name=" + name + "";
  }
  
  public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
	Integer i = new Integer(18);
	String s = new String("akki");
	Employee e = new Employee(10,"tushar");
	System.out.println(i); // 18
	System.out.println(s); // akki
	System.out.println(e); // Akshay // 10 , tushar
	System.out.println(e.toString()); // Akshay // 10, tushar
  System.out.println(e.hashCode());
    System.out.println(i.hashCode()); // 18
    System.out.println(s.hashCode()); // akki
}
  
}

