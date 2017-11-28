import java.util.LinkedList;

class MtBT implements IBinTree {
 MtBT(){}

 // returns false since empty tree has no elements
 public boolean hasElt(int e) {
  return false;
 }

 // returns 0 since enpty tree has no elements
 public int size() {
  return 0;
 }
 
 public LinkedList<Integer> makeList(){
	 LinkedList<Integer> resultList = new LinkedList<Integer>();
	 return resultList;
 }
 
 
 
 public void addToList(LinkedList<Integer> list) {};
 
 public int getData() {
	 return -999;
 }

 // returns 0 since empty tree has no branches
 public int height() {
  return 0;
 }
 public boolean contains(IBinTree given) {
	 if (given.size() == 0) {
		 return true;
	 }
	 else return false;
 }
}