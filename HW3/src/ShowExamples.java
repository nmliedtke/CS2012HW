import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Show> shows1 = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();
	ShowSummary report3 = new ShowSummary();

	
	public ShowExamples()
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		Show s1 = new Show("Star Trek", 1800, eps1);
		shows.add(s1);
		report1.primetime.add(s1);
		report3.primetime.add(s1);

		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		Show s2 = new Show("Futurama", 1900, eps2);
		shows.add(s2);
		report1.primetime.add(s2);
		report3.primetime.add(s2);

		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		Show s3 = new Show("Animaniacs", 1630, eps3);
		shows.add(s3);
		report1.daytime.add(s3);
		report3.daytime.add(s3);

		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		Show s4 = new Show("Sesame Street", 900, eps4);
		shows.add(s4);
		report1.daytime.add(s4);
		report3.daytime.add(s4);

		LinkedList<Episode> eps5 = new LinkedList<Episode>();
		eps5.add(new Episode("The Letter W", 59));
		eps5.add(new Episode("The Letter P", 57));
		eps5.add(new Episode("The Letter I", 58));
		Show s5 = new Show("Sesame Street", 100, eps5);
		shows.add(s5);
		shows1.add(s5);
		report3.daytime.add(s5);

		LinkedList<Episode> eps6 = new LinkedList<Episode>();
		eps6.add(new Episode("The Letter W", 59));
		eps6.add(new Episode("The Letter P", 57));
		eps6.add(new Episode("The Letter I", 58));
		Show s6 = new Show("Sesame Street", 599, eps6);
		shows.add(s6);
		Show s7 = new Show("Sesame Street", 600, eps6);
		shows.add(s7);		
		report1.daytime.add(s7);
		report3.daytime.add(s7);

		Show s8 = new Show("Sesame Street", 1699, eps6);
		shows.add(s8);		
		report1.daytime.add(s8);
		report3.daytime.add(s8);
		
		Show s9 = new Show("Sesame Street", 1700, eps6);
		shows.add(s9);		
		report1.primetime.add(s9);
		report3.primetime.add(s9);
		
		Show s10 = new Show("Sesame Street", 2299, eps6);
		shows.add(s10);		
		report1.primetime.add(s10);
		report3.primetime.add(s10);
		
		Show s11 = new Show("Sesame Street", 2300, eps6);
		shows.add(s11);		
		
	}
	
	@Test
	public void instructorTestOrganizeShows() 
	{
		ShowSummary report2 = sm1.organizeShows(shows);
		ShowSummary report4 = sm1.organizeShows(shows1);
		ShowSummary report6 = new ShowSummary();


		assertEquals(report1, report2);
		
		assertFalse(report3.equals(report2));
		
		assertEquals(report4, report6);
	}

	// the subtasks for the organizeShows are as follows:
	// - separate the given list into PrimeTime and DayTime shows
	// - ignore shows that are not PrimeTime or DayTime
	// - create a showSummary with a list of DayTime and PrimeTime shows
	// 
}
