import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;


class ElectionData {
	
  LinkedList<String> ballot = new LinkedList<String>();
  HashMap<String,Integer> firstChoice = new HashMap<String,Integer>();
  HashMap<String,Integer> secondChoice = new HashMap<String,Integer>();
  HashMap<String,Integer> thirdChoice = new HashMap<String,Integer>();
  Scanner keyboard = new Scanner(System.in);
  
  ElectionData() {
    this.ballot.add("Gompei");
    this.ballot.add("Husky");
    this.ballot.add("John Cena");
  }
  
  public void printBallot() {
    System.out.println("The candidates are ");
    for (String s : ballot) {
      System.out.println(s);
    }
  }
  
  public void processVote(String first, String second, String third) {
	  //Vote aVote = new Vote(first, second, third);
	  firstChoice.replace(first, firstChoice.get(first) + 1);
	  secondChoice.replace(second, secondChoice.get(second) + 1);
	  thirdChoice.replace(third, thirdChoice.get(third) + 1);
  }
  
  public void addCandidate(String candidate) {
	  if (ballot.contains(candidate)){
		  //throw<error>;
	  }
	  else {
		  ballot.add(candidate);
		  firstChoice.put(candidate, 0);
		  secondChoice.put(candidate, 0);
		  thirdChoice.put(candidate, 0);
	  }
  }
  
  public String findWinnerMostPoints() {
	  firstChoice.get()
  }
  
  public void screen() {
    this.printBallot();
    System.out.println("Who do you want to vote for?");
    String candidate = keyboard.next();
    votes.add(candidate);
    System.out.println("You voted for " + candidate);
  }
  
  public int countVotes(String forcand) {
    int numvotes = 0;
    for (String s : votes) {
      if (s.equals(forcand))
        numvotes = numvotes+1;
    }
    return numvotes;
    }
  }