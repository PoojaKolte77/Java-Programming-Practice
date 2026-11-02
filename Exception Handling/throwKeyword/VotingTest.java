package throwKeyword;

import java.util.Scanner;

public class VotingTest {

	public void vote(int age) {
		
		if(age>18) {
			System.out.println("You are eligible for voting");
		}
		else {
//			System.out.println("You are not eligible for voting");
			throw new VotingNotSupportedException("You are not eligible for voting");

		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter age");
		Scanner sc = new Scanner(System.in);
		int userAge = sc.nextInt();
		VotingTest votingTest = new VotingTest();
		votingTest.vote(userAge);
	}
}
