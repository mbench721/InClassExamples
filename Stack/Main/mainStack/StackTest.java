package mainStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testPush() {
	   Stack stack = new Stack();
	   stack.push(1);
	   assertEquals(1,stack.peek());
	   stack.push(2);
	   assertEquals(2,stack.peek());
	   assertEquals(2,stack.pop());
	   assertEquals(1,stack.pop());
	   assertTrue(stack.isEmpty());
	}
	@Test
	public void testPop() {
		   
	}
	@Test
	public void testPeek() {
		   
	}
	@Test
	public void testIsEmpty() {
		   
	}


}
