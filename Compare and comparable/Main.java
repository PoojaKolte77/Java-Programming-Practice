import java.util.Arrays;
import java.util.Comparator;

public class Main {
    

    public static void main(String[] args) {
     int arr[] = {2, 1, 3};
     java.util.Arrays.sort(arr);
     System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

     Employee[] emp1 = new Employee[3];
     emp1[0] = new Employee(1, "John Doe");
     emp1[1] = new Employee(2, "Jane Smith");
     emp1[2] = new Employee(3, "Bob Johnson");

     Arrays.sort(emp1, Employee.nameComparator);
     System.out.println("Sorted employees: "+ Arrays.toString(emp1));

    }

  
    }

