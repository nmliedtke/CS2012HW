import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Examples {
	

	    HeapTester HT = new HeapTester();
	    IHeap node1 = new DataHeap(5);
	    IHeap node2 = new DataHeap(7);
	    IHeap heap1 = new DataHeap(2, node1, node2);
	    
	    MtBT emptyNode = new MtBT();
	    
	    
	    IBinTree node3 = new DataBT(10);
	    IBinTree node4 = new DataBT(23);
	    IBinTree node5 = new DataBT(9, node3, node4);
	    IBinTree node6 = new DataBT(8);
	    IBinTree node7 = new DataBT(7, node6, node5);

	    IBinTree node8 = new DataBT(5);
	    IBinTree node9 = new DataBT(4, node8, node7);
	    IBinTree node10 = new DataBT(3);
	    IBinTree node11 = new DataBT(2, emptyNode, node10);
	    IBinTree myBinTree = new DataBT(1, node9, node11);

	    
	
	    Examples(){


	 }
	    
	    @Test
	    public void test1(){
	    	IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);

	   
	      assertTrue(HT.addEltTester(myHeap,5,myHeap.addElt(5)));

	    }
	    
	    @Test
	    public void test2(){
	    IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);

	    
	      assertTrue(HT.addEltTester(myHeap,5,myBinTree));

	    }
	    

	    

	    @Test
	    public void test3(){
	    	IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);


	        assertTrue(HT.addEltTester(myHeap, 8, myBinTree));
	    }   
}
