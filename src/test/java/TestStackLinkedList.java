import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestStackLinkedList {

	private StackLinkedList stackll;
	
	@Before
	public void setUp()
	{
		stackll = new StackLinkedList();
	}
	
	@Test
	public void testPush()
	{
		stackll.push(30);					// stack is : 30 50 20 90
		stackll.push(50);
		stackll.push(20);
		stackll.push(90);
		int expectedResult = 90;
		int result = stackll.head.key;			// testing the top of stack
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testTop()
	{
		stackll.push(30);					// stack is : 30 50 20 90 100
		stackll.push(50);
		stackll.push(20);
		stackll.push(90);
		stackll.push(100);
		int expectedResult = 100;
		int result = stackll.top();
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testTopNull()
	{
	
		int expectedResult = -1;
		int result = stackll.top();
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testPop()
	{
		stackll.push(30);					// stack is : 30 50 20 90 100
		stackll.push(50);
		stackll.push(20);
		stackll.push(90);
		stackll.push(100);
		int expectedResult = 100;
		int result = stackll.pop();
		assertTrue(expectedResult == result);
	}
	
	@Test
	public void testPopNull()
	{
		int expectedResult = -1;
		int result = stackll.pop();
		assertTrue(expectedResult == result);
	}
	
	@Test
	public void testSize()
	{
		stackll.push(30);					// stack is : 30 50 20 90 100
		stackll.push(50);
		stackll.push(20);
		stackll.push(90);
		stackll.push(100);
		int expectedSize = 5;
		int result = stackll.getSize();
		assertEquals(expectedSize,result);
		
	}
	
	@Test
	public void testDisplay()
	{
		stackll.push(30);					// stack is : 30 50 20 90 100
		stackll.push(50);
		stackll.push(20);
		stackll.push(90);
		stackll.push(100);
		stackll.display();
		int expectedResult = 100;
		assertEquals(expectedResult,stackll.head.key);
	}
	
	@Test
	public void testDisplayEmptyStack()			// checking wether the stack is empty
	{
		boolean temp = false;
		if(stackll.head == null)
		{
			temp = true;
		}
		boolean expected = true;
		assertTrue(expected == temp);
	}
	
	
}
