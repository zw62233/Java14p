public class Node{
	private int val;
	private Node next;
	
	Node(int val,Node next){
		this.val = val;
		this.next = next;
	}
	 
	 Node(int val){
		 this(val,null);
	 }
	 
	 @Override
	 public String toString(){
		 return String.format(val);
	 }
}