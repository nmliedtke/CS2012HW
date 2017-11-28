
public class HeapTester {
	  boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
		    //...code to compare hOrig and hAdded around the addition of elt as appropriate...
		  boolean one = hAdded.hasElt(elt);
		  
		  boolean two = hAdded.isHeap();
		 // boolean two = true;
		  boolean three = hAdded.contains(hOrig);
		 // boolean three = true;
		  boolean four = ((hOrig.size() + 1) == hAdded.size());
		  //boolean four = true;
		  return (one && two && three && four);
		  }
	  // hasElt(elt, hAdded) check if elt is in the hAdded
	  // is hAdded a heap
	  // are all of the other elt in hOrig in the hAdded
	  // is the size correct
	  
	  boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {

		    //...code to compare hOrig and hRemoved as appropriate...
		  boolean one = !hRemoved.hasElt(hOrig.getData());
		  boolean two = hOrig.contains(hRemoved);
		  boolean three = hRemoved.isHeap();
		  boolean four = ((hOrig.size() == hRemoved.size() + 1));
		  return (one && two && three && four);
		  }
}
