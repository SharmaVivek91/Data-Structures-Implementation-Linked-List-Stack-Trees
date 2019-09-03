class Element{
	Element next;
	Element prev;
	int data;
	public Element(int data) {
		this.data = data;
	}
}
/* This class implements stack using a doubly linked list
 * Author - Vivek Sharma 
 * Date - 9/2
 */
public class Stack {
    Element ptr;
    Element start =null;
    Element last =null;
	public void push(int data) {
		// add the first element to the stack
		if(start == null) {
			start = new Element(data);
			ptr = start;
			ptr.prev =null;
		}
		else {
			ptr.next = new Element(data);
			last =ptr.next;
			last.prev = ptr;
			ptr = ptr.next;
		}
	}
	public void dispalyStack() {
		//if stack is empty
		if(start ==null) {
			System.out.println("stack is empty");
		}
		ptr = start;
		while(ptr!=null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	public void peek() {
		System.out.println("Peek operation");
		//As the last contains the pointer to the last node
		System.out.println(last.data);
	}
	
	public void pop() {
		System.out.println("Pop Operation");
	    last = last.prev;
		ptr = last;
	}
	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push(1);
		st.push(7);
		st.push(3);
		st.push(2);
		st.push(5);
		st.dispalyStack();
		System.out.println("peek");
		st.peek();
		st.pop();
		st.push(4);
		st.dispalyStack();

	}

}
