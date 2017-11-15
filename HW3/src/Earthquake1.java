import java.util.LinkedList;

class Earthquake1 {
  Earthquake1(){}

  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }
 
  // takes a list of data and produces a list of MaxHzReport for the given month 
  // the MaxHzReport contains a date and the max reading for that day.
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
	  LinkedList<MaxHzReport> resultList = new LinkedList<MaxHzReport>();
	  double max = 0;
	  double date = 0;

	  for(int i = 0; i < data.size(); i++) {
		  if(isDate(data.get(i))) {
			  if(extractMonth(data.get(i)) == month) {
				  if(date == 0) {
					  date = data.get(i);
				  }
				  else if(date > 0) {
					  resultList.add(new MaxHzReport(date, max));
					  date = data.get(i);
					  max = 0;
				  }
			  }
		  }
		  else {
			  if (date != 0) {
				  if(max < data.get(i)) {
					  max = data.get(i);			  
			  }
		     }
		    }
		   }
	  resultList.add(new MaxHzReport(date, max));
	  return resultList;
  }
}  
