
public class Vote {
	
	private String firstChoice;
	private String secondChoice;
	private String thirdChoice;
	
	Vote(String firstChoice, String secondChoice, String thirdChoice){
		this.firstChoice = firstChoice;
		this.secondChoice = secondChoice;
		this.thirdChoice = thirdChoice;
	}
	
	String getFirstChoice() {
		return this.firstChoice;
	}
	
	String getSecondChoice() {
		return this.secondChoice;
	}
	
	String getThirdChoice() {
		return this.thirdChoice;
	}

}
