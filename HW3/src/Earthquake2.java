import java.util.LinkedList;

class Earthquake2 {
  Earthquake2(){}
      
  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

  // takes a list of data and produces a list of MaxHzReport for the given month 
  // the MaxHzReport contains a date and the max reading for that day.
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data,
                                                  int month) {
	  
	LinkedList<Double> cleanedData = new LinkedList<Double>();
	boolean inMonth = false;
	
	for(int i = 0; i < data.size(); i++) {
		if(inMonth) {
			if(isDate(data.get(i))) {
				if(extractMonth(data.get(i)) != month) {
					inMonth = false;
				}
			}
			else {
				cleanedData.add(data.get(i));
			}
			
		}
		else {
			if(isDate(data.get(i))) {
				if(extractMonth(data.get(i)) == month) {
					inMonth = true;
					cleanedData.add(data.get(i));
				}
			}
		}
	}
	

	
	double max = 0;
	double date = 0;
	LinkedList<MaxHzReport> resultList = new LinkedList<MaxHzReport>();
	
	for(int i = 0; i < cleanedData.size(); i++) {
		if(isDate(cleanedData.get(i))) {
			if(date == 0) {
				date = cleanedData.get(i);
			}
			else if(date > 0){
				  resultList.add(new MaxHzReport(date, max));
				  date = cleanedData.get(i);
				  max = 0;
			}
		}
		else {
			 if (date != 0) {
				  if(max < cleanedData.get(i)) {
					  max = cleanedData.get(i);
				  }
			  }
		}
 
	}
 	resultList.add(new MaxHzReport(date, max));
	return resultList;
	
  }
}