import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;


class ElectionData implements IElectionData{
	
 private LinkedList<String> ballot = new LinkedList<String>();
 private HashMap<String,Integer> firstChoice = new HashMap<String,Integer>();
 private HashMap<String,Integer> secondChoice = new HashMap<String,Integer>();
 private HashMap<String,Integer> thirdChoice = new HashMap<String,Integer>();
 private Scanner keyboard = new Scanner(System.in);
  ElectionData() {
    this.ballot.add("Gompei");
    this.ballot.add("Husky");
    this.ballot.add("John Cena");
  }
  
  LinkedList<String> getBallot(){
	  return this.ballot;
  }
  
  HashMap<String,Integer> getFirstChoice(){
	  return this.firstChoice;
  }
  
  HashMap<String,Integer> getSecondChoice(){
	  return this.secondChoice;
  }
  
  HashMap<String,Integer> getThirdChoice(){
	  return this.thirdChoice;
  }
  public void printBallot() {
    System.out.println("The candidates are ");
    for (String s : ballot) {
      System.out.println(s);
    }
  }
  
  public void processVote(String first, String second, String third) 
		  throws DuplicateVotesException, UnknownCandidateException{
	  
	  if(! (ballot.contains(first))){
		  throw new UnknownCandidateException(first);
	  }
	  
	  if(! (ballot.contains(second))){
		  throw new UnknownCandidateException(second);
	  }
	  
	  if(! (ballot.contains(third))){
		  throw new UnknownCandidateException(third);
	  }
	  
	 if(first.equals(second)) {
		 throw new DuplicateVotesException(first);
	 }
	 if(first.equals(third)) {
		 throw new DuplicateVotesException(first);
	 }
	 if(second.equals(third)) {
		 throw new DuplicateVotesException(second);
	 }
	  //Vote aVote = new Vote(first, second, third);
	  firstChoice.replace(first, firstChoice.get(first) + 1);
	  secondChoice.replace(second, secondChoice.get(second) + 1);
	  thirdChoice.replace(third, thirdChoice.get(third) + 1);
  }
  
  public void addCandidate(String candidate) throws CandidateExistsException{
	  if (ballot.contains(candidate)){
		  throw new CandidateExistsException(candidate);
	  }
	  else {
		  ballot.add(candidate);
		  firstChoice.put(candidate, 0);
		  secondChoice.put(candidate, 0);
		  thirdChoice.put(candidate, 0);
	  }
  }
  
  public String findWinnerMostPoints() {
	  int currentTotal = 0;
	  String winner = "none";
	  for(String s: ballot) {
		  int total = firstChoice.get(s) * 3 + secondChoice.get(s) * 2 + thirdChoice.get(s);
		  if (currentTotal < total) {
			  winner = s;
		  }
	  }
	  return winner;
  }
  
  public String findWinnerMostFirstVotes() {
	  int total = 0;
	  String winner = "Runoff required";
	  for(String s: ballot) {
		  total = firstChoice.get(s) + total;
	  }
	  for(String s: ballot) {
		  if(firstChoice.get(s) >= total/2) {
			  winner = s;
		  }
	  }
	  return (winner);
  }
  
  public void screen() throws DuplicateVotesException, UnknownCandidateException {
    this.printBallot();
    System.out.println("Who do you want to vote for as first choice?");
    String candidate = keyboard.next();
    System.out.println("Who do you want to vote for as second choice?");
    String candidate1 = keyboard.next();
    System.out.println("Who do you want to vote for as third choice?");
    String candidate2 = keyboard.next();
    try {
    	this.processVote(candidate, candidate1, candidate2);
        System.out.println("You voted for " + candidate + ", " + candidate1 + ", and " + candidate2);
    }catch(UnknownCandidateException ex){
    	System.out.println("The candidate " + ex.getName() + " is not on the ballot");
    	
    }catch(DuplicateVotesException ex) {
    	System.out.println("You voted for  " + ex.getName() + " twice, which is not possible");

    }
   }


  
  }