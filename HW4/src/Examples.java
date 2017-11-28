import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Examples {
	

	    HeapTester HT = new HeapTester();
	    IHeap node1 = new DataHeap(8);
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
	    
	    IBinTree node12 = new DataBT(10);
	    IBinTree node13 = new DataBT(23);
	    IBinTree node14 = new DataBT(9, node12, node13);
	    IBinTree node15 = new DataBT(8);
	    IBinTree node16 = new DataBT(7, node15, node14);
	    IBinTree node18 = new DataBT(4, emptyNode, node16);
	    IBinTree node19 = new DataBT(3);
	    IBinTree myBinTree2 = new DataBT(2, node18, node19);
	    
	    IBinTree node20 = new DataBT(10);
	    IBinTree node21 = new DataBT(23);
	    IBinTree node22 = new DataBT(9, node20, node21);
	    IBinTree node23 = new DataBT(8);
	    IBinTree node24 = new DataBT(7, node23, node22);
	    IBinTree node26 = new DataBT(4, node24, emptyNode);
	    IBinTree myBinTree3 = new DataBT(3, node26, emptyNode);

	    
	
	    Examples(){


	 }
	    
	    @Test
	    public void test1(){
	    	IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);

	   
	      assertTrue(HT.addEltTester(myHeap,18,myHeap.addElt(18)));

	    }
	    
	


	    @Test
	    public void test3(){
	    	IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);


	        assertTrue(HT.addEltTester(myHeap, 5, myBinTree));
	    }   
	    
	    @Test
	    public void test4(){
	    	IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);

	   
	      assertFalse(HT.addEltTester(myHeap,12,myHeap.addElt(5)));

	    }
	    
	    @Test
	    public void test5(){
	    	IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);

	   
	      assertTrue(HT.addEltTester(myHeap,15,myHeap.addElt(15)));

	    }
	    
	    @Test
	    public void test6(){
	    IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);

	   // assertEquals(myBinTree2.size(), 8);
	    //assertTrue(myBinTree2.isHeap());
	    //assertTrue(myHeap.contains(myBinTree2));
	      assertTrue(HT.remMinEltTester(myHeap,myBinTree2));

	    }
	    
	    @Test
	    public void test7(){
	    IHeap myHeap = heap1.addElt(4).addElt(3).addElt(1).addElt(23).addElt(10).addElt(9);

	    
	      assertTrue(HT.remMinEltTester(myHeap.remMinElt(),myBinTree3));

	    }
	    
}
