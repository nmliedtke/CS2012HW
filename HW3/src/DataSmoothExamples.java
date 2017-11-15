import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples 
{  
  LinkedList<Show> shows = new LinkedList<Show>();
  LinkedList<Show> shows1 = new LinkedList<Show>();
  LinkedList<Double> showResults = new LinkedList<Double>();
  LinkedList<Double> showResults1 = new LinkedList<Double>();
  DataSmooth1 D1 = new DataSmooth1();

  
  public DataSmoothExamples() 
  {
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		shows.add(new Show("Star Trek", 1800, eps1));
		shows1.add(new Show("Star Trek", 1800, eps1));

		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		shows.add(new Show("Futurama", 1900, eps2));
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		shows.add(new Show("Animaniacs", 1630, eps3));
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		shows.add(new Show("Sesame Street", 900, eps4));
		shows1.add(new Show("Sesame Street", 900, eps4));

	    showResults.add(60.0);
	    showResults.add(29.75);
	    showResults.add(29.08333);
	    showResults.add(58.0);
	    
	    showResults1.add(60.0);
	    showResults1.add(58.0);


  }
  
  @Test
  public void instructorTestDS() 
  {
	  LinkedList<Double> runtimes1 = D1.dataSmooth(shows);
	  LinkedList<Double> runtimes2 = D1.dataSmooth(shows1);
	  LinkedList<Double> runtimes3 = D1.dataSmooth(shows1);


	  for(int i = 0; i < runtimes1.size(); i++)
	  {
		  assertEquals(runtimes1.get(i), showResults.get(i), .01);
	  }
	  
	  for(int i = 0; i < runtimes2.size(); i++)
	  {
		  assertEquals(runtimes2.get(i), showResults1.get(i), .01);
	  }
	  
	  for(int i = 0; i < runtimes3.size(); i++)
	  {
		  assertEquals(runtimes3.get(i), showResults1.get(i), .01);
	  }

  }
  
  //the dataSmooth function has the following subtasks:
  // - average all of the runtimes of a show's epsiodes
  // - make a list of average runtimes from a list of shows
  // - "smooth" the data by averaging a datum with the data points around it, leaving 
  // the first and last datum alone
  // - return the list of "smoothed" data
}