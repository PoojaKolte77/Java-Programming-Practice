import java.util.Scanner;

public class SwitchExample {
	
//	syntax: switch(choice){
//
//    case 1:
//          break;
//    case 2:
//          break;
//    case 3:
//         break;
//    case 4: 
//         break;
//      default:
//    }


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two value");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter 1 :- Addition");
		System.out.println("Enter 2 :- Substraction");
		System.out.println("Enter 3 :- multiply");
		System.out.println("Enter 4 :- division");
		System.out.println("Enter 5 :- modulas");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : System.out.println("addition:- "+(a+b));
		         break;
			
		case 2 : System.out.println("substraction:- "+(a-b));
                 break;
			
		case 3 :  System.out.println("multiply:- "+(a*b));
                  break;
			
		case 4 : System.out.println("division:- "+(a/b));
                 break;
			
		case 5 : System.out.println("modulas:- "+(a%b));
                 break;
                 
                 default : System.out.println("Thank You !!!");
			     break; // optional
			
		}
	}
}