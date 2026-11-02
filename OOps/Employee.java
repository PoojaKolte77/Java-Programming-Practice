import java.util.Scanner;


// Encapsulation Demo
 
public class Employee {

private int salary =50000;

public int getSalary(){
    
    return salary;
}


public static void main (String[] args){

    System.out.println("Enter Employee Id :- ");
	Scanner sc = new Scanner(System.in);
    int id = sc.nextInt();

    Employee emp = new Employee();
    System.out.println("Employee Salary: " + emp.getSalary());

}
    
}
