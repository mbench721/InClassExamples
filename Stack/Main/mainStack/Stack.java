package mainStack;

import java.util.ArrayList;

/**
 * Provides a stack abstraction
 * @author mbench
 *
 */
public class Stack {
	private class Node{
		Object obj = null;
		Node next = null;

		public Node(Object obj, Node next){
			this.obj = obj;
			this.next = next;
		}

		public Node getNext() {
			return next;
		}

		public Object getObj() {
			return obj;
		}
	}
	private Node top = null;

	
	/**
	 * pushes an object on the stack
	 * @param obj object to be pushed
	 */
	public void push(Object obj){
		Node node = new Node(obj, top);
		top = node;
	}

	/**
	 * pops an object from the stack
	 * @return top object of the stack
	 */

	public Object pop(){
		Node node = top;
		top = node.getNext();
		return node.getObj();
	}

	/**
	 * peeks at the top object in the stack without removing
	 * @return top object of the stack
	 */
	public Object peek(){
		return top.getObj();

	}

	/**
	 * Determines if the stack is empty
	 * 
	 * @return True iff stack is empty
	 */
	public Boolean isEmpty(){
		return top == null;
	}

}
