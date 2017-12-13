import java.util.Scanner;

public class VotingMachine {
	
	private ElectionData Data;
	private Scanner keyboard = new Scanner(System.in);
	
	
//	VotingMachine(){
//		//this.Data = new ElectionData();
//	}
	
	  public void screen() throws DuplicateVotesException, UnknownCandidateException {
		    this.Data.printBallot();
		    System.out.println("Who do you want to vote for as first choice?");
		    String candidate = keyboard.next();
		    System.out.println("Who do you want to vote for as second choice?");
		    String candidate1 = keyboard.next();
		    System.out.println("Who do you want to vote for as third choice?");
		    String candidate2 = keyboard.next();
		    try {
		    	this.Data.processVote(candidate, candidate1, candidate2);
		        System.out.println("You voted for " + candidate + ", " + candidate1 + ", and " + candidate2);
		    }catch(UnknownCandidateException ex){
		    	System.out.println("The candidate " + ex.getName() + " is not on the ballot");
		    	
		    }catch(DuplicateVotesException ex) {
		    	System.out.println("You voted for  " + ex.getName() + " twice, which is not possible");

		    }
		   }

}
