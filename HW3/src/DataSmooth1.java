import java.util.LinkedList;

class DataSmooth1 {
  DataSmooth1(){}
  
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	  LinkedList<Double> notSmoothList = new LinkedList<Double>();

	  for(Show ashow: shows) { 
		  notSmoothList.add(ashow.avgRuntime());
	  }
	  return smooth(notSmoothList);
	  
	  }
  
  public LinkedList<Double> smooth(LinkedList<Double> List){
	  LinkedList<Double> resultList = new LinkedList<Double>();
	  for(int i = 0; i < (List.size()); i++) {
		  if (i == 0 || i == (List.size() - 1)) {
			  resultList.add(List.get(i));
		  }
		  else {
			  resultList.add((List.get(i) + List.get(i - 1) + List.get(i + 1)) / 3);
		  }
	  }
	  return resultList;
  }
  
}