import java.util.LinkedList;

class DataSmooth2 {
  DataSmooth2(){}
  
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	  LinkedList<Double> smoothList = new LinkedList<Double>();

	  for(int i = 1; i < shows.size() - 1; i++ ) {
		  smoothList.add((shows.get(i).avgRuntime() + shows.get(i-1).avgRuntime() + shows.get(i+1).avgRuntime()) / 3);
	  }
	  return smoothList;

  }
}