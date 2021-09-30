import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCircularLinkedList {
	

	private CircularLinkedList list;
	
	@Before()
	public void setUp()
	{		
		list = new CircularLinkedList();
	
	}

	@Test
	public void testPushFront()
	{
		list.pushFront(4);				//  list:  5 1 6 2 4 
		list.pushFront(2);
		list.pushFront(6);
		list.pushFront(1);
		list.pushFront(5);
		int expectedResult = 5;								// head
		assertEquals(expectedResult,list.head.key);
		
	}
	
	@Test
	public void testPushBackEmptyList()
	{
		list.pushBack(23);
		int expectedResult = 23;
		assertEquals(expectedResult,list.head.key);
	}
	
	@Test
	public void testPushBackOneElement()
	{
		list.pushFront(21);
		list.pushBack(43);
		int expectedResult = 21;
		assertEquals(expectedResult,list.head.key);
	}
	@Test
	public void testPushBack()
	{
		list.pushFront(4);				// Before push : 5 1 6 2 4 
		list.pushFront(2);				// After push : 5 1 6 2 4 9 
		list.pushFront(6);
		list.pushFront(1);
		list.pushFront(5);
		list.pushBack(9);
		int expectedResult = 9;
		int result = list.head.next.next.next.next.next.key;
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testPopFront()					
	{
		list.pushFront(4);			// Before pop : 5 1 6 2 4 9 3
		list.pushFront(2);			// After Pop : 1 6 2 4 9 3
		list.pushFront(6);
		list.pushFront(1);
		list.pushFront(5);
		list.pushBack(9);
		list.pushBack(3);
		list.popFront();
		int expectedResult = 1;
		assertEquals(expectedResult,list.head.key);
	}
	
	@Test
	public void testPopFrontEmptyList()
	{
		list.popFront();
		boolean temp = false;
		if(list.head == null)
		{
			temp = true;
		}
		boolean expectedResult = true;
		assertTrue(expectedResult == temp);
	}
	
	@Test
	public void testPopFrontOneElement()
	{
		list.pushFront(22);
		list.popFront();
		boolean result = false;
		if(list.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	@Test
	public void testPopBack()
	{
		list.pushFront(4);				// Before pop : 5 1 6 2 4 
		list.pushFront(2);				// After pop : 5 1 6 2 
		list.pushFront(6);
		list.pushFront(1);
		list.pushFront(5);
		list.popBack();
		int expectedResult = 2;
		int result = list.head.next.next.next.key;
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testPopBackEmptyList()
	{
		list.popBack();
		boolean temp = false;
		if(list.head == null) 
		{
			temp = true;
		}
		boolean expectedResult = true;
		assertTrue(expectedResult == temp);
	}
	
	@Test
	public void testPopBackOneElement()
	{
		list.pushBack(22);
		list.popBack();
		boolean result = false;
		if(list.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	@Test
	public void testDisplayFull()			// Testing for Filled list
	{
		boolean temp = false;
		list.pushFront(4);			
		list.pushFront(2);		
		list.pushFront(6);
		list.pushFront(1);
		list.pushFront(5);
		list.pushBack(9);
		list.pushBack(3);
		list.display();
		if(list.head==null)
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
		if(list.head==null)
		{
			temp = true;
		}
		boolean expectedResult = true;
		assertTrue(expectedResult == temp);
	}
	
	

}
