import java.util.LinkedList;

class ShowManager1{
	
	ShowManager1() {}

	// takes a list of shows and produces a show summary which contains a list of all Daytime shows 
	// and a list of all Primetime shows in the given list
	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		LinkedList<Show> returnListDay = new LinkedList<Show>();
		LinkedList<Show> returnListNight = new LinkedList<Show>();
		for(Show show: shows) {
			if (600 <= show.broadcastTime && 1700 > show.broadcastTime) {
				returnListDay.add(show);
			}
			if (1700 <= show.broadcastTime && 2300 > show.broadcastTime) {
				returnListNight.add(show);
			}
		}
		ShowSummary report = new ShowSummary(returnListDay, returnListNight);
		return report;
	}
	
}
