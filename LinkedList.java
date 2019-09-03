class Node{
	Node next;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
/* This class implements a single linked list
 * Author - Vivek Sharma
 * Date - 9/2
 */
public class LinkedList {
	
	Node ptr =null;
	Node start = null;
	int size =0;
	
	//This method adds a node to the linked list
	public void addData(int data){
		if(start == null) {
			// First Node
			Node n = new Node(data);
			start =n;
			ptr = n;
			size++;
		}
		else {
			// Not the first node
			ptr.next = new Node(data);
			ptr = ptr.next;
			size++;
			
		}
	}
	//This method is used to display all the nodes in the linked list
	public void displayList() {
	
		if(start == null) {
			System.out.println("list is empty");
		}
		else {
			ptr = start;
			while(ptr!=null) {
				System.out.println(ptr.data);
				ptr = ptr.next;
			}
		}
		
	}
	
	public void remove(int data) {
		System.out.println("New List after deletion is:");
		ptr = start;
		Node prev =null;
		while(ptr!=null) {
			if(ptr.data==data) {
				// if it is the first node
				if(ptr ==start) {
					start = ptr.next;
					return;		
				}
				// if node is not the first node 
				prev.next = ptr.next;
				
				//decrease the size
				size--;
				
			}
			prev = ptr;
			ptr = ptr.next;
		}
	}
    public void size() {
    	System.out.println("ListSize is:"+size);
    }
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.addData(1);
		ll.addData(3);
		ll.addData(4);
		ll.addData(2);
		ll.addData(7);
		ll.displayList();
		ll.remove(7);
		ll.displayList();
		ll.size();
		
	}

}
