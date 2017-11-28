import java.util.LinkedList;

class DataBT implements IBinTree {
 int data;
 IBinTree left;
 IBinTree right;

 DataBT(int data, IBinTree left, IBinTree right) {
  this.data = data;
  this.left = left;
  this.right = right;
 }
 
 // an alternate constructor for when both subtrees are empty
 DataBT(int data) {
   this.data = data;
   this.left = new MtBT();
   this.right = new MtBT();
 }
 
 public boolean contains(IBinTree given) {
	 LinkedList<Integer> givenList = given.makeList();
	 LinkedList<Integer> originalList = this.makeList();
	 for(Integer num1: givenList) {
		 if(!originalList.contains(num1)) {
			 return false;
		 }
	 }
	 return true;
 }
 
 public int getData() {
	 return this.data;
 }
 
 public LinkedList<Integer> makeList(){
		LinkedList<Integer> resultList = new LinkedList<Integer>();
		if (this.size() > 0){
		this.addToList(resultList);

		//resultList.add(this.data);
		//resultList.add(this.left.getData());
		//resultList.add(this.right.getData());
		}
		return resultList;
	}
 
 public void addToList(LinkedList<Integer> list){

		list.add(this.data);
		this.left.addToList(list);
		this.right.addToList(list);
	}
 
 // determines whether this node or node in subtree has given element
 public boolean hasElt(int e) {
  return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
 }

 // adds 1 to the number of nodes in the left and right subtrees
 public int size() {
  return 1 + this.left.size() + this.right.size();
 }

 // adds 1 to the height of the taller subtree
 public int height() {
  return 1 + Math.max(this.left.height(), this.right.height());
 }
}