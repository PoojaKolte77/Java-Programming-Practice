public class Variables {
    
     static String company = "Fujitsu"; // Static variable

      int salary = 50000; // Instance variable

    public static void main(String[] args) {

        int age = 30; // Local variable
        String name = "Employee";

        Variables emp = new Variables();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Company: " + company);
    }
}
