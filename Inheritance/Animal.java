import java.util.Scanner;

public class Animal {

    private String name;
    public void eat(){
 System.out.println("Enter Animal Name :- ");
	Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

        System.out.println("Animal is " + name);
    }
    
}
