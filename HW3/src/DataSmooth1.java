import java.util.LinkedList;

class DataSmooth1 {
  DataSmooth1(){}
  
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	  LinkedList<Double> notSmoothList = new LinkedList<Double>();
	  for(Show ashow: shows) { 
		  notSmoothList.add(ashow.avgRuntime());
	  }
	  for(Double num: notSmoothList) { // # of shows minus 2 and start at item 2
		  
	  }
	  
  }
  
}