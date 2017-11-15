import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
  Earthquake1 E1 = new Earthquake1();
  Earthquake1 E2 = new Earthquake1();
  Earthquake1 E3 = new Earthquake1();

  LinkedList<Double> noData = new LinkedList<Double>();
  LinkedList<Double> threeDates = new LinkedList<Double>();  
  LinkedList<Double> secondDates = new LinkedList<Double>(); 
  LinkedList<Double> lastDates = new LinkedList<Double>(); 
  LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> MayReports = new LinkedList<MaxHzReport>(); 
  LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();




  
  public EarthquakeExamples() {
    threeDates.add(20151013.0);
    threeDates.add(10.0);
    threeDates.add(5.0);
    threeDates.add(20151020.0);
    threeDates.add(40.0);
    threeDates.add(50.0);
    threeDates.add(45.0);
    threeDates.add(20151101.0);
    threeDates.add(6.0);
   
    secondDates.add(20150401.0);
    secondDates.add(32.0);
    secondDates.add(20150501.0);
    secondDates.add(12.0);
    secondDates.add(15.0);
    secondDates.add(20150512.0);
    secondDates.add(23.0);
    secondDates.add(15.0);
    secondDates.add(20150601.0);
    secondDates.add(2.0);
    
    lastDates.add(20150401.0);
    lastDates.add(32.0);
    lastDates.add(20150501.0);
    lastDates.add(12.0);
    lastDates.add(15.0);
    lastDates.add(20150512.0);
    lastDates.add(23.0);
    lastDates.add(15.0);
    lastDates.add(20150601.0);
    lastDates.add(2.0);
    lastDates.add(20151212.0);
    lastDates.add(23.0);
    lastDates.add(15.0);
    lastDates.add(20151213.0);
    lastDates.add(2.0);
    lastDates.add(20151214.0);
    lastDates.add(23.0);
    lastDates.add(83.0);
    lastDates.add(20151221.0);
    lastDates.add(15.0);

    
    NovReports.add(new MaxHzReport(20151101.0,6.0));
    MayReports.add(new MaxHzReport(20150501.0,15.0));
    MayReports.add(new MaxHzReport(20150512.0,23.0));
    DecReports.add(new MaxHzReport(20151212.0,23.0));
    DecReports.add(new MaxHzReport(20151213.0,2.0));
    DecReports.add(new MaxHzReport(20151214.0,83.0));
    DecReports.add(new MaxHzReport(20151221.0,15.0));


  }

  @Test
  public void instructorTestEQ() { 
    assertEquals(NovReports, 
                 E1.dailyMaxForMonth(threeDates, 11));
    
    assertEquals(MayReports, E2.dailyMaxForMonth(secondDates, 5));
    assertEquals(DecReports, E3.dailyMaxForMonth(lastDates, 12));

  }

  // the subtasks for dailyMaxForMonth are as follows:
  // - identify dates compared to data points.
  // - ignore dates in the data that aren't in the given month
  // - identify the max reading for a specific day
  // - make a new MaxHzReport for a date and its max reading
  // - add the new MaxHzReports to a list to be returned
}
