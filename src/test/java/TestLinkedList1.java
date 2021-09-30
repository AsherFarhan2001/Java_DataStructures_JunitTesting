import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedList1 {

	private LinkedList1 list1;
	private LinkedList1.Node node;
	
	@Before
	public void setUp()
	{
		list1 = new LinkedList1();
		node = new LinkedList1.Node(0);
	}
	
	@Test
	public void testPushFront()
	{
		list1.pushFront(14);			// list : 7 18 9 5 14
		list1.pushFront(5);		
		list1.pushFront(9);
		list1.pushFront(18);
		list1.pushFront(7);
		int expectedResult = 7;
		assertEquals(expectedResult,list1.head.key);
	}
	
	@Test
	public void testPushBack()
	{
		list1.pushFront(14);			// list before : 7 18 9 5 14
		list1.pushFront(5);				// list after : 7 18 9 5 14 20
		list1.pushFront(9);
		list1.pushFront(18);
		list1.pushFront(7);
		list1.pushBack(20);
		int expectedResult = 20;
		int result = list1.head.next.next.next.next.next.key;
		assertEquals(expectedResult,result);
	}
	
	@Test 
	public void testPushBackEmppty()
	{
		list1.pushBack(2);
		int expectedResult = 2;
		assertEquals(expectedResult,list1.head.key);
	}
	
	@Test
	public void testPopFront()
	{
		list1.pushFront(14);			// list before : 7 18 9 5 14 20
		list1.pushFront(5);				// list after :  18 9 5 14 20
		list1.pushFront(9);
		list1.pushFront(18);
		list1.pushFront(7);
		list1.pushBack(20);
		list1.popFront();
		int expectedResult = 18;
		assertEquals(expectedResult,list1.head.key);
	}
	
	@Test
	public void testPopFrontEmpty()
	{
		list1.popFront();
		boolean result = false;
		if(list1.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	
	@Test
	public void testPopBack()
	{
		list1.pushFront(14);			// list before : 7 18 9 5 14 20
		list1.pushFront(5);				// list after :  7 18 9 5 14 
		list1.pushFront(9);
		list1.pushFront(18);
		list1.pushFront(7);
		list1.pushBack(20);
		list1.popBack();
		int expectedResult = 14;
		int lastNode = list1.head.next.next.next.next.key;
		assertEquals(expectedResult,lastNode);
	}
	
	@Test
	public void testPopBackEmpty()
	{
		list1.popBack();
		boolean result = false;
		if(list1.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	
	@Test
	public void testPopBackOneElement()
	{
		list1.pushBack(33);
		list1.popBack();
		boolean result = false;
		if(list1.head == null)
		{
			result = true;
		}
		boolean expected = true;
		assertTrue(expected == result);
	}
	
	@Test
	public void testPopPosition()
	{
		list1.pushFront(14);			// list before : 7 18 9 5 14 20
		list1.pushFront(5);				// list after :  7 18 5 14 20		pop from position 2
		list1.pushFront(9);
		list1.pushFront(18);
		list1.pushFront(7);
		list1.pushBack(20);
		list1.pop(2);
		int expectedResult = 5;
		int result = list1.head.next.next.key;
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testDisplayFull()			// Testing for Filled list
	{
		boolean temp = false;
		list1.pushFront(14);			
		list1.pushFront(5);		
		list1.pushFront(9);
		list1.pushFront(18);
		list1.pushFront(7);
		list1.pushBack(20);
		list1.pushBack(3); 
		list1.display();
		if(list1.head==null)
		{
			temp = true;
		}
		boolean expectedResult = false;
		assertTrue(expectedResult == temp);
	}
	
	@Test
	public void testDisplayEmpty()			// Testing for Empty list
	{
		boolean temp = false;
		list1.display();
		if(list1.head==null)
		{
			temp = true;
		}
		boolean expectedResult = true;
		assertTrue(expectedResult == temp);
	}

}
