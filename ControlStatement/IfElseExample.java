import java.util.Scanner;

public class IfElseExample {

//	syntax: if(condition){
//        -----------
//        -----------
//          }else{
//        -----------
//        -------------         
//         }

//condition is in boolean value


public static void main(String[] args) {
	
	System.out.println("Enter age :- ");
	Scanner sc = new Scanner(System.in);
	
	int age = sc.nextInt();
	
	if(age>18) {
		System.out.println("You are Eligible For Voting");
	}
//	System.out.println("Thank You");
//	we can not use any line in between if and else condition
	else {
		System.out.println("You are not eligible for Voting");
	}
	System.out.println("welcome >>>>");
}

}

