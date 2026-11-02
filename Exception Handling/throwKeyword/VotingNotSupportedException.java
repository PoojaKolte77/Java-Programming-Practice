package throwKeyword;

public class VotingNotSupportedException extends RuntimeException{

	VotingNotSupportedException(String msg){
		System.out.println(msg);
	}
}