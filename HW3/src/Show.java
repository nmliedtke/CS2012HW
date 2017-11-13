import java.util.LinkedList;

class Show {

	String title;
	double broadcastTime;
	LinkedList<Episode> episodes;
	double avgLength;
	
	Show(String title, double broadcastTime, LinkedList<Episode> episodes)
	{
		this.title = title;
		this.broadcastTime = broadcastTime;
		this.episodes = episodes;
	}
	
	public void setAvgLength(double avgLength)
	{
		this.avgLength = avgLength;
	}
	
	public double avgRuntime() {
		double sum = 0;
		int total = 0;
		double avg;
		for(Episode epi: this.episodes) {
			sum = epi.runTime + sum;
			total = total + 1;
		}
		avg = sum / total;
		return avg;
	}
	
}
