

import java.util.Scanner;

public class IfExample {

//	if(condition){
//        -------------
//        -------------
//         }
//	condition is in boolean value

	
	public static void main(String[] args) {
		
		System.out.println("Enter age :- ");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("You are Eligible For Voting");
		}
		System.out.println("welcome >>>>");
	}
}
