package exceptions;

public class NotEligibleToVote extends Exception{
	public String getMessage() {
		return "Wait until you turn 18!!! stay calm";
	}
}
