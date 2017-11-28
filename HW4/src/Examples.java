import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Examples {
	

	    HeapTester HT = new HeapTester();
	    IHeap node1 = new DataHeap(5);
	    IHeap node2 = new DataHeap(7);
	    IHeap myHeap = new DataHeap(2, node1, node2);
	    
	    MtBT emptyNode = new MtBT();
	    DataBT node3 = new DataBT(10);
	    DataBT node4 = new DataBT(23);
	    DataBT node5 = new DataBT(9, node3, node4);
	    DataBT node6 = new DataBT(8);
	    DataBT node7 = new DataBT(7, node6, node5);

	    DataBT node8 = new DataBT(5);
	    DataBT node9 = new DataBT(4, node8, node7);
	    DataBT node10 = new DataBT(3);
	    DataBT node11 = new DataBT(2, emptyNode, node10);
	    DataBT myBinTree = new DataBT(1, node9, node11);

	    
	
	    Examples(){
			 
	    	myHeap.addElt(4);
	    	myHeap.addElt(3);
	    	myHeap.addElt(1);
	    	myHeap.addElt(23);
	    	myHeap.addElt(10);
	    	myHeap.addElt(9);

	 }
	    
	    @Test
	    public void test1(){
	   
	      assertTrue(HT.addEltTester(myHeap,5,myHeap.addElt(5)));

	    }

	    @Test
	    public void test3(){
			 
	    	myHeap.addElt(4);
	    	myHeap.addElt(3);
	    	myHeap.addElt(1);
	    	myHeap.addElt(23);
	    	myHeap.addElt(10);
	    	myHeap.addElt(9);
	    	assertEquals(myHeap.size(), 3);
	        //assertTrue(HT.addEltTester(myHeap, 8, myBinTree));
	    }   
}
