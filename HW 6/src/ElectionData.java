import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;


class ElectionData {
	
  LinkedList<String> ballot = new LinkedList<String>();
  HashMap<String,Vote> firstChoice = new HashMap<String,Vote>();
  HashMap<String,Vote> secondsChoice = new HashMap<String,Vote>();
  HashMap<String,Vote> thirdChoice = new HashMap<String,Vote>();
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