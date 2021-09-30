import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {

	private LinkedList LList;
	
	@Before
	public void setUp()
	{
		LList = new LinkedList();
	}
	
	@Test
	public void testPushFront()
	{
		LList.pushFront(4);			// list : 5 1 6 2 4
		LList.pushFront(2);		
		LList.pushFront(6);
		LList.pushFront(1);
		LList.pushFront(5);
		int expectedResult = 5;
		assertEquals(expectedResult,LList.head.key);
	}
	
	@Test
	public void testPushBack()
	{
		LList.pushFront(4);			// Before push : 5 1 6 2 4
		LList.pushFront(2);			// After Push : 5 1 6 2 4 10
		LList.pushFront(6);
		LList.pushFront(1);
		LList.pushFront(5);
		LList.pushBack(10);
		int expectedResult = 10;
		int result = LList.head.next.next.next.next.next.key;
		assertEquals(expectedResult,result);
	}
	
	@Test 
	public void testPushBackEmppty()
	{
		LList.pushBack(2);
		int expectedResult = 2;
		assertEquals(expectedResult,LList.head.key);
	}
	
	@Test
	public void testSwapNodes()
	{
		LList.pushFront(8);			// Before Swapping : 14 1 12 2 8 10
		LList.pushFront(2);			// After Swapping : 10 1 12 2 8 14
		LList.pushFront(12);
		LList.pushFront(1);
		LList.pushFront(14);
		LList.pushBack(10);
		LList.swap();					// swapping first and last node
		int expectedHead = 10;
		int expectedLastNode = 14;
		int lastNode = LList.head.next.next.next.next.next.key;
		assertEquals(expectedHead,LList.head.key);
		assertEquals(expectedLastNode,lastNode);
	}
	
	@Test
	public void testDisplayFull()			// Testing for Filled list
	{
		boolean temp = false;
		LList.pushFront(4);			
		LList.pushFront(2);		
		LList.pushFront(6);
		LList.pushFront(1);
		LList.pushFront(5);
		LList.pushBack(9);
		LList.pushBack(3);
		LList.display();
		if(LList.head==null)
		{
			temp = true;
		}
		boolean expectedResult = false;
		assertTrue(expectedResult == temp);
	}
	
	@Test
	public void testDisplayEmpty()			// Testing for Filled list
	{
		boolean temp = false;
		LList.display();
		if(LList.head==null)
		{
			temp = true;
		}
		boolean expectedResult = true;
		assertTrue(expectedResult == temp);
	}

}
