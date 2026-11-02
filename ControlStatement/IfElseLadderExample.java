
import java.util.Scanner;
public class IfElseLadderExample {

	public static void main(String[] args) {
		
		System.out.println("Enter Your mark");
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		
		if(mark>100) {
			System.out.println("Invalid Data");
		}
		else if(mark>=80 && mark<=100) {
			System.out.println("You are Topper");
		}
		else if(mark>=60 && mark<80) {
			System.out.println("You are First class");
		}
		else if(mark>=40 && mark<60) {
			System.out.println("You are Second class");
		}
		else {
			System.out.println("You are Fail");
		}
		
		}
}


